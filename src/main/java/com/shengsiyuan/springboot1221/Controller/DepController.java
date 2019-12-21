package com.shengsiyuan.springboot1221.Controller;

import com.shengsiyuan.springboot1221.bean.Dep;
import com.shengsiyuan.springboot1221.bean.DepVo;
import com.shengsiyuan.springboot1221.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepController {
    @Autowired
    DepService depService;

    @PostMapping("/findDepById")
    public Dep findDepById(@RequestParam("id") Integer id){
       return depService.selectDepById(id);
    }
    //    查找全部dep
    @GetMapping("/findAllDep")
   public List<Dep> findAllDep(){
        return depService.selectAllDep();
   }


    //    根据id更新dep
    @PostMapping("/updateDep")
    public String updateDep(Dep dep){
        depService.updateDep(dep);
        return "success";
    }
//    public void updateDep(Dep dep);


    //    根据id删除dep
    @GetMapping("/deleteDepById/{id}")
    public String  deleteDepById(@PathVariable("id") Integer id){
        depService.deleteDepById(id);
        return "success";
    }

    //    新增dep
    @PostMapping("/insertDep")
    public String insertDep(Dep dep){
        depService.insertDep(dep);
        return "success";
    }

    //    通过id查找部门的每个员工信息
    @GetMapping("/selectDepEmp/{id}")
    public DepVo selectDepEmp(@PathVariable("id") Integer id){

        return depService.selectDepEmp(id);
    }
}
