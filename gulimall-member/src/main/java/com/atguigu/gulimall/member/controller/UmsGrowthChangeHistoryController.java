package com.atguigu.gulimall.member.controller;

import com.atguigu.gulimall.member.service.UmsGrowthChangeHistoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/ums_growth_change_history")
public class UmsGrowthChangeHistoryController {

    @Resource
    private UmsGrowthChangeHistoryService umsGrowthChangeHistoryService;

}
