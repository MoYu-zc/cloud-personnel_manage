package com.zc.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zc.server.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author MoYu
 * @since 2021-04-10
 */
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {


    List<Menu> getMenusByAdminId(Integer id);

    List<Menu> getMenusWithRole();

    List<Menu> getAllMenus();
}
