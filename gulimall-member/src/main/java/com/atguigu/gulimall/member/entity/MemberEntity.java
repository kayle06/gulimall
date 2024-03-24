package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 会员
 */
@Data
@TableName(value = "ums_member")
public class MemberEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 会员等级id
     */
    @TableField(value = "level_id")
    private Long levelId;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "`password`")
    private String password;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 手机号码
     */
    @TableField(value = "mobile")
    private String mobile;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 头像
     */
    @TableField(value = "`header`")
    private String header;

    /**
     * 性别
     */
    @TableField(value = "gender")
    private Byte gender;

    /**
     * 生日
     */
    @TableField(value = "birth")
    private Date birth;

    /**
     * 所在城市
     */
    @TableField(value = "city")
    private String city;

    /**
     * 职业
     */
    @TableField(value = "job")
    private String job;

    /**
     * 个性签名
     */
    @TableField(value = "sign")
    private String sign;

    /**
     * 用户来源
     */
    @TableField(value = "source_type")
    private Byte sourceType;

    /**
     * 积分
     */
    @TableField(value = "integration")
    private Integer integration;

    /**
     * 成长值
     */
    @TableField(value = "growth")
    private Integer growth;

    /**
     * 启用状态
     */
    @TableField(value = "`status`")
    private Byte status;

    /**
     * 注册时间
     */
    @TableField(value = "create_time")
    private Date createTime;
}