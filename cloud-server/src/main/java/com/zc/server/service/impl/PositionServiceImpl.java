package com.zc.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zc.server.mapper.PositionMapper;
import com.zc.server.pojo.Position;
import com.zc.server.service.IPositionService;
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
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

}
