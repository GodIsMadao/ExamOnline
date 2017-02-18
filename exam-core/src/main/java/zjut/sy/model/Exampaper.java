package zjut.sy.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by dell on 2016/4/18.
 */
@Entity
@Table(name = "t_exampaper")
public class Exampaper {
    //试卷id
    private int id;
    //试卷名称
    private String pname;
    //试卷介绍
    private String tag;
    //试卷生成时间
    private Date create_date;
    //考试时间
    private int time;
    //外键教师id
    private Teacher teacher;
    //试卷审核状态,1:待审核 2：审核待发布 3:已发布 4:审核拒绝（管理员审核，房东发布房间时改变此状态）
    private int check_status;
    //试卷试题数
    private int maxQuestion;
//    private int release_status;

    public Exampaper() {
    }

    public Exampaper(int id, String pname, String tag, Date create_date, int time, Teacher teacher, int check_status, int maxQuestion) {
        this.id = id;
        this.pname = pname;
        this.tag = tag;
        this.create_date = create_date;
        this.time = time;
        this.teacher = teacher;
        this.check_status = check_status;
        this.maxQuestion = maxQuestion;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull(message="试卷名不能为空")
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }


    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {

        this.tag = tag;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {

        this.create_date = create_date;
    }

    @NotNull(message="试卷时间不能为空")
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCheck_status() {
        return check_status;
    }

    public void setCheck_status(int check_status) {
        this.check_status = check_status;
    }

    @ManyToOne
    @JoinColumn(name="t_id")
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @NotNull(message="试卷题量不能为空")
    public int getMaxQuestion() {
        return maxQuestion;
    }

    public void setMaxQuestion(int maxQuestion) {
        this.maxQuestion = maxQuestion;
    }
}
