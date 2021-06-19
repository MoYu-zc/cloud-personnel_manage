package com.zc.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zc.server.mapper.OplogMapper;
import com.zc.server.pojo.Oplog;
import com.zc.server.service.IOplogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MoYu
 * @since 2021-04-10
 */
@Service
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
