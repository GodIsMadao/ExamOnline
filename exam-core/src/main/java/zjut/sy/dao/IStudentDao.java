package zjut.sy.dao;

import zjut.sy.basic.dao.IBaseDao;
import zjut.sy.basic.model.Pager;
import zjut.sy.model.*;

import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2016/4/25.
 */
public interface IStudentDao extends IBaseDao<Student> {

    //更新
    //根据学生id列出历次考试得分
    public List<Integer> listStudentScore(int sId);
    //根据学生id查询历次考试得分(t_stu_paper)
    public List<StudentPaper> loadStudentPaper(int sId);
    //根据学生id和试卷id查询某次考试得分(t_stu_paper)
    public StudentPaper loadStudentExampaper(int sId,int paperId);

//    public Pager<Student> findStudentOrderByScore();
//根据学生id列出已做paper name
    public List<String> listStudentWritenPname(int sid);

//    public Long countavgscore();
//    根据学生id列出未做paper name
    public List<String> listStudentUnwritenPname(int sid);
    //根据学生id列出试卷id
    public List<Integer> listStudentPaperIds(int sId);
    //根据学生id列出已做试卷id
    public List<Integer> listStudentPaperWritenIds(int sId);
    //根据学生id列出未做试卷id
    public List<Integer> listStudentPaperUnwritenIds(int sId);

    //根据学生id列出试题id
//    public List<Integer> listStudentQuestionIds(int sId);
    //每写一题，将一题和学生的回答加入student_question连接表
    public void addStudentQuestion(int sId,Question question,String stu_answer);

    //根据学生id查询stu_question
    public List<StudentQuestion> loadStudentQuestion(int sId);

    //根据学生名查询
    public Student loadByStudentname(String username);

    //根据试卷id列出学生
    public List<Student> listPaperStudents(int paperId);

    //根据试题id列出学生,看哪些试题，哪些学生写错了
    public List<Student> listQuestionStudentsWrong(int questionId);

    //根据试题id列出学生,看哪些试题，哪些学生写对了
    public List<Student> listQuestionStudentsRight(int questionId);

    //根据教师id列出学生
    public List<Student> listTeacherStudents(int teacherId);

    public void addStudentExampaper(Student student,Exampaper paper);

    public void updateStudent(int sId);

    public Pager<Student> findStudent(int tid);

    public Pager<Student> findStudent();

}
