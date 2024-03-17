package com.atguigu.gulimall.product.service;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.service.impl.CategoryService;
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService{

}
