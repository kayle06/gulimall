package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 会员收货地址
 */
@Data
@TableName(value = "ums_member_receive_address")
public class UmsMemberReceiveAddressEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * member_id
     */
    @TableField(value = "member_id")
    private Long memberId;

    /**
     * 收货人姓名
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 电话
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 邮政编码
     */
    @TableField(value = "post_code")
    private String postCode;

    /**
     * 省份/直辖市
     */
    @TableField(value = "province")
    private String province;

    /**
     * 城市
     */
    @TableField(value = "city")
    private String city;

    /**
     * 区
     */
    @TableField(value = "region")
    private String region;

    /**
     * 详细地址(街道)
     */
    @TableField(value = "detail_address")
    private String detailAddress;

    /**
     * 省市区代码
     */
    @TableField(value = "areacode")
    private String areacode;

    /**
     * 是否默认
     */
    @TableField(value = "default_status")
    private Boolean defaultStatus;
}