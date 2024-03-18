package com.atguigu.gulimall.order.controller;

import com.atguigu.gulimall.order.service.OmsOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/oms_order")
public class OmsOrderController {

    @Resource
    private OmsOrderService omsOrderService;

}
