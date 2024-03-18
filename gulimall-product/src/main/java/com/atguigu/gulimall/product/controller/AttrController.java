package com.atguigu.gulimall.product.controller;

import com.atguigu.gulimall.product.service.AttrService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_attr")
public class AttrController {

    @Resource
    private AttrService attrService;

}
