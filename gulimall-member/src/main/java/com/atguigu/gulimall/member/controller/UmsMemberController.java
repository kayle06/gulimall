package com.atguigu.gulimall.member.controller;

import com.atguigu.gulimall.member.service.UmsMemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/ums_member")
public class UmsMemberController {

    @Resource
    private UmsMemberService umsMemberService;

}
