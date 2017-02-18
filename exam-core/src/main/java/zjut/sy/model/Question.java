package zjut.sy.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by dell on 2016/4/18.
 * 试题类
 */
@Entity
@Table(name="t_question")
public class Question {
    private int id;
    private String content;
    private String answer;
    private Exampaper exampaper;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    //教师可填写的每题解析
    private String comment;

    public Question() {
    }

    public Question(int id, String content, String answer, Exampaper exampaper, String choice1, String choice2, String choice3, String choice4,String comment) {
        this.id = id;
        this.content = content;
        this.answer = answer;
        this.exampaper = exampaper;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
        this.comment=comment;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    @NotNull(message="题干不能为空")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @NotNull(message="答案不能为空")
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @ManyToOne
    @JoinColumn(name = "p_id")
    public Exampaper getExampaper() {
        return exampaper;
    }

    public void setExampaper(Exampaper exampaper) {

        this.exampaper = exampaper;
    }

    @NotEmpty
    public String getChoice1() {
        return choice1;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    @NotEmpty
    public String getChoice2() {
        return choice2;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    @NotEmpty
    public String getChoice3() {
        return choice3;
    }

    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }

    @NotEmpty
    public String getChoice4() {
        return choice4;
    }

    public void setChoice4(String choice4) {
        this.choice4 = choice4;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
