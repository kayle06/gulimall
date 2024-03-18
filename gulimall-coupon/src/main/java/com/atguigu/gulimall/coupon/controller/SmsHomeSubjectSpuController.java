package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SmsHomeSubjectSpuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_home_subject_spu")
public class SmsHomeSubjectSpuController {

    @Resource
    private SmsHomeSubjectSpuService smsHomeSubjectSpuService;

}
