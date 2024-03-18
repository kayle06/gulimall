package com.atguigu.gulimall.order.controller;

import com.atguigu.gulimall.order.service.OmsPaymentInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/oms_payment_info")
public class OmsPaymentInfoController {

    @Resource
    private OmsPaymentInfoService omsPaymentInfoService;

}
