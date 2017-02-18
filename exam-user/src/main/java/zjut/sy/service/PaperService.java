package zjut.sy.service;

import org.springframework.stereotype.Service;
import zjut.sy.basic.model.Pager;
import zjut.sy.dao.IExampaperDao;
import zjut.sy.dao.IQuestionDao;
import zjut.sy.dao.IStudentDao;
import zjut.sy.dao.ITeacherDao;
import zjut.sy.model.*;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

/**
 * Created by dell on 2016/4/19.
 */
@Service("paperService")
public class PaperService implements IPaperService {
    private IExampaperDao paperDao;
    private IQuestionDao questionDao;
//    private ITeacherDao teacherDao;
    private IStudentDao studentDao;

    public IExampaperDao getPaperDao() {
        return paperDao;
    }

    @Inject
    public void setPaperDao(IExampaperDao paperDao) {
        this.paperDao = paperDao;
    }

    public IQuestionDao getQuestionDao() {
        return questionDao;
    }

    @Inject
    public void setQuestionDao(IQuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    //向试卷内添加试题
    @Override
    public void addQuestion(Exampaper paper, Question question) {
        //for(int i=0;i<50;i++){}
//        或者在页面层实现循环添加试题
        //两步走，一个把除了外键其他的set进
//        questionDao.addQuestion(question);
        paperDao.addPaperQuestion(paper,question);
    }

    @Override
    public List<String> listStuAnswer(int sid, int pid) {
        return paperDao.listStuAnswer(sid,pid);
    }

    @Override
    public void updateCStatusPass(int pid) {
        Exampaper paper=this.load(pid);
        paper.setCheck_status(2);
        paperDao.update(paper);
    }

    @Override
    public void releasePaper(int pid,int tid) {
        Exampaper paper=this.load(pid);
        paper.setCheck_status(3);
        paperDao.update(paper);
        paperDao.releasePaper(pid,tid);
    }

    @Override
    public void updateCStatusUnPass(int pid) {
        Exampaper paper=this.load(pid);
        paper.setCheck_status(4);
        paperDao.update(paper);
    }

    @Override
    public Teacher loadTeacherByPaperId(int pid) {
        return paperDao.loadTeacherByPaperId(pid);
    }

    @Override
    public List<Student> listStudentByPaperId(int pid) {
        return paperDao.listStudentByPaperId(pid);
    }

    @Override
    public void addStuPaper(int pid, Student student) {
        paperDao.addPaperStu(pid,student);
    }

    @Override
    public void addScorePaperStu(int pid, Student student) {
        paperDao.addScorePaperStu(pid,student);
    }

    @Override
    public void changeStatusPaperStu(int pid, Student student) {
        paperDao.changeStatusStuPaper(pid,student);
    }

    @Override
    public List<Question> listQuestion(int pid) {
        return paperDao.listQuestion(pid);
    }

    @Override
    public void deleteQuestion(Question question) {
        if(question==null)throw new ExamException("要删除的试题不存在");
        paperDao.deleteExampaperQuestion(question.getExampaper().getId(),question.getId());
    }

    @Override
    public void updateQuestion(Question question) {
        questionDao.update(question);
    }

    @Override
    public Exampaper load(int id) {
        return paperDao.load(id);
    }

    @Override
    public Pager<Exampaper> findExampaper() {
        return paperDao.findExampaper();
    }

    @Override
    public Pager<Exampaper> findExampaperTeacher(Teacher teacher) {
        return paperDao.findExampaperTeacher(teacher.getId());
    }

    @Override
    public Pager<Exampaper> findExampaperReleased(Teacher teacher) {
        return paperDao.findExampaperReleased(teacher.getId());
    }

    @Override
    public Pager<Exampaper> findExampaperReleased() {
        return paperDao.findExampaperReleased();
    }

    @Override
    public Pager<Exampaper> findExampaperChecked(Teacher teacher) {
        return paperDao.findExampaperChecked(teacher.getId());
    }

    @Override
    public Pager<Exampaper> findExampaperChecked() {
        return paperDao.findExampaperChecked();
    }

    @Override
    public Pager<Exampaper> findExampaperUnchecked(Teacher teacher) {
        return paperDao.findExampaperUnchecked(teacher.getId());
    }

    @Override
    public Pager<Exampaper> findExampaperUnchecked() {
        return paperDao.findExampaperUnchecked();
    }

    @Override
    public Pager<Exampaper> findExampaperUnpass(Teacher teacher) {
        return paperDao.findExampaperUnpass(teacher.getId());
    }

    @Override
    public Pager<Exampaper> findExampaperUnpass() {
        return paperDao.findExampaperUnpass();
    }

    @Override
    public List<Exampaper> listExampaper() {
        return paperDao.listExampaper();
    }

    @Override
    public void deletePaper(int pid) {
        paperDao.delete(pid);
    }

}
