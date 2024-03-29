package com.atguigu.gulimall.member.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimall.member.entity.MemberLoginLogEntity;
import com.atguigu.gulimall.member.dao.MemberLoginLogDao;
import com.atguigu.gulimall.member.service.MemberLoginLogService;
@Service
public class MemberLoginLogServiceImpl extends ServiceImpl<MemberLoginLogDao, MemberLoginLogEntity> implements MemberLoginLogService {

}
