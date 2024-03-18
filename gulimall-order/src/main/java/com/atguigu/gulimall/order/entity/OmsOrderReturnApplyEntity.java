package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 订单退货申请
 */
@Data
@TableName(value = "oms_order_return_apply")
public class OmsOrderReturnApplyEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * order_id
     */
    @TableField(value = "order_id")
    private Long orderId;

    /**
     * 退货商品id
     */
    @TableField(value = "sku_id")
    private Long skuId;

    /**
     * 订单编号
     */
    @TableField(value = "order_sn")
    private String orderSn;

    /**
     * 申请时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 会员用户名
     */
    @TableField(value = "member_username")
    private String memberUsername;

    /**
     * 退款金额
     */
    @TableField(value = "return_amount")
    private BigDecimal returnAmount;

    /**
     * 退货人姓名
     */
    @TableField(value = "return_name")
    private String returnName;

    /**
     * 退货人电话
     */
    @TableField(value = "return_phone")
    private String returnPhone;

    /**
     * 申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
     */
    @TableField(value = "`status`")
    private Boolean status;

    /**
     * 处理时间
     */
    @TableField(value = "handle_time")
    private Date handleTime;

    /**
     * 商品图片
     */
    @TableField(value = "sku_img")
    private String skuImg;

    /**
     * 商品名称
     */
    @TableField(value = "sku_name")
    private String skuName;

    /**
     * 商品品牌
     */
    @TableField(value = "sku_brand")
    private String skuBrand;

    /**
     * 商品销售属性(JSON)
     */
    @TableField(value = "sku_attrs_vals")
    private String skuAttrsVals;

    /**
     * 退货数量
     */
    @TableField(value = "sku_count")
    private Integer skuCount;

    /**
     * 商品单价
     */
    @TableField(value = "sku_price")
    private BigDecimal skuPrice;

    /**
     * 商品实际支付单价
     */
    @TableField(value = "sku_real_price")
    private BigDecimal skuRealPrice;

    /**
     * 原因
     */
    @TableField(value = "reason")
    private String reason;

    /**
     * 描述
     */
    @TableField(value = "description述")
    private String description述;

    /**
     * 凭证图片，以逗号隔开
     */
    @TableField(value = "desc_pics")
    private String descPics;

    /**
     * 处理备注
     */
    @TableField(value = "handle_note")
    private String handleNote;

    /**
     * 处理人员
     */
    @TableField(value = "handle_man")
    private String handleMan;

    /**
     * 收货人
     */
    @TableField(value = "receive_man")
    private String receiveMan;

    /**
     * 收货时间
     */
    @TableField(value = "receive_time")
    private Date receiveTime;

    /**
     * 收货备注
     */
    @TableField(value = "receive_note")
    private String receiveNote;

    /**
     * 收货电话
     */
    @TableField(value = "receive_phone")
    private String receivePhone;

    /**
     * 公司收货地址
     */
    @TableField(value = "company_address")
    private String companyAddress;
}