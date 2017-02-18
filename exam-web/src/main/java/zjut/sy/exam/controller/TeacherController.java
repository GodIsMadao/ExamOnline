package zjut.sy.exam.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import zjut.sy.model.Exampaper;
import zjut.sy.model.Teacher;
import zjut.sy.service.IPaperService;
import zjut.sy.service.ITeacherService;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 2016/5/4.
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {
    private ITeacherService teacherService;
    private IPaperService paperService;


    public IPaperService getPaperService() {
        return paperService;
    }

    @Inject
    public void setPaperService(IPaperService paperService) {
        this.paperService = paperService;
    }

    public ITeacherService getTeacherService() {
        return teacherService;
    }

    @Inject
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String TeacherRegister(Model model) {
        model.addAttribute("teacher",new Teacher());
        return "user/teacher/register";
    }

    @RequestMapping(value="/register",method=RequestMethod.POST)
    public String TeacherRegister(@Valid Teacher teacher,BindingResult br ,@RequestParam MultipartFile myfile, HttpServletRequest request) throws IOException {
        if(br.hasErrors())
        {
            System.out.println("error");
            return "user/teacher/register";
        }
            if(myfile.isEmpty()){
                System.out.println("文件未上传");
            }else{
                //如果用的是Tomcat服务器，则文件会上传到\\%TOMCAT_HOME%\\webapps\\YourWebProject\\WEB-INF\\upload\\文件夹中
                String realPath = request.getSession().getServletContext().getRealPath("/WEB-INF/upload");
                //这里不必处理IO流关闭的问题，因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉，我是看它的源码才知道的
                FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File(realPath, myfile.getOriginalFilename()));
            }
        teacher.setPic_path("upload/" + myfile.getOriginalFilename());
        teacherService.addTeacher(teacher);
        return "redirect:/login/teacher";
    }


    @RequestMapping(value="/update/{id}",method = RequestMethod.GET)
    public String updateTeacher(Model model,@PathVariable int id){
        Teacher t=teacherService.load(id);
        model.addAttribute("teacher",new Teacher());
        return "user/teacher/setting";
    }

    //新增试卷
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPaper(Model model) {
        model.addAttribute("exampaper", new Exampaper());
        return "paper/teacher/addPaper";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addPaper(@Valid Exampaper paper, BindingResult br, HttpSession session) {
        Teacher teacher = (Teacher) session.getAttribute("loginTeacher");
        if (br.hasErrors()) {
            return "paper/teacher/addPaper";
        }
        Integer pid = teacherService.addPaper(teacher, paper);
        //newpaper里不包含paper的id
        session.setAttribute("newpaper",paper);
        session.setAttribute("newpid", pid);
        return "redirect:/question/teacher/addQuestion";
    }


    @RequestMapping(value="/update/{id}",method=RequestMethod.POST)
    public String updateTeacher(@PathVariable int id,HttpSession session,@Valid Teacher teacher,BindingResult br,@RequestParam MultipartFile myfile, HttpServletRequest request) throws IOException {
        session.removeAttribute("loginTeacher");
        if(br.hasErrors()){
            System.out.println(br.hasErrors());
            return "user/teacher/setting";
        }
        if(myfile.isEmpty()){
            System.out.println("文件未上传");
        }else{
            System.out.println("文件长度: " + myfile.getSize());
            System.out.println("文件类型: " + myfile.getContentType());
            System.out.println("文件名称: " + myfile.getName());
            System.out.println("文件原名: " + myfile.getOriginalFilename());
            System.out.println("========================================");
            //如果用的是Tomcat服务器，则文件会上传到\\%TOMCAT_HOME%\\webapps\\YourWebProject\\WEB-INF\\upload\\文件夹中
            String realPath = request.getSession().getServletContext().getRealPath("/WEB-INF/upload");
            //这里不必处理IO流关闭的问题，因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉，我是看它的源码才知道的
            FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File(realPath, myfile.getOriginalFilename()));
        }
        Teacher t=teacherService.load(id);
        t.setRealname(teacher.getRealname());
        t.setAddress(teacher.getAddress());
        t.setEmail(teacher.getEmail());
        t.setSchool(teacher.getSchool());
        t.setPhone(teacher.getPhone());
        t.setPic_path("upload/" + myfile.getOriginalFilename());
        teacherService.updateInfo(t);
        session.setAttribute("loginTeacher",t);
        return "redirect:/teacher/infocenter";
    }

    @RequestMapping("/{id}")
    public String showTeacherInfo(@PathVariable int id,Model model){
        model.addAttribute("teacher",teacherService.load(id));
        return "user/teacher/show";
    }

    @RequestMapping("/teacher/papers")
    public String showTeacPapers(Model model, HttpSession session) {
        Teacher teacher = (Teacher) session.getAttribute("loginTeacher");
        model.addAttribute("teacherpapers", paperService.findExampaperTeacher(teacher));
        return "paper/teacher/paperlist";
    }

    //查看已发布试卷
    @RequestMapping("/showReleasedPaper")
    public String showReleasedPaper(Model model, HttpSession session) {
        Teacher teacher = (Teacher) session.getAttribute("loginTeacher");
        model.addAttribute("released_papers", paperService.findExampaperReleased(teacher));
        return "paper/teacher/showReleasedPaper";
    }

    //查看待发布试卷（包含已审核待发布和未审核待发布）
    @RequestMapping("/showUnReleasedPaper")
    public String showUReleasedPaper(Model model, HttpSession session) {
        Teacher teacher = (Teacher) session.getAttribute("loginTeacher");
        model.addAttribute("unchecked_papers", paperService.findExampaperUnchecked(teacher));
        model.addAttribute("checked_papers", paperService.findExampaperChecked(teacher));
        return "paper/teacher/showUnReleasedPaper";
    }

    //查看审核不通过的试卷
    @RequestMapping("/showUnpassPaper")
    public String showUnPassPaper(Model model, HttpSession session) {
        Teacher teacher = (Teacher) session.getAttribute("loginTeacher");
        model.addAttribute("unpass_papers", paperService.findExampaperUnpass(teacher));
        return "paper/teacher/showUnpassPaper";
    }
}
