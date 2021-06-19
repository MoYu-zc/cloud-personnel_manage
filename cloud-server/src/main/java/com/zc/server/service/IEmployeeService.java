package com.zc.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zc.server.pojo.Employee;
import com.zc.server.pojo.ResPageBean;
import com.zc.server.pojo.RespBean;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author MoYu
 * @since 2021-04-10
 */
public interface IEmployeeService extends IService<Employee> {

    /**
     * 获取所有员工(分页)
     *
     * @param currentPage
     * @param size
     * @param employee
     * @param beginDateScope
     * @return
     */
    ResPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);

    /**
     * 获取最大工号
     *
     * @return
     */
    RespBean maxWorkID();

    /**
     * 添加员工
     *
     * @param employee
     * @return
     */
    RespBean addEmp(Employee employee);

    /**
     * 查询员工
     *
     * @param id
     * @return
     */
    List<Employee> getEmployee(Integer id);

    /**
     * 获取所有员工账套
     *
     * @param currentPage
     * @param size
     * @return
     */
    ResPageBean getEmployeeWithSalary(Integer currentPage, Integer size);
}
