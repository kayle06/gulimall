package com.atguigu.gulimall.member.controller;

import com.atguigu.gulimall.member.service.UmsMemberStatisticsInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/ums_member_statistics_info")
public class UmsMemberStatisticsInfoController {

    @Resource
    private UmsMemberStatisticsInfoService umsMemberStatisticsInfoService;

}
