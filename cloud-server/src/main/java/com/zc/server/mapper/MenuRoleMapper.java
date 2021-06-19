package com.zc.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zc.server.pojo.MenuRole;
import org.apache.ibatis.annotations.Param;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author MoYu
 * @since 2021-04-10
 */
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return 返回值
     */
    Integer insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);
}
