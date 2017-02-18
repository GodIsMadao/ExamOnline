package zjut.sy.service;

import org.springframework.stereotype.Service;
import zjut.sy.basic.model.Pager;
import zjut.sy.dao.IExampaperDao;
import zjut.sy.dao.IQuestionDao;
import zjut.sy.dao.IStudentDao;
import zjut.sy.dao.ITeacherDao;
import zjut.sy.model.*;

import javax.inject.Inject;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

/**
 * Created by dell on 2016/4/25.
 */
@Service("teacherService")
public class TeacherService implements  ITeacherService{
    private ITeacherDao teacherDao;
    private IStudentDao studentDao;
    private IExampaperDao exampaperDao;
    private IQuestionDao questionDao;

    public ITeacherDao getTeacherDao() {
        return teacherDao;
    }

    @Inject
    public void setTeacherDao(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public IStudentDao getStudentDao() {
        return studentDao;
    }

    @Inject
    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public IExampaperDao getExampaperDao() {
        return exampaperDao;
    }

    @Inject
    public void setExampaperDao(IExampaperDao exampaperDao) {
        this.exampaperDao = exampaperDao;
    }

    public IQuestionDao getQuestionDao() {
        return questionDao;
    }

    @Inject
    public void setQuestionDao(IQuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacher.setCreate_date(new Date());
        teacher.setStatus(1);
        teacherDao.add(teacher);
    }

    //教师添加试卷操作（新增试卷）

    @Override
    public Integer addPaper(Teacher teacher,Exampaper paper) {
//        Teacher t=teacherDao.load(teacher.getId());
//        if(t==null)throw new ExamException("所添加试卷的教师不存在");
        paper.setCreate_date(new Date());
//        exampaperDao.add(paper);
        Integer pid=teacherDao.addTeachExampaper(teacher, paper);
        return  pid;
    }

    @Override
    public Teacher load(int tid) {
        return teacherDao.load(tid);
    }

    @Override
    public Teacher loadTeacherByUsername(String username) {
        return teacherDao.loadByTeachername(username);
    }

    @Override
    public void updatePaper(Exampaper exampaper) {
        exampaperDao.update(exampaper);
    }

    @Override
    public List<Teacher> list() {
        return teacherDao.listTeacher();
    }

    @Override
    public void deletePaper(Exampaper paper) {
        exampaperDao.delete(paper.getId());
    }

    @Override
    public void updateInfo(Teacher teacher) {
        teacherDao.update(teacher);
    }

    //管理员使用停用功能
    @Override
    public void updateStatus(int id) {
        Teacher teacher=teacherDao.load(id);
        if(teacher==null)throw new ExamException("要修改状态的用户不存在");
        if(teacher.getStatus()==0)teacher.setStatus(1);
        else teacher.setStatus(0);
        teacherDao.update(teacher);
    }

    @Override
    public Pager<Teacher> findTeacher() {
        return teacherDao.findTeacher();
    }

    @Override
    public Pager<Student> findStudent(int tid) {
        return studentDao.findStudent(tid);
    }

    @Override
    public List<Student> listTeacherStudents(int id) {
        return teacherDao.listTeacherStudents(id);
    }

    @Override
    public List<Exampaper> listTeacherPapers(int id) {
        return teacherDao.listTeacherPapers(id);
    }

    @Override
    public List<Integer> listTeacherStudentIds(int id) {
        return teacherDao.listTeacherStudentIds(id);
    }

    @Override
    public List<Integer> listTeacherPaperIds(int id) {

        return teacherDao.listTeacherPaperIds(id);
    }

    @Override
    public Teacher login(String username, String password) {
        Teacher teacher=teacherDao.loadByTeachername(username);
        if(teacher==null)throw new ExamException("用户名或密码不正确");
//        if(!SecurityUtil.md5(username,password).equals(teacher.getPassword())){
//                throw new ExamException("用户名密码不正确");
//            }
        if(teacher.getStatus()==0)throw new ExamException("用户已经被停用，请与管理员联系");
        return teacher;
    }
}
