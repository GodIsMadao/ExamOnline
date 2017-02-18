package zjut.sy.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import zjut.sy.basic.dao.BaseDao;
import zjut.sy.basic.model.Pager;
import zjut.sy.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2016/4/18.
 */
@SuppressWarnings("JpaQlInspection")
@Repository("exampaperDao")
public class ExampaperDao extends BaseDao<Exampaper> implements IExampaperDao {
    @Override
    public Pager<Exampaper> findExampaperTeacher(int tid) {
        return this.find("from Exampaper ep where ep.teacher.id=?",tid);
    }

    @Override
    public List<String> listStuAnswer(int sid, int pid) {
        String hql="select sq.stu_answer from StudentQuestion sq left join sq.student s left join sq.question q left join q.exampaper ep where s.id=? and ep.id=?";
        return this.getSession().createQuery(hql).setParameter(0,sid).setParameter(1,pid).list();
    }

    @Override
    public Pager<Exampaper> findStudentPapersWrited(int sId) {
        String hql="select sp.paper from StudentPaper sp left join sp.paper p where sp.student.id=? and sp.write_status=1 and p.check_status=3";
        return this.find(hql,sId);
    }

//    @Override
//    public Pager<StudentPaper> findStudentPapersWritedScore(int sId) {
//        String hql="select sp.score from StudentPaper sp where sp.student.id=?";
//        return this.find(hql,sId);
//    }


    @Override
    public List<Student> listStudentByPaperId(int pid) {
        String hql="select sp.student from StudentPaper sp left join sp.paper p where p.id=? and sp.write_status=1";
        return this.getSession().createQuery(hql).setParameter(0,pid).list();
    }

    @Override
    public void releasePaper(int pid, int tid) {
        String hql="from Student s where s.teacher.id=?";
        String hql1="from Question q where q.exampaper.id=?";
        List<Student> students=this.getSession().createQuery(hql).setParameter(0,tid).list();
        List<Question> questions=this.getSession().createQuery(hql1).setParameter(0,pid).list();
        Exampaper paper=this.load(pid);
        for(int i=0;i<students.size();i++) {
            StudentPaper sp=new StudentPaper();
            for(int j=0;j<questions.size();j++) {
                StudentQuestion sq=new StudentQuestion();
                sq.setStudent(students.get(i));
                sq.setRight_status(3);//待写
                sq.setStu_answer("");
                sq.setQuestion(questions.get(j));
                System.out.println("sq.right_status:" + sq.getRight_status());
                this.getSession().save(sq);
            }
            sp.setStudent(students.get(i));
            sp.setWrite_status(0);
            sp.setScore(-1);
            sp.setPaper(paper);
            this.getSession().save(sp);
        }
    }

    //根据paper id 查出teacher
    @Override
    public Teacher loadTeacherByPaperId(int pid) {
        String hql="select ep.teacher from Exampaper ep where ep.id=?";
        return (Teacher) this.getSession().createQuery(hql).setParameter(0,pid).uniqueResult();
    }

    //学生可见的已发布但待写试卷
    @Override
    public Pager<Exampaper> findStudentPapersUnwrite(int sId) {
        String hql="select sp.paper from StudentPaper sp left join sp.paper p where sp.student.id=? and sp.write_status=0 and p.check_status=3";
        return this.find(hql,sId);
    }

    @Override
    public List<Exampaper> listExampaper() {
        return this.list("from Exampaper");
    }

//    @Override
//    public void deleteExampaperQuestions(int pid) {
//        String hql="delete Question q where q.exampaper.id=?";
//        this.updateByHql(hql,pid);
//    }


    @Override
    public Pager<Exampaper> findExampaperReleased(int tid) {
        String hql="from Exampaper ep where ep.teacher.id=? and ep.check_status=3";
        return this.find(hql,tid);
    }

    @Override
    public Pager<Exampaper> findExampaperReleased() {
        String hql="from Exampaper ep where ep.check_status=3";
        return this.find(hql);
    }

    @Override
    public Pager<Exampaper> findExampaperChecked(int tid) {
        String hql="from Exampaper ep where ep.teacher.id=? and ep.check_status=2";
        return this.find(hql,tid);
    }

    @Override
    public Pager<Exampaper> findExampaperChecked() {
        String hql="from Exampaper ep where ep.check_status=2";
        return this.find(hql);
    }

    @Override
    public Pager<Exampaper> findExampaperUnchecked(int tid) {
        String hql="from Exampaper ep where ep.teacher.id=? and ep.check_status=1";
        return this.find(hql,tid);
    }

    @Override
    public Pager<Exampaper> findExampaperUnchecked() {
        String hql="from Exampaper ep where ep.check_status=1";
        return this.find(hql);
    }

    @Override
    public Pager<Exampaper> findExampaperUnpass(int tid) {
        String hql="from Exampaper ep where ep.teacher.id=? and ep.check_status=4";
        return this.find(hql,tid);
    }

    @Override
    public Pager<Exampaper> findExampaperUnpass() {
        String hql="from Exampaper ep where ep.check_status=4";
        return this.find(hql);
    }

    @Override
    public void deleteExampaperQuestion(int pid, int qid) {
        String hql="delete PaperQuestion pq where pq.exampaper.id=? and pd.question.id=?";
        this.updateByHql(hql,new Object[]{pid,qid});
    }

    @Override
    public List<Question> listQuestionByPaperId(int pid) {
        String hql="from Question q where q.exampaper.id=?";
        return  this.getSession().createQuery(hql).setParameter(0,pid).list();
    }

    @Override
    public Question loadPaperQuestion(int pid, int qid) {
        String hql="from Question q where q.exampaper.id=? and q.id=?";
        return (Question) this.getSession().createQuery(hql).setParameter(0,pid).setParameter(1,qid).uniqueResult();
    }

//    @Override
//    public Student loadStudentByStuPaperId(int pid, int sid) {
//        String hql="from StudentPaper sp where sp.paper.id=? and sp.student.id=?";
//        return ;
//    }

    @Override
    public void addPaperQuestion(Exampaper paper, Question question) {
//        Question q = this.loadPaperQuestion(paper.getId(), question.getId());
//        if(q!=null) return;
        Question q=new Question();
        q.setExampaper(paper);
//        q.setId(question.getId());
        q.setAnswer(question.getAnswer());
        q.setContent(question.getContent());
        q.setChoice1(question.getChoice1());
        q.setChoice2(question.getChoice2());
        q.setChoice3(question.getChoice3());
        q.setChoice4(question.getChoice4());
        q.setComment(question.getComment());
        this.getSession().save(q);
    }

    @Override
    public void addPaperStu(int pid, Student student) {
        StudentPaper sp=new StudentPaper();
        sp.setStudent(student);
        sp.setPaper(this.load(pid));
        sp.setWrite_status(1);
        this.getSession().save(sp);
    }

    //如果不用left join会出现IllegalArgumentException occurred while calling setter of映射错误
    @Override
    public StudentPaper loadPaperStudent(int pid, Student student) {
        String hql="select sp from StudentPaper sp left join sp.paper p left join sp.student s where p.id=? and s.id=?";
        return (StudentPaper) this.getSession().createQuery(hql).setParameter(0,pid).setParameter(1,student.getId()).uniqueResult();
    }

    @Override
    public Integer countTotalQuestion(int pid) {
        String hql="select ep.maxQuestion from Exampaper ep where ep.id=?";
        return (Integer) this.getSession().createQuery(hql).setParameter(0,pid).uniqueResult();
    }

    @Override
    public Long countRightQuestion(int pid, Student student) {
        String hql="select count(sq.question.id) from StudentQuestion sq left join sq.question q where q.exampaper.id=? and sq.student.id=? and sq.right_status=1 group by sq.student.id";
        return (Long)this.getSession().createQuery(hql).setParameter(0,pid).setParameter(1,student.getId()).uniqueResult();
    }

    @Override
    public void changeStatusStuPaper(int pid, Student student) {
        StudentPaper sp=this.loadPaperStudent(pid, student);
        sp.setWrite_status(1);
        this.getSession().save(sp);
    }

    @Override
    public List<Question> listQuestion(int pid) {
        String hql="from Question q where q.exampaper.id=?";
        return this.getSession().createQuery(hql).setParameter(0,pid).list();
    }

    @Override
    public void addScorePaperStu(int pid, Student student) {
        StudentPaper sp=this.loadPaperStudent(pid,student);
        long total=this.countTotalQuestion(pid);
        long right=0;
        System.out.println(this.countRightQuestion(pid,student));
        if(this.countRightQuestion(pid,student)!=null){
            right=this.countRightQuestion(pid,student);
        }
        long score=100*right/total;
        sp.setScore(score);
        this.getSession().save(sp);
    }

    @Override
    public Pager<Exampaper> findExampaper() {
        return this.find("from Exampaper");
    }

}
