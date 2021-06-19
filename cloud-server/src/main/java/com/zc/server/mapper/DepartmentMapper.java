package com.zc.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zc.server.pojo.Department;

import java.util.List;


/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author MoYu
 * @since 2021-04-10
 */
public interface DepartmentMapper extends BaseMapper<Department> {

    /**
     * 获取所有部门
     *
     * @return
     */
    List<Department> getAllDepartment(Integer parentId);

    /**
     * 添加部门
     *
     * @param dep
     */
    void addDep(Department dep);

    /**
     * 删除部门
     *
     * @param dep
     */
    void deleteDep(Department dep);
}
