package com.atguigu.gulimall.product.controller;
import com.atguigu.gulimall.product.service.SpuCommentServiceImpl;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_spu_comment")
public class SpuCommentController {

    @Resource
    private SpuCommentServiceImpl spuCommentServiceImpl;

}
