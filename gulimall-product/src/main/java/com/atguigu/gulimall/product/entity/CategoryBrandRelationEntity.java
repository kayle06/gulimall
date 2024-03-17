package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 品牌分类关联
 */
@Data
@TableName(value = "pms_category_brand_relation")
public class CategoryBrandRelationEntity {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 品牌id
     */
    @TableField(value = "brand_id")
    private Long brandId;

    /**
     * 分类id
     */
    @TableField(value = "catelog_id")
    private Long catelogId;

    @TableField(value = "brand_name")
    private String brandName;

    @TableField(value = "catelog_name")
    private String catelogName;
}