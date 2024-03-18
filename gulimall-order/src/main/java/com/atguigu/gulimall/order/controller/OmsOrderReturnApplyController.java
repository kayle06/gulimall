package com.atguigu.gulimall.order.controller;

import com.atguigu.gulimall.order.service.OmsOrderReturnApplyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/oms_order_return_apply")
public class OmsOrderReturnApplyController {

    @Resource
    private OmsOrderReturnApplyService omsOrderReturnApplyService;

}
