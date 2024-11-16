package com.example.College_Student_Interaction_Web.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@IdClass(deptEntityId.class)  // 복합키를 위한 클래스를 지정
public class deptEntity {

    @Id
    @Column(length = 50)
    private String d_group;

    @Id
    @Column(length = 50)
    private String d_dept;  // 복합키의 두 번째 필드

    // Getters and Setters
    public String getD_group() {
        return d_group;
    }

    public void setD_group(String d_group) {
        this.d_group = d_group;
    }

    public String getD_dept() {
        return d_dept;
    }

    public void setD_dept(String d_dept) {
        this.d_dept = d_dept;
    }
}
