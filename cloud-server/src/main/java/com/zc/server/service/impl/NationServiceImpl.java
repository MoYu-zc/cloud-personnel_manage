package com.zc.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zc.server.mapper.NationMapper;
import com.zc.server.pojo.Nation;
import com.zc.server.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
