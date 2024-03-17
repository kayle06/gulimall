package com.atguigu.gulimall.product.controller;
import com.atguigu.gulimall.product.service.BrandServiceImpl;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_brand")
public class BrandController {

    @Resource
    private BrandServiceImpl brandServiceImpl;

}
