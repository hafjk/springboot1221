package com.shengsiyuan.springboot1221.service;


import com.shengsiyuan.springboot1221.bean.Dep;
import com.shengsiyuan.springboot1221.bean.DepVo;

import java.util.List;

public interface DepService {

//    通过id查找dep
    public Dep selectDepById(Integer id);

    //    查找全部dep
    public List<Dep> selectAllDep();

    //    根据id更新dep
    public void updateDep(Dep dep);


    //    根据id删除dep
    public void deleteDepById(Integer id);

    //    新增dep
    public void insertDep(Dep dep);

    //    通过id查找部门的每个员工信息
    public DepVo selectDepEmp(Integer id);
}
