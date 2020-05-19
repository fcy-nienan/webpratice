package com.fcy.MybatisDemo.Model;

public class Students {
    private Integer sid;

    private String name;

    private String subject;

    private Integer grade;

    public Students() {

    }

    public Students(Integer sid, String name, String subject, Integer grade) {
        super();
        this.sid = sid;
        this.name = name;
        this.subject = subject;
        this.grade = grade;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Students [sid=" + sid + ", name=" + name + ", subject=" + subject + ", grade=" + grade + "]";
    }

}