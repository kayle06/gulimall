package com.atguigu.gulimall.member.controller;

import com.atguigu.gulimall.member.service.MemberLoginLogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/ums_member_login_log")
public class MemberLoginLogController {

    @Resource
    private MemberLoginLogService umsMemberLoginLogService;

}
