package com.atguigu.gulimall.member.controller;

import com.atguigu.gulimall.member.service.MemberLevelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/ums_member_level")
public class MemberLevelController {

    @Resource
    private MemberLevelService umsMemberLevelService;

}
