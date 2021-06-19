package com.zc.server.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.mysql.fabric.xmlrpc.base.ResponseParser;
import com.zc.server.pojo.Employee;
import com.zc.server.pojo.ResPageBean;
import com.zc.server.pojo.RespBean;
import com.zc.server.pojo.Salary;
import com.zc.server.service.IEmployeeService;
import com.zc.server.service.ISalaryService;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 员工账套
 * <p>
 * Create at 2021/5/21 23:42
 *
 * @author MoYu
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/salary/sobcfg")
public class SalarySobCfgController {

    @Autowired
    private ISalaryService salaryService;
    @Autowired
    private IEmployeeService employeeService;

    @ApiOperation(value = "获取所有工资账套")
    @GetMapping("/salaries")
    public List<Salary> getAllSalaries() {
        return salaryService.list();
    }

    @ApiOperation(value = "获取所有员工账套")
    @GetMapping("/")
    public ResPageBean getEmployeeWithSalary(@RequestParam(defaultValue = "1") Integer currentPage, @RequestParam(defaultValue = "10") Integer size) {
        return employeeService.getEmployeeWithSalary(currentPage, size);
    }

    @ApiOperation(value = "更新员工账套")
    @PutMapping("/")
    public RespBean updateEmployeeSalary(Integer eid, Integer sid) {
        if (employeeService.update(new UpdateWrapper<Employee>().set("salaryId", sid).eq("id", eid))) {
            return RespBean.success("更新成功");
        }
        return RespBean.error("更新失败");
    }

}

