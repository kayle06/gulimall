package com.atguigu.gulimall.product.controller;

import com.atguigu.gulimall.product.service.AttrGroupService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_attr_group")
public class AttrGroupController {

    @Resource
    private AttrGroupService attrGroupService;

}
