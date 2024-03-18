package com.atguigu.gulimall.order.controller;

import com.atguigu.gulimall.order.service.OmsOrderOperateHistoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/oms_order_operate_history")
public class OmsOrderOperateHistoryController {

    @Resource
    private OmsOrderOperateHistoryService omsOrderOperateHistoryService;

}
