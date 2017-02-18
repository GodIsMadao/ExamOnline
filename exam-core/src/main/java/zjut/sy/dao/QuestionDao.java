package zjut.sy.dao;

import org.springframework.stereotype.Repository;
import zjut.sy.basic.dao.BaseDao;
import zjut.sy.basic.model.Pager;
import zjut.sy.model.Question;
import zjut.sy.model.Student;
import zjut.sy.model.StudentQuestion;

import java.util.List;

/**
 * Created by dell on 2016/4/18.
 */
@SuppressWarnings("JpaQlInspection")
@Repository("questionDao")
public class QuestionDao extends BaseDao<Question> implements IQuestionDao {
    @Override
    public void deleteQuestionExampapers(int qid) {
        this.updateByHql("delete Question q where q.id=?",qid);
    }

    @Override
    public Pager<Question> findQuestion(int pid) {
        return this.find("from Question q where q.exampaper.id=?",pid);
    }

    @Override
    public List<Question> listQuestion() {
        return this.list("from Question");
    }

    @Override
    public StudentQuestion loadByStuIdQuestionId(int sid, int qid) {
        String hql="select sq from StudentQuestion sq where sq.student.id=? and sq.question.id=?";
        return (StudentQuestion) this.getSession().createQuery(hql).setParameter(0,sid).setParameter(1,qid).uniqueResult();
    }

    @Override
    public List<Question> listQuestionByPaperId(int pid) {
        String hql="select q from Question q where q.exampaper.id=?";
        return this.getSession().createQuery(hql).setParameter(0,pid).list();
    }

    @Override
    public Pager<Question> find() {
        return this.find("from Question");
    }

    @Override
    public Pager<Question> findStudentQuestions(int sId) {
        String hql="select sq.question from StudentQuestion sq left join sq.student s where s.id=?";
        return this.find(hql,sId);
    }

    @Override
    public void addStuAnswer(int sid, int qid, String answer) {
        StudentQuestion sq=this.loadByStuIdQuestionId(sid, qid);
        Question q=this.load(qid);
        System.out.println(sq.getId());
        System.out.println("answer:"+answer);
        sq.setStu_answer(answer);
        if(answer.equals(q.getAnswer()))
        {
            sq.setRight_status(1);
        } else{
            sq.setRight_status(2);
        }
        this.getSession().save(sq);
    }

    @Override
    public Long CountRightQuestions(int pid, int sid) {
        String hql="select count(sq.id) from StudentQuestion sq left join sq.student s left join sq.question.exampaper p where sq.right_status=1 and s.id=? and p.id=?";
        return (Long) this.getSession().createQuery(hql).setParameter(0,sid).setParameter(1,pid).uniqueResult();
    }

    @Override
    public Long CountWrongQuestions(int pid, int sid) {
        String hql="select count(sq.id) from StudentQuestion sq left join sq.student s left join sq.question.exampaper p where sq.right_status=2 and s.id=? and p.id=?";
        return (Long) this.getSession().createQuery(hql).setParameter(0,sid).setParameter(1,pid).uniqueResult();
    }

    @Override
    public Pager<Question> findStudentQuestionsRight(int sId) {
        String hql="select sq.question from StudentQuestion sq left join sq.student s where s.id=? and sq.right_status=1 ";
        return this.find(hql,sId);
    }

    @Override
    public Pager<Question> findStudentQuestionWrong(int sId) {
        String hql="select sq.question from StudentQuestion sq left join sq.student s where s.id=? and sq.right_status=2";
        return this.find(hql,sId);
    }

    @Override
    public List<Student> listStudentByQuestionId(int qid) {
        String hql="select sq.student from StudentQuestion sq where sq.question.id=?";
        return this.getSession().createQuery(hql).setParameter(0,qid).list();
    }

    @Override
    public List<Student> listRightStudentByQuestionId(int qid) {
        String hql="select sq.student from StudentQuestion sq where sq.question.id=? and sq.right_status=1";
        return this.getSession().createQuery(hql).setParameter(0,qid).list();
    }

    @Override
    public List<Student> listWrongStudentByQuestionId(int qid) {
        String hql="select sq.student from StudentQuestion sq where sq.question.id=? and sq.right_status=2";
        return this.getSession().createQuery(hql).setParameter(0,qid).list();
    }
}
