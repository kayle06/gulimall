package com.atguigu.gulimall.product.controller;

import com.atguigu.gulimall.product.service.SpuInfoDescService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_spu_info_desc")
public class SpuInfoDescController {

    @Resource
    private SpuInfoDescService spuInfoDescService;

}
