package com.example.College_Student_Interaction_Web.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Blob;

@Entity
@Setter
@Getter
public class userEntity {
    @Id
    @Column(columnDefinition = "text", nullable = false, length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //시퀀스 자동 생성과 비슷함.
    private String u_id;

    @Column(nullable = false, length = 20)
    //not null, 최대글자 20
    private String u_pw;

    @Column(nullable = false, length = 20, unique = true)
    private String u_nickname;

    @Column(nullable = false, length = 10, unique = true)
    private String u_name;

    private int u_age;

    @Column(length = 20)
    private String u_local;

    private Date u_birthday;

    @ManyToOne  // d_group과 d_dept를 사용하여 deptEntity와 다대일 관계 설정
    @JoinColumns({
            @JoinColumn(name = "d_group", referencedColumnName = "d_group"),
            @JoinColumn(name = "d_dept", referencedColumnName = "d_dept")
    })
    private deptEntity dept;

    @Column(length = 20)
    private String u_job; // 조인 설정 필요

    @Column(length = 10)
    private String u_type;

    private int u_point;

    @Lob  // BLOB 타입을 지정
    @Column(name = "u_img")  // 필드명 지정 (optional)
    private Blob u_img;

    // Getter and Setter methods

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getU_pw() {
        return u_pw;
    }

    public void setU_pw(String u_pw) {
        this.u_pw = u_pw;
    }

    public String getU_nickname() {
        return u_nickname;
    }

    public void setU_nickname(String u_nickname) {
        this.u_nickname = u_nickname;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public int getU_age() {
        return u_age;
    }

    public void setU_age(int u_age) {
        this.u_age = u_age;
    }

    public String getU_local() {
        return u_local;
    }

    public void setU_local(String u_local) {
        this.u_local = u_local;
    }

    public Date getU_birthday() {
        return u_birthday;
    }

    public void setU_birthday(Date u_birthday) {
        this.u_birthday = u_birthday;
    }

    public deptEntity getDept() {
        return dept;
    }

    public void setDept(deptEntity dept) {
        this.dept = dept;
    }

    public String getU_job() {
        return u_job;
    }

    public void setU_job(String u_job) {
        this.u_job = u_job;
    }

    public String getU_type() {
        return u_type;
    }

    public void setU_type(String u_type) {
        this.u_type = u_type;
    }

    public int getU_point() {
        return u_point;
    }

    public void setU_point(int u_point) {
        this.u_point = u_point;
    }

    public Blob getU_img() {
        return u_img;
    }

    public void setU_img(Blob u_img) {
        this.u_img = u_img;
    }
}
