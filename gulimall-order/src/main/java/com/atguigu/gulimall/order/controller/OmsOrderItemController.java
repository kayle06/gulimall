package com.atguigu.gulimall.order.controller;

import com.atguigu.gulimall.order.service.OmsOrderItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/oms_order_item")
public class OmsOrderItemController {

    @Resource
    private OmsOrderItemService omsOrderItemService;

}
