package zjut.sy.model;

import javax.persistence.*;

/**
 * Created by dell on 2016/4/25.
 */
@Entity
@Table(name = "t_stu_question")
public class StudentQuestion {
    private int id;
    private Student student;
    private Question question;
    //学生答案正确与否，1:正确 2：错误  3:未写
    private int right_status;
    private String stu_answer;

    public StudentQuestion() {
    }

    public StudentQuestion(int id, Student student, Question question, int right_status, String stu_answer) {
        this.id = id;
        this.student = student;
        this.question = question;
        this.right_status = right_status;
        this.stu_answer = stu_answer;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "s_id")
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne
    @JoinColumn(name = "q_id")
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getRight_status() {
        return right_status;
    }

    public void setRight_status(int right_status) {
        this.right_status = right_status;
    }

    public String getStu_answer() {
        return stu_answer;
    }

    public void setStu_answer(String stu_answer) {
        this.stu_answer = stu_answer;
    }
}
