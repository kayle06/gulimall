package com.atguigu.gulimall.product.controller;
import com.atguigu.gulimall.product.service.SpuInfoServiceImpl;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_spu_info")
public class SpuInfoController {

    @Resource
    private SpuInfoServiceImpl spuInfoServiceImpl;

}
