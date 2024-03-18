package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.SmsHomeSubjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sms_home_subject")
public class SmsHomeSubjectController {

    @Resource
    private SmsHomeSubjectService smsHomeSubjectService;

}
