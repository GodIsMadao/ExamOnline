package zjut.sy.exam.dto;

import zjut.sy.model.Question;

import java.util.List;

/**
 * Created by dell on 2016/6/16.
 */
public class Question1Dto {
    private Question question;
    private String stu_answer;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getStu_answer() {
        return stu_answer;
    }

    public void setStu_answer(String stu_answer) {
        this.stu_answer = stu_answer;
    }

    public Question1Dto() {
        super();
    }

    public Question1Dto(Question question, String stu_answer) {
        this.question = question;
        this.stu_answer = stu_answer;
    }
}
