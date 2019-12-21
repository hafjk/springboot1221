package com.shengsiyuan.springboot1221.service.imp;

import com.shengsiyuan.springboot1221.bean.Dep;
import com.shengsiyuan.springboot1221.bean.DepVo;
import com.shengsiyuan.springboot1221.mapper.DepMapper;
import com.shengsiyuan.springboot1221.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepServiceImp implements DepService {

    @Autowired
    DepMapper depMapper;

    @Override
    public Dep selectDepById(Integer id) {
        return depMapper.selectDepById(id);
    }

    @Override
    public List<Dep> selectAllDep() {
        return depMapper.selectAllDep();
    }

    @Override
    public void updateDep(Dep dep) {
        depMapper.updateDep(dep);
    }

    @Override
    public void deleteDepById(Integer id) {
        depMapper.deleteDepById(id);
    }

    @Override
    public void insertDep(Dep dep) {
        depMapper.insertDep(dep);
    }

    @Override
    public DepVo selectDepEmp(Integer id) {
        return depMapper.selectDepEmp(id);
    }
}
