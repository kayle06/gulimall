package com.atguigu.gulimall.member.controller;

import com.atguigu.gulimall.member.service.UmsMemberLoginLogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/ums_member_login_log")
public class UmsMemberLoginLogController {

    @Resource
    private UmsMemberLoginLogService umsMemberLoginLogService;

}
