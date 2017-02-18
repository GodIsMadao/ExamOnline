package zjut.sy.exam.dto;

import zjut.sy.model.Admin;
import zjut.sy.model.Student;

import java.util.List;

/**
 * Created by dell on 2016/5/11.
 */
public class StudentDto {
    private int id;
    private String username;
    private String password;
    private String realname;
    private String address;
    private String sno;
    private String school;
    private String email;
    //1:启用 0:禁用
    private int status;
    private String picpath;
    private int tid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public Student getStudent(){
        Student s=new Student();
        s.setId(this.id);
        s.setUsername(this.username);
        s.setPassword(this.password);
        s.setStatus(this.status);
        s.setPicpath(this.picpath);
        s.setEmail(this.email);
        s.setSno(this.sno);
        s.setAddress(this.address);
        s.setRealname(this.realname);
        s.setSchool(this.school);
        return s;
    }

    public StudentDto(Student student){
        this.setId(student.getId());
        this.setUsername(student.getUsername());
        this.setPassword(student.getPassword());
        this.setStatus(student.getStatus());
        this.setPicpath(student.getPicpath());
        this.setEmail(student.getEmail());
        this.setSno(student.getSno());
        this.setAddress(student.getAddress());
        this.setRealname(student.getRealname());
        this.setSchool(student.getSchool());
    }

    public StudentDto(Student student,Integer tid){
        this.setId(student.getId());
        this.setUsername(student.getUsername());
        this.setPassword(student.getPassword());
        this.setStatus(student.getStatus());
        this.setPicpath(student.getPicpath());
        this.setEmail(student.getEmail());
        this.setSno(student.getSno());
        this.setAddress(student.getAddress());
        this.setRealname(student.getRealname());
        this.setSchool(student.getSchool());
        this.setTid(tid);
    }

    public StudentDto() {
    }
}
