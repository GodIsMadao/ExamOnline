package zjut.sy.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by dell on 2016/4/22.
 */
@Entity(name="Student")
@Table(name = "t_student")
public class Student {
    private int id;
    private String username;
    private String password;
    private String realname;
    private String address;
    private String sno;
    private String school;
    private String email;
    private Teacher teacher;
    private Date create_date;
    //1:启用 0:禁用
    private int status;
    private String picpath;
//    private String shotcutpath;

    public Student() {
    }

    public Student(int id, String username, String password, String realname, String sno, String address, String school, String email, int status, String picpath) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.realname = realname;
        this.sno = sno;
        this.address = address;
        this.school = school;
        this.email = email;
        this.status = status;
        this.picpath = picpath;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull(message="用户名不能为空")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Email(message="邮件格式不正确")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @ManyToOne
    @JoinColumn(name = "t_id")
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath;
    }

//    public String getShotcutpath() {
//        return shotcutpath;
//    }
//
//    public void setShotcutpath(String shotcutpath) {
//        this.shotcutpath = shotcutpath;
//    }

    @NotNull(message="用户密码不能为空")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
