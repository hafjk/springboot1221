package com.shengsiyuan.springboot1221.bean;

import java.io.Serializable;

public class Emp implements Serializable {

    private Integer id;
    private String name;
    private Integer deptid;

    public Emp() {
    }

    public Emp(Integer id, String name, Integer deptid) {
        this.id = id;
        this.name = name;
        this.deptid = deptid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptid=" + deptid +
                '}';
    }
}
