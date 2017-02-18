package zjut.sy.exam.controller;

import net.sf.json.JSONArray;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import zjut.sy.dao.IExampaperDao;
import zjut.sy.dao.StudentDao;
import zjut.sy.exam.dto.StudentDto;
import zjut.sy.model.Student;
import zjut.sy.model.Teacher;
import zjut.sy.service.IPaperService;
import zjut.sy.service.IStudentService;
import zjut.sy.service.ITeacherService;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by dell on 2016/5/1.
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    private IStudentService studentService;
    private ITeacherService teacherService;

    public IStudentService getStudentService() {
        return studentService;
    }

    @Inject
    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }

    public ITeacherService getTeacherService() {
        return teacherService;
    }

    @Inject
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    //把已有的teacher列出来
        private void initAddTeacher(Model model) {
            model.addAttribute("teachers", teacherService.list());
        }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String StudentRegister(Model model) {
        model.addAttribute("student",new Student());
//        initAddTeacher(model);
        model.addAttribute("teachers",teacherService.list());
        return "user/student/register";
    }
    @RequestMapping(value = "/register",method= RequestMethod.POST)
    public String StudentRegister(@Valid Student student,@RequestParam("teacher_name")String teacher_name ,BindingResult br,Model model,@RequestParam MultipartFile myfile, HttpServletRequest request) throws IOException {
        if(br.hasErrors()){
            initAddTeacher(model);
            return "user/student/register";
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
        student.setPicpath("upload/" + myfile.getOriginalFilename());
        Teacher teacher=teacherService.loadTeacherByUsername(teacher_name);
        studentService.add(student,teacher.getId());
        return "redirect:/login/student";
    }

    @RequestMapping(value="/students",method=RequestMethod.GET)
    public String showStudent(Model model,HttpSession session){
        Teacher teacher=(Teacher)session.getAttribute("loginTeacher");
        model.addAttribute("students",teacherService.findStudent(teacher.getId()));
        return "user/student/list";
    }

    //学生-已做问题
    @RequestMapping(value = "/questions/writen")
    public String showStuQueWriten(Model model, HttpSession session) {
        Student student = (Student) session.getAttribute("loginStudent");
        model.addAttribute("stuQueWriten", studentService.listStuQuestion(student));
        return "question/student/writen_questions";
    }

    //学生-已做对问题
    @RequestMapping(value = "/questions/right")
    public String showStuQueRight(Model model, HttpSession session) {
        Student student = (Student) session.getAttribute("loginStudent");
        model.addAttribute("stuQueRight", studentService.listStuQuestionRight(student));
        return "question/student/right_questions";
    }

    //列出该学生已经写过的试卷
    @RequestMapping(value = "/papers/writen")
    public String showStuPapersWriten(Model model, HttpSession session) {
        Student student = (Student) session.getAttribute("loginStudent");
        model.addAttribute("studentpapers", studentService.listStuPaperWrited(student));
//        model.addAttribute("stupaperscore",studentService)
        return "paper/student/writen_papers";
    }

    //列出该学生已经写过的试卷
    @RequestMapping(value = "/teacher/papers/writen")
    public String showTeacherPapersWriten(Model model, HttpSession session) {

//        model.addAttribute("stupaperscore",studentService)
        return "paper/student/teacher_writen_papers";
    }

    //学生-做错问题
    @RequestMapping(value = "/questions/wrong")
    public String showStuQueWrong(Model model, HttpSession session) {
        Student student = (Student) session.getAttribute("loginStudent");
        model.addAttribute("stuQueWrong", studentService.listStuQuestionWrong(student));
        return "question/student/wrong_questions";
    }

    //别人查看你的信息（一部分不显示）
//    @RequestMapping(value="/guest/{id}",method = RequestMethod.GET)
//    public String showGuestStuInfo(Model model,@PathVariable int sid){
//        model.addAttribute(studentService.load(sid));
//        return "user/student/showForGuest";
//    }
//这个show是显示个人的私人信息或者访客查看
    //<%=request.getContextPath%>很重要，否则会缺少 /exam路径
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String showStudentInfo(Model model,@PathVariable int id){
        model.addAttribute("student",studentService.load(id));
        return "user/student/show";
    }

    @RequestMapping(value="/updateself/{id}",method=RequestMethod.GET)
    public String updateStudent(Model model,HttpSession session){
        Student student= (Student) session.getAttribute("loginStudent");
        model.addAttribute(new StudentDto(student));
        model.addAttribute("teachers",teacherService.list());
        return "user/student/setting";
    }

    @RequestMapping(value = "/updateself/{id}",method=RequestMethod.POST)
    public String updateStudent(@Valid StudentDto studentDto,HttpSession session,@PathVariable int id,@RequestParam("teacher_name")String teacher_name,BindingResult br,Model model,@RequestParam MultipartFile myfile, HttpServletRequest request) throws IOException {
        session.removeAttribute("loginStudent");
        if(br.hasErrors()){
            System.out.println(br.hasErrors());
            initAddTeacher(model);
            return "user/student/setting";
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
        Student s1=studentService.load(id);
        System.out.println(s1.getId());
        Teacher teacher=teacherService.loadTeacherByUsername(teacher_name);
        System.out.println(studentDto.getRealname());
        s1.setRealname(studentDto.getRealname());
        s1.setTeacher(teacher);
        System.out.println("1:教师名"+teacher_name+"2:tid:"+teacher.getId());
        s1.setAddress(studentDto.getAddress());
        s1.setPassword(studentDto.getPassword());
        s1.setSchool(studentDto.getSchool());
        s1.setEmail(studentDto.getEmail());
        s1.setPicpath("upload/" + myfile.getOriginalFilename());
        studentService.updateStuInfo(s1);
        System.out.println(s1.getUsername());
        session.setAttribute("loginStudent",s1);
        return "redirect:/student/infocenter";
    }

//    @RequestMapping(value="/exam/{id}",method=RequestMethod.POST)
//    public String examStudent(@)

    @RequestMapping(value="/listScoreFS/{id}")
    public String listScoreFS(@PathVariable int id,Model model){
        List<Integer> listscore=studentService.listStuScore(id);
        model.addAttribute("scorelist",listscore);
        List<String> listpname=studentService.listStudentWritenPname(id);
        //将pname转为json数据
        String pname=JSONArray.fromObject(listpname).toString();
        model.addAttribute("pnamelist",pname);
        //需要加上一个list类型的listStuPapername,待写
//        model.addAttribute("pname",studentService.listStuPaperWrited(studentService.load(id)));
        return "other/charts/listScoreForStu";
    }

    @RequestMapping(value="/listScoreFT/{id}")
    public String listScoreFT(@PathVariable int id,Model model){
        List<Integer> listscore=studentService.listStuScore(id);
        Student student=studentService.load(id);
        model.addAttribute("student",student);
        model.addAttribute("scorelist",listscore);
        List<String> listpname=studentService.listStudentWritenPname(id);
        //将pname转为json数据
        String pname=JSONArray.fromObject(listpname).toString();
        model.addAttribute("pnamelist",pname);
        //需要加上一个list类型的listStuPapername,待写
//        model.addAttribute("pname",studentService.listStuPaperWrited(studentService.load(id)));
        return "other/charts/listScoreForTeach";
    }

    //列出该学生需要写的试卷
    @RequestMapping("/papers/unwriten")
    public String showStuPapersUnwriten(Model model, HttpSession session) {
        Student student = (Student) session.getAttribute("loginStudent");
        model.addAttribute("studentpapersun", studentService.listStuPaperUnwrite(student));
        return "paper/student/unwriten_papers";
    }

//    @RequestMapping("/listStudentByScore")
//    public String listStudentByScore(Model model,HttpSession s){
//        Teacher t= (Teacher) s.getAttribute("loginTeacher");
//        //传入排列好的学生
//        model.addAttribute("studentsByscore",studentService.findStudentOrderByScore());
//        model.addAttribute("countlist",studentService.listCount());
//        return "user/teacher/listStudentByScore";
//    }

//    @RequestMapping("/showAvgScoreDistribution")
//    public String showAvgScoreDistribution(){
//        return "other/charts/AvgScoreDistribution";
//    }
}
