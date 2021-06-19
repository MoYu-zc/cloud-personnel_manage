package com.zc.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zc.server.pojo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MoYu
 * @since 2021-04-10
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 通过用户id查询菜单列表
     *
     * @return
     */
    List<Menu> getMenusByAdminId();

    /**
     * 根据角色获取菜单列表
     * @return
     */
    List<Menu> getMenusWithRole();

    /**
     * 查询所有菜单
     * @return
     */
    List<Menu> getAllMenus();
}
