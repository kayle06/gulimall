package com.atguigu.gulimall.member.controller;

import com.atguigu.gulimall.member.service.UmsIntegrationChangeHistoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/ums_integration_change_history")
public class UmsIntegrationChangeHistoryController {

    @Resource
    private UmsIntegrationChangeHistoryService umsIntegrationChangeHistoryService;

}
