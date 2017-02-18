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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by dell on 2016/4/25.
 */
@Service("studentService")
public class StudentService implements IStudentService{
    private IStudentDao studentDao;
    private IExampaperDao exampaperDao;
    private ITeacherDao teacherDao;
    private IQuestionDao questionDao;

    public IQuestionDao getQuestionDao() {
        return questionDao;
    }

    @Inject
    public void setQuestionDao(IQuestionDao questionDao) {
        this.questionDao = questionDao;
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

    public ITeacherDao getTeacherDao() {
        return teacherDao;
    }

    @Inject
    public void setTeacherDao(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public List<Integer> listStuScore(int sid) {
        return studentDao.listStudentScore(sid);
    }

    @Override
    public void updateStuInfo(Student student) {
        studentDao.update(student);
    }

    //列出已经写过的试卷


    @Override
    public Pager<Student> findStudent(int tid) {
        return studentDao.findStudent(tid);
    }

    @Override
    public Pager<Student> findStudent() {
        return studentDao.findStudent();
    }

    @Override
    public void updateStatus(int id) {
        Student s = studentDao.load(id);
        if(s==null) throw new ExamException("修改状态的学生不存在");
        if(s.getStatus()==0) s.setStatus(1);
        else s.setStatus(0);
        studentDao.update(s);
    }

//    @Override
//    public Pager<Student> findStudentOrderByScore() {
//        return studentDao.findStudentOrderByScore();
//    }

//    @Override
//    public List<Long> listCount() {
//        long count1=studentDao.count1();
//        long count2=studentDao.count2();
//        long count3=studentDao.count3();
//        long count4=studentDao.count4();
//        long count5=studentDao.count5();
//        List<Long> listCount=new ArrayList<Long>();
//        listCount.add(count1);
//        listCount.add(count2);
//        listCount.add(count3);
//        listCount.add(count4);
//        listCount.add(count5);
//        return listCount;
//    }

    @Override
    public void add(Student student, Integer tid) {
        Student s=studentDao.loadByStudentname(student.getUsername());
        if(s!=null)throw new ExamException("用户名已存在，不能添加");
        student.setCreate_date(new Date());
//        studentDao.add(student);
        teacherDao.addTeachStudent(teacherDao.load(tid), student);
    }


    @Override
    public Pager<Exampaper> listStuPaperWrited(Student student) {
        return exampaperDao.findStudentPapersWrited(student.getId());
    }

    @Override
    public void add(Student student, Exampaper paper) {
        studentDao.addStudentExampaper(student,paper);
    }

    @Override
    public StudentPaper loadStudentExampaper(int sId, int paperId) {
        return studentDao.loadStudentExampaper(sId,paperId);
    }

    @Override
    public Pager<Exampaper> listStuPaperUnwrite(Student student) {
        return exampaperDao.findStudentPapersUnwrite(student.getId());
    }

    @Override
    public List<Integer> listStudentPaperIds(int sid) {
        return studentDao.listStudentPaperIds(sid);
    }

    @Override
    public List<Integer> listStudentPaperWritenIds(int sid) {
        return studentDao.listStudentPaperWritenIds(sid);
    }

    @Override
    public List<Integer> listStudentPaperUnwritenIds(int sid) {
        return studentDao.listStudentPaperUnwritenIds(sid);
    }

    @Override
    public List<String> listStudentWritenPname(int sid) {
        return studentDao.listStudentWritenPname(sid);
    }

    @Override
    public List<String> listStudentUnwritenPname(int sid) {
        return studentDao.listStudentUnwritenPname(sid);
    }

    @Override
    public Student load(int id) {
        return studentDao.load(id);
    }

    //列出已经写过的试题
    @Override
    public Pager<Question> listStuQuestion(Student student) {
        return questionDao.findStudentQuestions(student.getId());
    }
//列出写对的题目
    @Override
    public Pager<Question> listStuQuestionRight(Student student) {
        return questionDao.findStudentQuestionsRight(student.getId());
    }
//列出写错的题目
    @Override
    public Pager<Question> listStuQuestionWrong(Student student) {
        return questionDao.findStudentQuestionWrong(student.getId());
    }


    @Override
    public Student login(String username, String password) {
        Student student=studentDao.loadByStudentname(username);
        if(student==null)throw new ExamException("用户名或密码不正确");
        if(student.getStatus()==0)throw new ExamException("用户已经被停用，请与管理员联系");
        return student;
    }
}
