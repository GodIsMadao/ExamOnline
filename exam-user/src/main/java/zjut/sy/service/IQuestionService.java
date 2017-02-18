package zjut.sy.service;

import zjut.sy.basic.model.Pager;
import zjut.sy.model.Question;
import zjut.sy.model.Student;
import zjut.sy.model.StudentQuestion;

import java.util.List;

/**
 * Created by dell on 2016/4/19.
 */
public interface IQuestionService {
    //    public void add(Question question);
//    public void update(Question question);
//    public void delete(int id);
    public Long CountRightQuestions(int pid, int sid);

    public Long CountWrongQuestions(int pid, int sid);


    public Question load(int qid);
//    public List<Question> listQuestion();
//    public void deleteQuestionPapers(int id);

    //    列出写错该题目的学生
    public List<Student> listQuestionWrongStu(int qid);

    public StudentQuestion loadByStuIdQuestionId(int sid,int qid);

    //    列出写对该题目的学生
    public List<Student> listQuestionRightStu(int qid);

    //根据paperid来列出questions
    public Pager<Question> findQuestionsByPaperId(int pid);

    //从题库里列出question(预览用和管理员管理)
    public Pager<Question> findQuestion();

    //把answer加入stu_question,并判断每题的正确与否，设置right_status
    public void addStuAnswer(int sid, int qid, String answer);
}
