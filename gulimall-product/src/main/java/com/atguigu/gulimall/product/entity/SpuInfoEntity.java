package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * spu信息
 */
@Data
@TableName(value = "pms_spu_info")
public class SpuInfoEntity {
    /**
     * 商品id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品名称
     */
    @TableField(value = "spu_name")
    private String spuName;

    /**
     * 商品描述
     */
    @TableField(value = "spu_description")
    private String spuDescription;

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

    @TableField(value = "weight")
    private BigDecimal weight;

    /**
     * 上架状态[0 - 下架，1 - 上架]
     */
    @TableField(value = "publish_status")
    private Byte publishStatus;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "update_time")
    private Date updateTime;
}