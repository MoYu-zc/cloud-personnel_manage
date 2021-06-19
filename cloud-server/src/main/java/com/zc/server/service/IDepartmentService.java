package com.zc.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zc.server.pojo.Department;
import com.zc.server.pojo.RespBean;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author MoYu
 * @since 2021-04-10
 */
public interface IDepartmentService extends IService<Department> {

    /**
     * 获取所有部门
     *
     * @return
     */
    List<Department> getAllDepartment();

    /**
     * 添加部门
     *
     * @param dep
     * @return
     */
    RespBean addDep(Department dep);

    /**
     * 删除部门
     *
     * @param id
     * @return
     */
    RespBean deleteDep(Integer id);
}
