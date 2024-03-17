package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * sku销售属性&值
 */
@Data
@TableName(value = "pms_sku_sale_attr_value")
public class SkuSaleAttrValueEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * sku_id
     */
    @TableField(value = "sku_id")
    private Long skuId;

    /**
     * attr_id
     */
    @TableField(value = "attr_id")
    private Long attrId;

    /**
     * 销售属性名
     */
    @TableField(value = "attr_name")
    private String attrName;

    /**
     * 销售属性值
     */
    @TableField(value = "attr_value")
    private String attrValue;

    /**
     * 顺序
     */
    @TableField(value = "attr_sort")
    private Integer attrSort;
}