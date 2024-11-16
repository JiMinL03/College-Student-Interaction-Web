package com.example.College_Student_Interaction_Web.Entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class deptEntityId implements Serializable {

    // Getter and Setter
    private String d_group;
    private String d_dept;

    // 기본 생성자
    public deptEntityId() {}

    // 생성자
    public deptEntityId(String d_group, String d_dept) {
        this.d_group = d_group;
        this.d_dept = d_dept;
    }

    // equals()와 hashCode() 메서드 오버라이드
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        deptEntityId that = (deptEntityId) o;
        return d_group.equals(that.d_group) && d_dept.equals(that.d_dept);
    }

    @Override
    public int hashCode() {
        return 31 * d_group.hashCode() + d_dept.hashCode();
    }
}
