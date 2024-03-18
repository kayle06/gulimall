package com.atguigu.gulimall.product.controller;

import com.atguigu.gulimall.product.service.SpuCommentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_spu_comment")
public class SpuCommentController {

    @Resource
    private SpuCommentService spuCommentService;

}
