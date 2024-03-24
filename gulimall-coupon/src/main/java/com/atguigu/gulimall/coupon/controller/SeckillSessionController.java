package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SeckillSessionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_seckill_session")
public class SeckillSessionController {

    @Resource
    private SeckillSessionService smsSeckillSessionService;

}
