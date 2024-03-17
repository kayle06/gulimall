package com.atguigu.gulimall.product.controller;

import com.atguigu.gulimall.product.service.impl.AttrAttrgroupRelationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_attr_attrgroup_relation")
public class AttrAttrgroupRelationController {

    @Resource
    private AttrAttrgroupRelationService attrAttrgroupRelationService;

}
