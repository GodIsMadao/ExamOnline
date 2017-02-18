package zjut.sy.service;

import zjut.sy.basic.model.Pager;
import zjut.sy.model.Exampaper;
import zjut.sy.model.Question;
import zjut.sy.model.Student;
import zjut.sy.model.Teacher;

import java.util.List;

/**
 * Created by dell on 2016/4/25.
 */
public interface ITeacherService {
    //根据tid 来获取teacher
    public Teacher load(int tid);
    //根据teacher name来获取teacher
    public Teacher loadTeacherByUsername(String username);
    //添加教师
    public void addTeacher(Teacher teacher);
    //添加试卷
    public Integer addPaper(Teacher teacher,Exampaper paper);
//    public void addQuestion(Teacher teacher,Integer[] qids);
    //删除试卷
    public void deletePaper(Exampaper paper);
    //更新试卷信息
    public void updatePaper(Exampaper exampaper);
    //更新个人信息
    public void updateInfo(Teacher teacher);
    //更新个人状态
    public void updateStatus(int tid);
    //查询学生
    public Pager<Student> findStudent(int tid);

    //
    public List<Teacher> list();
    //列出所教学生列表
    public List<Student> listTeacherStudents(int tid);
    //列出所编写试卷列表
    public List<Exampaper> listTeacherPapers(int tid);

//    public List<Question> listTeacherQuestions(int id);
    //列出所教学生id
    public List<Integer> listTeacherStudentIds(int tid);
    //列出所编写试卷id
    public List<Integer> listTeacherPaperIds(int tid);
    //登陆
    public Teacher login(String username,String password);

    public Pager<Teacher> findTeacher();
}
