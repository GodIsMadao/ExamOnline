package zjut.sy.dao;

import zjut.sy.basic.dao.IBaseDao;
import zjut.sy.basic.model.Pager;
import zjut.sy.model.*;

import java.util.List;

/**
 * Created by dell on 2016/4/18.
 */
public interface IExampaperDao extends IBaseDao<Exampaper> {

//    public void deleteExampaperQuestions(int pid);
    public void deleteExampaperQuestion(int pid,int qid);

    //已知学生id，试卷id，列出学生答案list
    public List<String> listStuAnswer(int sid,int pid);

    public void addPaperQuestion(Exampaper paper,Question question);

    //根据学生id列出已经写过的试卷
    public Pager<Exampaper> findStudentPapersWrited(int sId);
    //根据学生id列出待写试卷
    public Pager<Exampaper> findStudentPapersUnwrite(int sId);

//    public Pager<StudentPaper> findStudentPapersWritedScore(int sId);
    //根据试卷id来载入问题
    public List<Question> listQuestionByPaperId(int pid);
    public Question loadPaperQuestion(int pid,int qid);
    public Teacher loadTeacherByPaperId(int pid);
    //根据paper id列出已做学生
    public List<Student> listStudentByPaperId(int pid);
//    public Exampaper loadByPname(String pname);
    //根据试卷id，学生id，加载学生
//    public Student loadStudentByStuPaperId(int pid,int sid);

    public List<Question> listQuestion(int pid);

    public void changeStatusStuPaper(int pid,Student student);

    public StudentPaper loadPaperStudent(int pid,Student student);
    //新增加stu_paper表
    public void addPaperStu(int pid,Student student);
    //考试把成绩，stu_paper录入的必要基本操作
    public Integer countTotalQuestion(int pid);
    public Long countRightQuestion(int pid, Student student);
    public void addScorePaperStu(int pid, Student student);

    //根据试卷
    public List<Exampaper> listExampaper();
    public Pager<Exampaper> findExampaperTeacher(int tid);
    public Pager<Exampaper> findExampaper();
    //已发布试卷
    public Pager<Exampaper> findExampaperReleased(int tid);
    public Pager<Exampaper> findExampaperReleased();
    //已审核待发布试卷
    public Pager<Exampaper> findExampaperChecked(int tid);
    public Pager<Exampaper> findExampaperChecked();
    //待审核试卷
    public Pager<Exampaper> findExampaperUnchecked(int tid);
    public Pager<Exampaper> findExampaperUnchecked();
//    审核不通过试卷
    public Pager<Exampaper> findExampaperUnpass(int tid);
    public Pager<Exampaper> findExampaperUnpass();
//    public Pager<StudentPaper> findPaperStu (int sid);

    public void releasePaper(int pid,int tid);

}
