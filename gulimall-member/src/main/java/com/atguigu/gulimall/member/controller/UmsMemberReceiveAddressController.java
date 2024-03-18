package com.atguigu.gulimall.member.controller;

import com.atguigu.gulimall.member.service.UmsMemberReceiveAddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/ums_member_receive_address")
public class UmsMemberReceiveAddressController {

    @Resource
    private UmsMemberReceiveAddressService umsMemberReceiveAddressService;

}
