package com.atguigu.gulimall.product.controller;
import com.atguigu.gulimall.product.service.SpuImagesServiceImpl;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_spu_images")
public class SpuImagesController {

    @Resource
    private SpuImagesServiceImpl spuImagesServiceImpl;

}
