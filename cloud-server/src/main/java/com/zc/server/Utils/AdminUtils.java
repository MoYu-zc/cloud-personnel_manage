package com.zc.server.Utils;

import com.zc.server.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * 操作员工具类
 *
 * @Author MoYu
 * @Date 2021/5/5 23:20
 */
public class AdminUtils {

    public static Admin getCurrentAdmin(){
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}

