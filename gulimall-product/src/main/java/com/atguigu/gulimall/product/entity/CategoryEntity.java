package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 商品三级分类
 */
@Data
@TableName(value = "pms_category")
public class CategoryEntity {
    /**
     * 分类id
     */
    @TableId(value = "cat_id", type = IdType.AUTO)
    private Long catId;

    /**
     * 分类名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 父分类id
     */
    @TableField(value = "parent_cid")
    private Long parentCid;

    /**
     * 层级
     */
    @TableField(value = "cat_level")
    private Integer catLevel;

    /**
     * 是否显示[0-不显示，1显示]
     */
    @TableField(value = "show_status")
    private Byte showStatus;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 图标地址
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 计量单位
     */
    @TableField(value = "product_unit")
    private String productUnit;

    /**
     * 商品数量
     */
    @TableField(value = "product_count")
    private Integer productCount;
}