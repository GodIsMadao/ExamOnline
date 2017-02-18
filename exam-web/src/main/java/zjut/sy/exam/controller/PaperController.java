package zjut.sy.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import zjut.sy.exam.dto.Question1Dto;
import zjut.sy.exam.dto.QuestionDto;
import zjut.sy.model.Exampaper;
import zjut.sy.model.Question;
import zjut.sy.model.Student;
import zjut.sy.model.Teacher;
import zjut.sy.service.IPaperService;
import zjut.sy.service.IQuestionService;
import zjut.sy.service.IStudentService;
import zjut.sy.service.ITeacherService;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.*;

/**
 * Created by dell on 2016/5/4.
 */
@Controller
@RequestMapping("/paper")
public class PaperController {
    private IPaperService paperService;
    private ITeacherService teacherService;
    private IStudentService studentService;
    private IQuestionService questionService;

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

    public IStudentService getStudentService() {
        return studentService;
    }

    @Inject
    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }

    public IQuestionService getQuestionService() {
        return questionService;
    }

    @Inject
    public void setQuestionService(IQuestionService questionService) {
        this.questionService = questionService;
    }


    //教师可以预览试卷
    @RequestMapping(value = "/{id}")
    public String showPaperInfo(@PathVariable int id, Model model) {
        model.addAttribute("paper", paperService.load(id));
        model.addAttribute("questions", questionService.findQuestionsByPaperId(id));
        //预览试卷的信息（包含试题）
        return "paper/teacher/precheck_paper";
    }

//学生查看
    @RequestMapping(value = "showstupaper/{id}")
    public String showStudentPaperInfo(@PathVariable int id, Model model,HttpSession session) {
        Student student= (Student) session.getAttribute("loginStudent");
        List<Question> q1=paperService.listQuestion(id);
        List<String> q2=paperService.listStuAnswer(student.getId(),id);
//        可以进行if判断谁大根据谁遍历，但是基本上q1,q2长度是一样的
        model.addAttribute("paper", paperService.load(id));
//        model.addAttribute("questions", paperService.listQuestion(id));
//        System.out.println("rightnum:" + questionService.CountRightQuestions(id, student.getId()));
//        System.out.println("wrongnum"+questionService.CountWrongQuestions(id, student.getId()));
        long rightnum=questionService.CountRightQuestions(id, student.getId());
        long wrongnum=questionService.CountWrongQuestions(id, student.getId());
        model.addAttribute("right", 100*rightnum/(q1.size()));
        model.addAttribute("wrong",100*wrongnum/(q1.size()));
        model.addAttribute("questions",q1);
        model.addAttribute("answers",q2);
        model.addAttribute("total",q1.size());
        //学生查看试卷做的情况（试题对错）
        return "paper/student/showpaper";
    }

    @RequestMapping(value = "showteachpaper/{id}")
    public String showTeacherPaperInfo(@PathVariable int id, Model model) {
        model.addAttribute("paper", paperService.load(id));
        model.addAttribute("questions", questionService.findQuestionsByPaperId(id));
        Teacher teacher = paperService.loadTeacherByPaperId(id);
        //总的学生
        List<Student> total_stu = teacherService.listTeacherStudents(teacher.getId());
        //写的学生
        List<Student> writen_stu = paperService.listStudentByPaperId(id);
        long writen_prop = 100 * writen_stu.size() / total_stu.size();
        long unwriten_prop = 100 - writen_prop;
        long total = total_stu.size();
        model.addAttribute("total_stu", total);
        model.addAttribute("writen_prop", writen_prop);
        model.addAttribute("unwriten_prop", unwriten_prop);
        //教师查看试卷做的情况（试题对错）
        return "paper/teacher/showpaper";
    }


    //考试界面
    @RequestMapping(value = "/exam/{id}", method = RequestMethod.GET)
    public String examStudent(@PathVariable int id, Model model,HttpSession session) {
        model.addAttribute("paper", paperService.load(id));
        model.addAttribute("questions", questionService.findQuestionsByPaperId(id));
        Student s=(Student)session.getAttribute("loginStudent");
        model.addAttribute("student",studentService.load(s.getId()));
        return "user/student/exam_situation";
    }
    //考试界面,unchecked
    @RequestMapping(value = "/exam/{id}", method = RequestMethod.POST)
    public String examStudent(@Valid QuestionDto questionDto, @PathVariable int id, HttpSession session, BindingResult br) {
        Student student = (Student) session.getAttribute("loginStudent");
        if (br.hasErrors()) {
            return "user/student/exam_situation";
        }
        //先新增stu_paper，之后是在发布功能里实现对teacher下每位学生新增待写试卷stu_paper行
//        paperService.addStuPaper(id,student);
//        studentService.loadStudentExampaper(student.getId(),id);
        paperService.changeStatusPaperStu(id, student);
        int i=0;
        for (Question question : questionDto.getQuestions()){
            //获取页面写的学生答案
            System.out.println("comment:"+question.getComment());
            System.out.println("student's answer:"+question.getAnswer());
            questionService.addStuAnswer(student.getId(), paperService.listQuestion(id).get(i).getId(), question.getAnswer());
            i+=1;
        }
        //最后将paper,score写入stu_paper表
        paperService.addScorePaperStu(id, student);
        return "redirect:/paper/showExamScore/{id}";
    }
    //成绩单页面
    @RequestMapping("/showExamScore/{id}")
    public String showExamScore(Model model,@PathVariable int id,HttpSession session){
        Student student = (Student) session.getAttribute("loginStudent");
        model.addAttribute("studentpaper",studentService.loadStudentExampaper(student.getId(),id));
        return "user/student/showExamScore";
    }
        //解码
//    更新试卷试题内容,重新提交审核未通过试卷
    @RequestMapping(value = "updatepaper/{id}",method = RequestMethod.GET)
    public String updatePaper(@PathVariable int id,Model model) {
        model.addAttribute("unpasspaper",paperService.load(id));
        return "paper/teacher/resubmit";
    }

    @RequestMapping(value ="updatepaper/{id}",method = RequestMethod.POST)
    public String updatePaper(@PathVariable int id,@Valid Exampaper paper,HttpSession session,BindingResult br ,Model model){
        if(br.hasErrors()){
            return "paper/teacher/resubmit";
        }
        Exampaper p1=paperService.load(id);
        p1.setPname(paper.getPname());
        p1.setTag(paper.getTag());
        p1.setTime(paper.getTime());
        p1.setMaxQuestion(paper.getMaxQuestion());
        p1.setCheck_status(1);
        teacherService.updatePaper(p1);
        session.setAttribute("newpid", id);
        session.setAttribute("newpaper",p1);
        return "redirect:/question/teacher/addQuestion";
    }

    //
    @RequestMapping(value = "/releasePaper/{id}",method=RequestMethod.GET)
    public String releasePaper(@PathVariable int id,HttpSession session){
        Teacher teacher= (Teacher) session.getAttribute("loginTeacher");
        paperService.releasePaper(id,teacher.getId());
        return "redirect:/paper/showUnReleasedPaper";
    }
}
