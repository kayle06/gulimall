package com.atguigu.gulimall.member.controller;

import com.atguigu.gulimall.member.service.MemberStatisticsInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/ums_member_statistics_info")
public class MemberStatisticsInfoController {

    @Resource
    private MemberStatisticsInfoService umsMemberStatisticsInfoService;

}
