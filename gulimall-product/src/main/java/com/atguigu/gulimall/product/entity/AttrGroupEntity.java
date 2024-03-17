package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 属性分组
 */
@Data
@TableName(value = "pms_attr_group")
public class AttrGroupEntity {
    /**
     * 分组id
     */
    @TableId(value = "attr_group_id", type = IdType.AUTO)
    private Long attrGroupId;

    /**
     * 组名
     */
    @TableField(value = "attr_group_name")
    private String attrGroupName;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 描述
     */
    @TableField(value = "descript")
    private String descript;

    /**
     * 组图标
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 所属分类id
     */
    @TableField(value = "catelog_id")
    private Long catelogId;
}