package com.zc.service.impl;

import com.zc.pojo.Department;
import com.zc.mapper.DepartmentMapper;
import com.zc.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MoYu
 * @since 2021-04-17
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
