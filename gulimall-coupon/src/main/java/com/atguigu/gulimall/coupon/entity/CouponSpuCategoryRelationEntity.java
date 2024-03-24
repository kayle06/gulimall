package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 优惠券分类关联
 */
@Data
@TableName(value = "sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelationEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 优惠券id
     */
    @TableField(value = "coupon_id")
    private Long couponId;

    /**
     * 产品分类id
     */
    @TableField(value = "category_id")
    private Long categoryId;

    /**
     * 产品分类名称
     */
    @TableField(value = "category_name")
    private String categoryName;
}