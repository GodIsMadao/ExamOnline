package zjut.sy.model;

import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by dell on 2016/4/22.
 */
@Entity
@Table(name="t_teacher")
public class Teacher {
    private int id;
    private String username;
    private String password;
    private String realname;
    private String address;
    private String school;
    private String email;
    private int phone;
    private Date create_date;
    private int status;
    private String pic_path;
//    private String shotcut_path;

    public Teacher() {
    }

    public Teacher(int id, String username, String password, String address, String realname, String school, String email, int phone, int status, String pic_path) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.realname = realname;
        this.school = school;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.pic_path = pic_path;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull(message = "用户名不能为空")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotNull(message = "姓名不能为空")
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Email(message = "邮件格式不对")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
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

    public String getPic_path() {
        return pic_path;
    }

    public void setPic_path(String pic_path) {
        this.pic_path = pic_path;
    }

//    public String getShotcut_path() {
//        return shotcut_path;
//    }
//
//    public void setShotcut_path(String shotcut_path) {
//        this.shotcut_path = shotcut_path;
//    }

    @NotNull(message = "用户名密码不能为空")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
