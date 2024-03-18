package com.atguigu.gulimall.order.controller;

import com.atguigu.gulimall.order.service.OmsOrderSettingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/oms_order_setting")
public class OmsOrderSettingController {

    @Resource
    private OmsOrderSettingService omsOrderSettingService;

}
