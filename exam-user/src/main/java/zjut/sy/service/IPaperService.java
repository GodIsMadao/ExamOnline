package zjut.sy.service;

import zjut.sy.basic.model.Pager;
import zjut.sy.model.Exampaper;
import zjut.sy.model.Question;
import zjut.sy.model.Student;
import zjut.sy.model.Teacher;

import java.util.List;

/**
 * Created by dell on 2016/4/19.
 */
public interface IPaperService {
    public void updateCStatusPass(int pid);

    public void updateCStatusUnPass(int pid);

    public void releasePaper(int pid,int tid);

    public List<String> listStuAnswer(int sid,int pid);

    //根据pid查出teacher
    public Teacher loadTeacherByPaperId(int pid);
    //根据pid列出所写的学生数
    public List<Student> listStudentByPaperId(int pid);
    //添加试题
    public void addQuestion(Exampaper paper,Question question);
    //删除试题
    public void deleteQuestion(Question question);
    //更新试题
    public void updateQuestion(Question question);

//    public void delete(int id);
//    public void update(Exampaper paper);
    //获取试卷信息
    public Exampaper load(int id);
    //列出所有试卷
    public Pager<Exampaper> findExampaper();
    //列出某个老师所编写的所有试卷
    public Pager<Exampaper> findExampaperTeacher(Teacher teacher);

    //已发布试卷
    public Pager<Exampaper> findExampaperReleased(Teacher teacher);
    public Pager<Exampaper> findExampaperReleased();
    //已审核待发布试卷
    public Pager<Exampaper> findExampaperChecked(Teacher teacher);
    public Pager<Exampaper> findExampaperChecked();
    //待审核试卷
    public Pager<Exampaper> findExampaperUnchecked(Teacher teacher);
    public Pager<Exampaper> findExampaperUnchecked();
    //    审核不通过试卷
    public Pager<Exampaper> findExampaperUnpass(Teacher teacher);
    public Pager<Exampaper> findExampaperUnpass();
    //列出试卷
    public List<Exampaper> listExampaper();

    //先新增个stu_paper表项
    public void addStuPaper(int pid,Student student);
    //根据试卷id，学生id，将学生的得分加入t_stu_paper连接表
    public void addScorePaperStu(int pid,Student student);

    public void changeStatusPaperStu(int pid,Student student);
    public List<Question> listQuestion(int pid);

    public void deletePaper(int pid);
}
