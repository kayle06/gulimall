package com.atguigu.gulimall.order.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimall.order.dao.OmsOrderDao;
import com.atguigu.gulimall.order.entity.OmsOrderEntity;
import com.atguigu.gulimall.order.service.OmsOrderService;
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderDao, OmsOrderEntity> implements OmsOrderService{

}
