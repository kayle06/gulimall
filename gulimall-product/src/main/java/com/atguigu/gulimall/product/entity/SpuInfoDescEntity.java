package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * spu信息介绍
 */
@Data
@TableName(value = "pms_spu_info_desc")
public class SpuInfoDescEntity {
    /**
     * 商品id
     */
    @TableId(value = "spu_id", type = IdType.AUTO)
    private Long spuId;

    /**
     * 商品介绍
     */
    @TableField(value = "decript")
    private String decript;
}