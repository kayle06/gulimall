package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * spu图片
 */
@Data
@TableName(value = "pms_spu_images")
public class SpuImagesEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * spu_id
     */
    @TableField(value = "spu_id")
    private Long spuId;

    /**
     * 图片名
     */
    @TableField(value = "img_name")
    private String imgName;

    /**
     * 图片地址
     */
    @TableField(value = "img_url")
    private String imgUrl;

    /**
     * 顺序
     */
    @TableField(value = "img_sort")
    private Integer imgSort;

    /**
     * 是否默认图
     */
    @TableField(value = "default_img")
    private Byte defaultImg;
}