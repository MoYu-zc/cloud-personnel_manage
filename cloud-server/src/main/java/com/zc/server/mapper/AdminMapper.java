package com.zc.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zc.server.pojo.Admin;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author MoYu
 * @since 2021-04-10
 */
public interface AdminMapper extends BaseMapper<Admin> {

    /**
     * 获取所有操作员
     * @param id
     * @param keyword
     * @return
     */
    List<Admin> getAllAdmins(Integer id, String keyword);
}
