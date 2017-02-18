package zjut.sy.service;

import org.springframework.stereotype.Service;
import zjut.sy.basic.model.Pager;
import zjut.sy.dao.IQuestionDao;
import zjut.sy.model.Question;
import zjut.sy.model.Student;
import zjut.sy.model.StudentQuestion;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by dell on 2016/4/19.
 */
@Service("questionService")
public class QuestionService implements IQuestionService{
    private IQuestionDao questionDao;


    public IQuestionDao getQuestionDao() {
        return questionDao;
    }

    @Inject
    public void setQuestionDao(IQuestionDao questionDao) {
        this.questionDao = questionDao;
    }


    @Override
    public Question load(int id) {
        return questionDao.load(id);
    }

    @Override
    public List<Student> listQuestionWrongStu(int qid) {
        return questionDao.listWrongStudentByQuestionId(qid);
    }

    @Override
    public Pager<Question> findQuestionsByPaperId(int pid) {
        return questionDao.findQuestion(pid);
    }

    @Override
    public Pager<Question> findQuestion() {
        return questionDao.find();
    }

    @Override
    public StudentQuestion loadByStuIdQuestionId(int sid, int qid) {
        return questionDao.loadByStuIdQuestionId(sid,qid);
    }

    @Override
    public void addStuAnswer(int sid, int qid,String answer) {
        questionDao.addStuAnswer(sid,qid,answer);
    }

    @Override
    public Long CountRightQuestions(int pid, int sid) {
        return questionDao.CountRightQuestions(pid,sid);
    }

    @Override
    public Long CountWrongQuestions(int pid, int sid) {
        return questionDao.CountWrongQuestions(pid,sid);
    }

    @Override
    public List<Student> listQuestionRightStu(int qid) {
        return questionDao.listRightStudentByQuestionId(qid);
    }
}
