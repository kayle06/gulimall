package com.atguigu.gulimall.product.service;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimall.product.dao.AttrDao;
import com.atguigu.gulimall.product.entity.AttrEntity;
import com.atguigu.gulimall.product.service.impl.AttrService;
@Service
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService{

}
