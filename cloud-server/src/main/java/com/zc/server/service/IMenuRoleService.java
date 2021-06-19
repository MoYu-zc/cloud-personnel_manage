package com.zc.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zc.server.pojo.MenuRole;
import com.zc.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MoYu
 * @since 2021-04-10
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
