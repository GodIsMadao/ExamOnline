package zjut.sy.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import zjut.sy.model.*;
import zjut.sy.service.IAdminService;
import zjut.sy.service.IPaperService;
import zjut.sy.service.IStudentService;
import zjut.sy.service.ITeacherService;
import zjut.sy.util.Captcha;

import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/**
 * Created by dell on 2016/5/1.
 */
@Controller
public class IndexController {
    private ITeacherService teacherService;
    private IStudentService studentService;
    private IPaperService paperService;
    private IAdminService adminService;

    public IPaperService getPaperService() {
        return paperService;
    }

    @Inject
    public void setPaperService(IPaperService paperService) {
        this.paperService = paperService;
    }

    public IStudentService getStudentService() {
        return studentService;
    }

    public IAdminService getAdminService() {
        return adminService;
    }

    @Inject
    public void setAdminService(IAdminService adminService) {
        this.adminService = adminService;
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

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login/teacher", method = RequestMethod.GET)
    public String Teacherlogin() {
        return "user/teacher/login";
    }

    @RequestMapping(value = "/login/teacher", method = RequestMethod.POST)
    public String Teacherlogin(String username, String password, String checkcode, Model model, HttpSession session) {
        String cc = (String) session.getAttribute("cc");
        if (!cc.equalsIgnoreCase(checkcode)) {
            model.addAttribute("error", "验证码出错，请重新输入");
            return "user/teacher/login";
        }
        Teacher loginTeacher = teacherService.login(username, password);
        if(!password.equals(loginTeacher.getPassword())){
            throw new ExamException("用户名或密码不正确");
        }
        session.setAttribute("loginTeacher", loginTeacher);
        session.removeAttribute("cc");
        return "redirect:/index";
    }

    @RequestMapping(value = "/login/student", method = RequestMethod.POST)
    public String StudentLogin(String username, String password, String checkcode, Model model, HttpSession session) {
        String cc = (String) session.getAttribute("cc");
        if (!cc.equalsIgnoreCase(checkcode)) {
            model.addAttribute("error", "验证码出错，请重新输入");
            return "user/student/login";
        }
        Student loginStudent = studentService.login(username, password);
        if(!password.equals(loginStudent.getPassword())){
            throw new ExamException("用户名或密码不正确");
        }
        session.setAttribute("loginStudent", loginStudent);
        session.removeAttribute("cc");
        return "redirect:/index";
    }

    @RequestMapping(value = "/login/student", method = RequestMethod.GET)
    public String Studentlogin() {
        return "user/student/login";
    }

    @RequestMapping(value="/login/admin",method = RequestMethod.GET)
    public String AdminLogin(){
        return"admin/login";
    }

    @RequestMapping(value="/login/admin",method = RequestMethod.POST)
    public String AdminLogin(String username,String password,String checkcode, Model model,HttpSession session){
        String cc = (String) session.getAttribute("cc");
        if (!cc.equalsIgnoreCase(checkcode)) {
            model.addAttribute("error", "验证码出错，请重新输入");
            return "admin/login";
        }
        Admin loginAdmin = adminService.login(username, password);
        if(!password.equals(loginAdmin.getPassword())){
            throw new ExamException("用户名或密码不正确");
        }
        session.setAttribute("loginAdmin", loginAdmin);
        session.removeAttribute("cc");
        return "redirect:/admin/infocenter";
    }

    @RequestMapping("/admin/infocenter")
    public String AdminInfo(){
        return "info_center";
    }

    //生成验证码
    @RequestMapping("/login/drawCheckCode")
    public void drawCheckCode(HttpServletResponse resp, HttpSession session) throws IOException, FontFormatException {
        resp.setContentType("image/jpg");
        int width = 200;
        int height = 30;
        Captcha c = Captcha.getInstance();
        c.set(width, height);
        String checkcode = c.generateCheckcode();
        session.setAttribute("cc", checkcode);
        OutputStream os = resp.getOutputStream();
        ImageIO.write(c.generateCheckImg(checkcode), "jpg", os);
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }


    //登出功能
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("loginStudent");
        session.removeAttribute("loginTeacher");
        session.removeAttribute("loginAdmin");
        return "redirect:/index";
    }
//    更多试题 显示
    @RequestMapping("/morepaper")
    public String showMorePaper(Model model){
        model.addAttribute("papers",paperService.findExampaper());
        return "paper/morepaper";
    }
    //个人信息中心
    @RequestMapping("/student/infocenter")
    public String studentInfo() {
        return "info_center";
    }

    @RequestMapping("/teacher/infocenter")
    public String teacherInfo() {
        return "info_center";
    }
//设置，更改个人的基础信息
//    @RequestMapping("/student/setting")
//    public String studentSetting() {
//        return "user/student/setting";
//    }
//
//    @RequestMapping("/teacher/setting")
//    public String teacherSetting() {
//        return "user/teacher/setting";
//    }
//
//    @RequestMapping("/admin/setting")
//    public String adminSetting() {
//        return "admin/setting";
//    }

    @RequestMapping("/FAQ")
    public String faq() {
        return "other/FAQ";
    }


    @RequestMapping("/exampaper")
    public String listAllExampaper() {
        return "paper/listall";
    }
}
