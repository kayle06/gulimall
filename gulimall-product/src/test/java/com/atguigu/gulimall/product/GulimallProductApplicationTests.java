package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Resource
    private BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brand = new BrandEntity();
        brand.setName("Iphone");
        brand.setDescript("Apple phone");
        boolean save = brandService.save(brand);
        System.out.println("save = " + save);
    }

    @Test
    public void listAll() {
        brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L)).forEach(System.out::println);
    }
}