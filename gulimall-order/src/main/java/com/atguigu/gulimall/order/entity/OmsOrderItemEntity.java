package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 订单项信息
 */
@Data
@TableName(value = "oms_order_item")
public class OmsOrderItemEntity {
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
     * order_sn
     */
    @TableField(value = "order_sn")
    private String orderSn;

    /**
     * spu_id
     */
    @TableField(value = "spu_id")
    private Long spuId;

    /**
     * spu_name
     */
    @TableField(value = "spu_name")
    private String spuName;

    /**
     * spu_pic
     */
    @TableField(value = "spu_pic")
    private String spuPic;

    /**
     * 品牌
     */
    @TableField(value = "spu_brand")
    private String spuBrand;

    /**
     * 商品分类id
     */
    @TableField(value = "category_id")
    private Long categoryId;

    /**
     * 商品sku编号
     */
    @TableField(value = "sku_id")
    private Long skuId;

    /**
     * 商品sku名字
     */
    @TableField(value = "sku_name")
    private String skuName;

    /**
     * 商品sku图片
     */
    @TableField(value = "sku_pic")
    private String skuPic;

    /**
     * 商品sku价格
     */
    @TableField(value = "sku_price")
    private BigDecimal skuPrice;

    /**
     * 商品购买的数量
     */
    @TableField(value = "sku_quantity")
    private Integer skuQuantity;

    /**
     * 商品销售属性组合（JSON）
     */
    @TableField(value = "sku_attrs_vals")
    private String skuAttrsVals;

    /**
     * 商品促销分解金额
     */
    @TableField(value = "promotion_amount")
    private BigDecimal promotionAmount;

    /**
     * 优惠券优惠分解金额
     */
    @TableField(value = "coupon_amount")
    private BigDecimal couponAmount;

    /**
     * 积分优惠分解金额
     */
    @TableField(value = "integration_amount")
    private BigDecimal integrationAmount;

    /**
     * 该商品经过优惠后的分解金额
     */
    @TableField(value = "real_amount")
    private BigDecimal realAmount;

    /**
     * 赠送积分
     */
    @TableField(value = "gift_integration")
    private Integer giftIntegration;

    /**
     * 赠送成长值
     */
    @TableField(value = "gift_growth")
    private Integer giftGrowth;
}