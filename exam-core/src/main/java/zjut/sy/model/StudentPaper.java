package zjut.sy.model;

import javax.persistence.*;

/**
 * Created by dell on 2016/4/25.
 */
@Entity
@Table(name = "t_stu_paper")
public class StudentPaper {
    private int id;
    private Student student;
    private Exampaper paper;
    private long score;
    //学生是否做过试卷状态  0:待写试卷 1:已经写过
    private int write_status;

    public StudentPaper() {
    }

    public StudentPaper(int id, Student student, Exampaper paper, int score,int write_status) {
        this.id = id;
        this.student = student;
        this.paper = paper;
        this.score = score;
        this.write_status=write_status;
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
    @JoinColumn(name = "p_id")
    public Exampaper getPaper() {
        return paper;
    }

    public void setPaper(Exampaper paper) {
        this.paper = paper;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public int getWrite_status() {
        return write_status;
    }

    public void setWrite_status(int write_status) {
        this.write_status = write_status;
    }
}
