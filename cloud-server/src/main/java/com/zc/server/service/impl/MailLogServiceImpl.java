package com.zc.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zc.server.mapper.MailLogMapper;
import com.zc.server.pojo.MailLog;
import com.zc.server.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
