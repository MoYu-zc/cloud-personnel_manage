package com.zc.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.zc.server.Utils.AdminUtils;
import com.zc.server.mapper.MenuMapper;
import com.zc.server.pojo.Menu;
import com.zc.server.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;


import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MoYu
 * @since 2021-04-10
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    @Resource
    private MenuMapper menuMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 通过用户id查询菜单列表
     * @return
     */
    @Override
    public List<Menu> getMenusByAdminId() {
        Integer id = AdminUtils.getCurrentAdmin().getId();
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        //Mredis获取菜单数据
        List<Menu> menus =(List<Menu>)valueOperations.get("menu_"+ id);
        //如果为空，去数据库获取
        if(CollectionUtils.isEmpty(menus)){
            menus = menuMapper.getMenusByAdminId(id);
            //将数据设置到Redis中
            valueOperations.set("menu."+id,menus);
        }
        return menus;
    }

    /**
     * 根据角色获取菜单列表
     * @return
     */
    @Override
    public List<Menu> getMenusWithRole() {
        return menuMapper.getMenusWithRole();
    }

    /**
     * 查询所有菜单
     * @return
     */
    @Override
    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }
}
