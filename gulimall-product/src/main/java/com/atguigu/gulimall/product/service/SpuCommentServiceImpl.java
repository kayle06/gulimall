package com.atguigu.gulimall.product.service;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimall.product.entity.SpuCommentEntity;
import com.atguigu.gulimall.product.dao.SpuCommentDao;
import com.atguigu.gulimall.product.service.impl.SpuCommentService;
@Service
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentDao, SpuCommentEntity> implements SpuCommentService{

}
