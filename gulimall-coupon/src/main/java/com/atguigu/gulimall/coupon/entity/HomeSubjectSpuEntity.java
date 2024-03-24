package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 专题商品
 */
@Data
@TableName(value = "sms_home_subject_spu")
public class HomeSubjectSpuEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 专题名字
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 专题id
     */
    @TableField(value = "subject_id")
    private Long subjectId;

    /**
     * spu_id
     */
    @TableField(value = "spu_id")
    private Long spuId;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;
}