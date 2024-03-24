package com.atguigu.gulimall.member.controller;

import com.atguigu.gulimall.member.service.MemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/ums_member")
public class MemberController {

    @Resource
    private MemberService umsMemberService;

}
