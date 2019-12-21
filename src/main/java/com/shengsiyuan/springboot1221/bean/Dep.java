package com.shengsiyuan.springboot1221.bean;


public class Dep {
    private Integer id;
    private String deptname;
    private Integer locadd;
    private Integer num;

    public Dep() {
    }

    public Dep(Integer id, String deptname, Integer locadd, Integer num) {
        this.id = id;
        this.deptname = deptname;
        this.locadd = locadd;
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public Integer getLocadd() {
        return locadd;
    }

    public void setLocadd(Integer locadd) {
        this.locadd = locadd;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Dep{" +
                "id=" + id +
                ", deptname='" + deptname + '\'' +
                ", locadd=" + locadd +
                ", num=" + num +
                '}';
    }
}
