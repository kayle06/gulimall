package com.atguigu.gulimall.product.controller;
import com.atguigu.gulimall.product.service.SpuInfoDescServiceImpl;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/pms_spu_info_desc")
public class SpuInfoDescController {

    @Resource
    private SpuInfoDescServiceImpl spuInfoDescServiceImpl;

}
