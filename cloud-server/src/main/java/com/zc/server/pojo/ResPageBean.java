package com.zc.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页公共返回对象
 *
 * @Author MoYu
 * @Date 2021/5/6 21:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResPageBean {

    /**
     * 总条数
     */
    private Long total;
    /**
     * 数据List
     */
    private List<?> data;

}

