package zjut.sy.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import zjut.sy.model.Admin;
import zjut.sy.service.*;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by dell on 2016/5/12.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    private ITeacherService teacherService;
    private IAdminService adminService;
    private IStudentService studentService;
    private IPaperService paperService;
    private IQuestionService questionService;

    public ITeacherService getTeacherService() {
        return teacherService;
    }

    @Inject
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public IAdminService getAdminService() {
        return adminService;
    }

    @Inject
    public void setAdminService(IAdminService adminService) {
        this.adminService = adminService;
    }

    public IStudentService getStudentService() {
        return studentService;
    }

    @Inject
    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }

    public IPaperService getPaperService() {
        return paperService;
    }

    @Inject
    public void setPaperService(IPaperService paperService) {
        this.paperService = paperService;
    }

    public IQuestionService getQuestionService() {
        return questionService;
    }

    @Inject
    public void setQuestionService(IQuestionService questionService) {
        this.questionService = questionService;
    }

    @RequestMapping("/teacher/list")
    public String showTeacher(Model model){
        model.addAttribute("teachers",teacherService.findTeacher());
        return "admin/teacher_list";
    }

    @RequestMapping("/student/list")
    public String showStudent(Model model){
        model.addAttribute("students",studentService.findStudent());
        return "admin/student_list";
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public String updateAdmin() {
        return "admin/setting";
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public String updateAdmin(@Valid Admin admin,HttpSession session,@PathVariable int id,BindingResult br){
        session.removeAttribute("loginAdmin");
        if(br.hasErrors()){
            return "admin/setting";
        }
        Admin a1=adminService.load(id);
        a1.setUsername(admin.getUsername());
        a1.setPassword(admin.getPassword());
        a1.setEmail(admin.getEmail());
        adminService.updateAdminInfo(a1);
        session.setAttribute("loginAdmin",a1);
        return "redirect:/admin/infocenter";
    }

    @RequestMapping("/paper/showUncheck")
    public String showUncheck(Model model){
        model.addAttribute("uncheck_papers",paperService.findExampaperUnchecked());
        return "admin/showUncheck";
    }

    @RequestMapping(value="/teacher/updateStatus/{id}",method=RequestMethod.GET)
    public String updateTStatus(@PathVariable int id) {
        teacherService.updateStatus(id);
        return "redirect:/admin/teacher/list";
    }

    @RequestMapping(value="/student/updateStatus/{id}",method=RequestMethod.GET)
    public String updateSStatus(@PathVariable int id) {
        studentService.updateStatus(id);
        return "redirect:/admin/student/list";
    }

    @RequestMapping(value="/updateCheckStatusPass/{id}",method=RequestMethod.GET)
    public String updateCheckStatusPass(@PathVariable int id) {
        paperService.updateCStatusPass(id);
        return "redirect:/admin/paper/showUncheck";
    }

    @RequestMapping(value="/updateCheckStatusUnpass/{id}",method=RequestMethod.GET)
    public String updateCheckStatusUnpass(@PathVariable int id) {
        paperService.updateCStatusUnPass(id);
        return "redirect:/admin/paper/showUncheck";
    }

    @RequestMapping("/paper/showChecked")
    public String showChecked(Model model){
        model.addAttribute("checked_papers",paperService.findExampaperChecked());
        return "admin/showChecked";
    }

    @RequestMapping("/{id}")
    public String show(Model model,@PathVariable int id){
        model.addAttribute("admin",adminService.load(id));
        return "admin/show";
    }

    @RequestMapping("/showAdmins")
    public String showAdmins(Model model){
        model.addAttribute("admins",adminService.findAdmin());
        return "admin/showAdmins";
    }

    @RequestMapping(value = "/addAdmin",method = RequestMethod.GET)
    public String addAdmin(){
        return "admin/addAdmin";
    }

    @RequestMapping(value = "/addAdmin",method = RequestMethod.POST)
    public String addAdmin(@Valid Admin admin,BindingResult br){
        if(br.hasErrors()){
            return "admin/addAdmin";
        }
        adminService.addAdmin(admin);
        return "redirect:/admin/infocenter";
    }
}
