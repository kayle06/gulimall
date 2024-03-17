package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import lombok.Data;

/**
 * sku信息
 */
@Data
@TableName(value = "pms_sku_info")
public class SkuInfoEntity {
    /**
     * skuId
     */
    @TableId(value = "sku_id", type = IdType.AUTO)
    private Long skuId;

    /**
     * spuId
     */
    @TableField(value = "spu_id")
    private Long spuId;

    /**
     * sku名称
     */
    @TableField(value = "sku_name")
    private String skuName;

    /**
     * sku介绍描述
     */
    @TableField(value = "sku_desc")
    private String skuDesc;

    /**
     * 所属分类id
     */
    @TableField(value = "catalog_id")
    private Long catalogId;

    /**
     * 品牌id
     */
    @TableField(value = "brand_id")
    private Long brandId;

    /**
     * 默认图片
     */
    @TableField(value = "sku_default_img")
    private String skuDefaultImg;

    /**
     * 标题
     */
    @TableField(value = "sku_title")
    private String skuTitle;

    /**
     * 副标题
     */
    @TableField(value = "sku_subtitle")
    private String skuSubtitle;

    /**
     * 价格
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 销量
     */
    @TableField(value = "sale_count")
    private Long saleCount;
}