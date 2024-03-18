package com.atguigu.gulimall.order.controller;

import com.atguigu.gulimall.order.service.OmsRefundInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/oms_refund_info")
public class OmsRefundInfoController {

    @Resource
    private OmsRefundInfoService omsRefundInfoService;

}
