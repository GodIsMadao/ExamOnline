package zjut.sy.dao;

import org.springframework.stereotype.Repository;
import zjut.sy.basic.dao.BaseDao;
import zjut.sy.basic.model.Pager;
import zjut.sy.model.*;

import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2016/4/25.
 */
@SuppressWarnings("JpaQlInspection")
@Repository("studentDao")
public class StudentDao extends BaseDao<Student> implements IStudentDao{
    @Override
    public List<Integer> listStudentScore(int sId){
        String hql="select sp.score from StudentPaper sp where sp.student.id=? and sp.write_status=1";
        return this.getSession().createQuery(hql).setParameter(0,sId).list();
    }
    @Override
    public List<StudentPaper> loadStudentPaper(int sId){
        String hql="select sp from StudentPaper sp where sp.student.id=?";
        return this.getSession().createQuery(hql).setParameter(0,sId).list();
    }
    @Override
    public StudentPaper loadStudentExampaper(int sId, int paperId) {
        String hql="select sp from StudentPaper sp left join sp.student s left join sp.paper p where s.id=? and p.id=?";
        return (StudentPaper) this.getSession().createQuery(hql).setParameter(0,sId).setParameter(1,paperId).uniqueResult();
    }

    @Override
    public List<Integer> listStudentPaperIds(int sId) {
        String hql="select sp.paper.id from StudentPaper sp where sp.student.id=?";
        return this.getSession().createQuery(hql).setParameter(0,sId).list();
    }


    @Override
    public List<Integer> listStudentPaperWritenIds(int sId) {
        String hql="select sp.paper.id from StudentPaper sp where sp.student.id=? and sp.write_status=1";
        return this.getSession().createQuery(hql).setParameter(0,sId).list();
    }

    @Override
    public List<Integer> listStudentPaperUnwritenIds(int sId) {
        String hql="select sp.paper.id from StudentPaper sp where sp.student.id=? and sp.write_status=0";
        return this.getSession().createQuery(hql).setParameter(0,sId).list();
    }

    @Override
    public List<String> listStudentWritenPname(int sid) {
        String hql="select sp.paper.pname from StudentPaper sp where sp.student.id=? and sp.write_status=1";
        return this.getSession().createQuery(hql).setParameter(0,sid).list();
    }

    @Override
    public List<String> listStudentUnwritenPname(int sid) {
        String hql="select sp.paper.pname from StudenPaper sp where sp.student.id=? and sp.write_status=0";
        return this.getSession().createQuery(hql).setParameter(0,sid).list();
    }

    @Override
    public void addStudentQuestion(int sId, Question question,String stu_answer) {
        StudentQuestion sq=new StudentQuestion();
        sq.setStudent(this.load(sId));
        sq.setQuestion(question);
        sq.setStu_answer(stu_answer);
        if(stu_answer.equals(question.getAnswer())) {
            sq.setRight_status(1);
        }
        this.getSession().save(sq);
    }

    //
//    @Override
//    public List<Integer> listStudentQuestionIds(int sId) {
//        String hql="select sq.question.id from StudentQuestion sq where sq.student.id=?";
//        return this.getSession().createQuery(hql).setParameter(0,sId).list();
//    }

//要不要把student改为student.name
    @Override
    public List<Student> listQuestionStudentsWrong(int questionId) {
        String hql="select sq.student from StudentQuestion sq where sq.question.id=? and sq.right_status=2";
        return this.getSession().createQuery(hql).setParameter(0,questionId).list();
    }

    @Override
    public List<StudentQuestion> loadStudentQuestion(int sId) {
        String hql="from StudentQuestion sq where sq.student.id=?";
        return this.getSession().createQuery(hql).list();
    }

    @Override
    public List<Student> listQuestionStudentsRight(int questionId) {
        String hql="select sq.student from StudentQuestion sq where sq.question.id=? and sq.right_status=1";
        return this.getSession().createQuery(hql).setParameter(0,questionId).list();
    }


    @Override
    public Student loadByStudentname(String username) {
        String hql = "from Student where username=?";
        return (Student)this.queryObject(hql,username);
    }

    @Override
    public List<Student> listPaperStudents(int paperId) {
        String hql="select sp.student from StudentPaper sp where sp.paper.id=?";
        return this.list(hql,paperId);
    }

    @Override
    public List<Student> listTeacherStudents(int teacherId) {
        String hql="select ts.student from TeacherStu ts where ts.teacher.id=?";
        return this.list(hql,teacherId);
    }

    @Override
    public void addStudentExampaper(Student student, Exampaper paper) {
//        StudentPaper studentPaper=this.loadStudentExampaper(student.getId(),paper.getId());
//        if(studentPaper!=null) return;
        StudentPaper studentPaper= new StudentPaper();
        studentPaper.setPaper(paper);
        studentPaper.setStudent(student);
        studentPaper.setWrite_status(1);
//        studentPaper.setScore(score);
        this.getSession().save(studentPaper);
    }


//    @Override
//    public void addStudentScore(int score,Student student,Exampaper paper) {
//        StudentPaper sp=this.loadStudentExampaper(student.getId(),paper.getId());
//        sp.setScore(score);
//        this.getSession().save(sp);
//    }

    @Override
    public void updateStudent(int sId) {
        this.updateByHql("update s.realname,s.address,s.password,s.school,s.teacher,s.email from Student s where s.id=?");
    }

    @Override
    public Pager<Student> findStudent() {
        return this.find("from Student");
    }

    @Override
    public Pager<Student> findStudent(int tid) {
        return this.find("from Student s where s.teacher.id=?",tid);
    }
}
