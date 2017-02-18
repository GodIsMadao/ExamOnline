package zjut.sy.exam.controller;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import zjut.sy.basic.model.Pager;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dell on 2016/5/4.
 */
@Controller
@RequestMapping("/question")
public class QuestionController {
    private IQuestionService questionService;
    private IStudentService studentService;
    private ITeacherService teacherService;
    private IPaperService paperService;

    public ITeacherService getTeacherService() {
        return teacherService;
    }

    @Inject
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public IQuestionService getQuestionService() {
        return questionService;
    }

    @Inject
    public void setQuestionService(IQuestionService questionService) {
        this.questionService = questionService;
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

    //需要检查一下dao层的hql语句，左连接不一定写对!!!uncheck
    @RequestMapping("/teacher/questions")
    public String showQuestionTeach(Model model, HttpSession session) {
        Teacher teacher = (Teacher) session.getAttribute("loginTeacher");
        model.addAttribute("teacher_questions", paperService.findExampaperTeacher(teacher));
        return "question/teacher/questions";
    }

    @RequestMapping(value = "/student/papers/writen")
    public String showStuPapersWriten(Model model, HttpSession session) {
        Student student = (Student) session.getAttribute("loginStudent");
        model.addAttribute("studentpapers", studentService.listStuPaperWrited(student));
//        model.addAttribute("stupaperscore",studentService)
        return "paper/student/writen_papers";
    }


    @RequestMapping(value = "/teacher/addQuestion", method = RequestMethod.GET)
    public String addQuestions(Model model) {
        model.addAttribute("question", new QuestionDto());
        return "question/teacher/addQuestion";
    }

    @RequestMapping(value="/{id}")
    public String showQuestion(@PathVariable int id,Model model,HttpSession session){
        Student student= (Student) session.getAttribute("loginStudent");
        Question question=questionService.load(id);
        model.addAttribute("show_question",question);
        model.addAttribute("s_answer",questionService.loadByStuIdQuestionId(student.getId(),id));
        return "question/show_question";
    }

    @RequestMapping(value="/teacher/addQuestion",method=RequestMethod.POST)
    public String addQuestions(@Valid QuestionDto questionDto,HttpSession session,BindingResult br){
        //不是持久化对象，如果使用p1会报error：save the transient instance before flushing
        Integer pid= (Integer) session.getAttribute("newpid");
        Exampaper paper=paperService.load(pid);
        if(br.hasErrors()){
            return "question/teacher/addQuestion";
        }

        System.out.println(paper.getId()+"--");
        for(Question question:questionDto.getQuestions()){
//            System.out.println(question.getContent()+"-"+question.getAnswer());
            paperService.addQuestion(paper,question);
            System.out.println(question.getContent());
        }
        session.removeAttribute("newpid");
        return "redirect:/teacher/infocenter";
    }



}
