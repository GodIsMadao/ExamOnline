package zjut.sy.dao;

import zjut.sy.basic.dao.IBaseDao;
import zjut.sy.basic.model.Pager;
import zjut.sy.model.*;

import java.util.List;

/**
 * Created by dell on 2016/4/25.
 */
public interface ITeacherDao extends IBaseDao<Teacher> {

    //根据教师id列出试卷
    public List<Exampaper> listTeacherPapers(int tId);
    //根据教师id列出试卷id
    public List<Integer> listTeacherPaperIds(int tId);
    //根据教师id列出学生
    public List<Student> listTeacherStudents(int tId);
    //根据教师id列出学生id
    public List<Integer> listTeacherStudentIds(int tId);
//    //根据教师id列出试题
//    public List<Question> listTeacherQuestions(int tId);

    public List<Teacher> listTeacher();
    //查询teacher paper
    public Exampaper loadTeachExampaper(int tId,int paperId);
    //查询 teacher question
    public Question loadTeachQuestion(int tId,int quetionId);
    //查询 teacher student
    public Student loadTeachStudent(int tId,int stuId);
    //根据教师名查询
    public Teacher loadByTeachername(String tname);
    //根据教师ID查出学生个数
//    public Teacher loadStuCountByTId(int tid);
    //
//更新一部分内容
//    public void updateTeacher(int tid);

    //学生注册，添加到student表外键和teacher表联系中
    public void addTeachStudent(Teacher teacher,Student student);

    public Integer addTeachExampaper(Teacher teacher,Exampaper paper);

//    public void addTeachQuestion(Teacher teacher,Question question);

//    public void deleteTeachPapers(int tId);
//
//    public void deleteTeachQuestions(int tId);

    public void deleteTeachPaper(int tId,int pid);

    public void deleteTeachQuestion(int tId,int qid);

    public Pager<Teacher> findTeacher();
}
