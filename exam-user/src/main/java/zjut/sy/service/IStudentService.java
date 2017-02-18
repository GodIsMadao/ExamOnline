package zjut.sy.service;

import zjut.sy.basic.model.Pager;
import zjut.sy.model.Exampaper;
import zjut.sy.model.Question;
import zjut.sy.model.Student;
import zjut.sy.model.StudentPaper;

import java.util.List;

/**
 * Created by dell on 2016/4/25.
 */
public interface IStudentService {

//    public Pager<Student> findStudentOrderByScore();

//    public List<Long> listCount();
    //根据历次考试列出学生得分
    public List<Integer> listStuScore(int sid);
    //根据学生id列出所有paper的id
    public List<Integer> listStudentPaperIds(int sid);
    //根据学生id列出所写paper的id
    public List<Integer> listStudentPaperWritenIds(int sid);
    //根据学生id列出未写paper的id
    public List<Integer> listStudentPaperUnwritenIds(int sid);
//    根据学生id列出所写paper的name
    public List<String> listStudentWritenPname(int sid);
//    根据学生id列出未写paper的name
    public List<String> listStudentUnwritenPname(int sid);
    public void add(Student student,Integer tid);

    public void add(Student student,Exampaper paper);
    //更新个人信息
    public void updateStuInfo(Student student);

    public Pager<Student> findStudent(int tid);

    public Pager<Student> findStudent();
    //登陆
    public Student login(String username,String password);
    //列出所写过的试卷
    public Pager<Exampaper> listStuPaperWrited(Student student);
    //列出待写试卷
    public Pager<Exampaper> listStuPaperUnwrite(Student student);
    //列出所写过的题目
    public Pager<Question> listStuQuestion(Student student);
    //列出写对的题目
    public Pager<Question> listStuQuestionRight(Student student);
    //列出写错的题目
    public Pager<Question> listStuQuestionWrong(Student student);

    public StudentPaper loadStudentExampaper(int sId,int paperId);
    //load by id
    public Student load(int id);

    public void updateStatus(int sid);
}
