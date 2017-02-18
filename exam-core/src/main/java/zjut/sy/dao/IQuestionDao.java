package zjut.sy.dao;

import zjut.sy.basic.dao.IBaseDao;
import zjut.sy.basic.model.Pager;
import zjut.sy.model.Question;
import zjut.sy.model.Student;
import zjut.sy.model.StudentQuestion;

import java.util.List;

/**
 * Created by dell on 2016/4/18.
 */
public interface IQuestionDao extends IBaseDao<Question> {
    public List<Question> listQuestion();
//根据pid来查找question
    public Pager<Question> findQuestion(int pid);
    //根据题库里Question
    public Pager<Question> find();

    public List<Question> listQuestionByPaperId(int pid);

    public List<Student> listStudentByQuestionId(int qid);

    public List<Student> listRightStudentByQuestionId(int qid);

    public List<Student> listWrongStudentByQuestionId(int qid);

    public void deleteQuestionExampapers(int qid);

    //根据学生id列出试题（可以让学生看自己写了哪些题目）
    public Pager<Question> findStudentQuestions(int sId);
    //根据学生id列出错误试题
    public Pager<Question> findStudentQuestionsRight(int sId);
    //根据学生id列出正确试题
    public Pager<Question> findStudentQuestionWrong(int sId);

    public StudentQuestion loadByStuIdQuestionId(int sid,int qid);

    public void addStuAnswer(int sid, int qid,String answer);

    public Long CountRightQuestions(int pid,int sid);

    public Long CountWrongQuestions(int pid,int sid);

}
