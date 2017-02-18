package zjut.sy.exam.dto;

import zjut.sy.model.Question;

import java.util.List;

/**
 * Created by dell on 2016/5/9.
 */
public class QuestionDto {
    private List<Question> questions;

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public QuestionDto(List<Question> questions) {
        super();
        this.questions = questions;
    }

    public QuestionDto() {
        super();
    }
}
