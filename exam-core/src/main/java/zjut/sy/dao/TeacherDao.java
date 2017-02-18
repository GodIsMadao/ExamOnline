package zjut.sy.dao;

import org.springframework.stereotype.Repository;
import zjut.sy.basic.dao.BaseDao;
import zjut.sy.basic.model.Pager;
import zjut.sy.model.*;

import java.util.Date;
import java.util.List;

/**
 * Created by dell on 2016/4/25.
 */
@SuppressWarnings("JpaQlInspection")
@Repository("teacherDao")
public class TeacherDao extends BaseDao<Teacher> implements ITeacherDao {
    @Override
    public List<Teacher> listTeacher() {
        return this.list("from Teacher");
    }

    @Override
    public List<Exampaper> listTeacherPapers(int tId) {
        String hql="from Exampaper ep where ep.teacher.id=?";
        return this.getSession().createQuery(hql).setParameter(0,tId).list();

    }

    @Override
    public List<Integer> listTeacherPaperIds(int tId) {
        String hql="select ep.id from Exampaper ep where ep.teacher.id=?";
        return this.getSession().createQuery(hql).setParameter(0,tId).list();
    }

    @Override
    public List<Student> listTeacherStudents(int tId) {
        String hql="from Student s where s.teacher.id=?";
        return this.getSession().createQuery(hql).setParameter(0,tId).list();
    }

    @Override
    public List<Integer> listTeacherStudentIds(int tId) {
        String hql="select s.id from Student s where s.teacher.id=?";
        return this.getSession().createQuery(hql).setParameter(0,tId).list();
    }

//    @Override
//    public List<Question> listTeacherQuestions(int tId) {
//        String hql="select tq.question from TeacherQuestion tq where tq.teacher.id=?";
//        return this.getSession().createQuery(hql).setParameter(0,tId).list();
//    }

    @Override
    public Exampaper loadTeachExampaper(int tId, int paperId) {
        String hql="select ep from Exampaper ep where ep.teacher.id=? and ep.id=?";
        return (Exampaper) this.getSession().createQuery(hql).setParameter(0,tId).setParameter(1,paperId).uniqueResult();
    }

    @Override
    public Question loadTeachQuestion(int tId, int quetionId) {
        String hql = "select q from Question q where q.exampaper.teacher.id=? and q.id=?";
        return (Question) this.getSession().createQuery(hql).setParameter(0,tId).setParameter(1,quetionId).uniqueResult();
    }

    @Override
    public Student loadTeachStudent(int tId, int stuId) {
        String hql="from Student s where s.teacher.id=? and s.id=?";
        return (Student) this.getSession().createQuery(hql).setParameter(0,tId).setParameter(1,stuId).uniqueResult();
    }


    @Override
    public Teacher loadByTeachername(String tname) {
        String hql="from Teacher where username=?";
        return (Teacher) this.queryObject(hql,tname);
    }


    //    @Override
//    public void deleteTeachPapers(int tId) {
//        String hql="delete tp TeachPaper where tp.teacher.id=?";
//        this.updateByHql(hql,tId);
//    }
//
//    @Override
//    public void deleteTeachQuestions(int tId) {
//        String hql="delete tq TeachQuestion where tq.teacher.id=?";
//        this.updateByHql(hql,tId);
//    }


    @Override
    public void addTeachStudent(Teacher teacher, Student student) {
        Student s=this.loadTeachStudent(teacher.getId(),student.getId());
        if(s!=null)return;
        s=new Student();
        s.setId(student.getId());
        s.setUsername(student.getUsername());
        s.setPassword(student.getPassword());
        s.setAddress(student.getAddress());
        s.setEmail(student.getEmail());
        //默认注册直接启用
        s.setStatus(1);
        s.setRealname(student.getRealname());
        s.setSno(student.getSno());
        s.setSchool(student.getSchool());
        s.setTeacher(teacher);
        s.setPicpath(student.getPicpath());
//        先放在service层注册时间unchecked
        s.setCreate_date(student.getCreate_date());
        this.getSession().save(s);
    }

    @Override
    public Integer addTeachExampaper(Teacher teacher, Exampaper paper) {
        //在新建paper时，由于需要添加试题，所以需要paperid；
        Exampaper ep=new Exampaper();
        //把service层注入进paper的时间拷贝进ep；
        ep.setCreate_date(paper.getCreate_date());
        ep.setTeacher(teacher);
        ep.setPname(paper.getPname());
        ep.setTag(paper.getTag());
        ep.setTime(paper.getTime());
        ep.setMaxQuestion(paper.getMaxQuestion());
        ep.setCheck_status(1);
        ep.setId(paper.getId());
        this.getSession().save(ep);
        //id为自增，前面id都为空，需要save
        int pid=ep.getId();
        return pid;
    }

    @Override
    public void deleteTeachPaper(int tId, int pid) {
        String hql="delete ep Exampaper where ep.teacher.id=? and ep.id=?";
        this.updateByHql(hql,new Object[]{tId,pid});
    }

    @Override
    public void deleteTeachQuestion(int tId, int qid) {
        String hql="delete q Question where q.exampaper.teacher.id=? and q.id=?";
        this.updateByHql(hql,new Object[]{tId,qid});
    }


    @Override
    public Pager<Teacher> findTeacher() {
        return this.find("from Teacher");
    }
}
