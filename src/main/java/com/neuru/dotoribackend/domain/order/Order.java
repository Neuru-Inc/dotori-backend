package com.neuru.dotoribackend.domain.order;

import com.neuru.dotoribackend.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "ORDER")
public class Order extends BaseTimeEntity {
    @Id
    @Column(name = "order_uuid")
    private String uuid;

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "goods_id")
    private String goodsId;

    @Column(name = "pay_at")
    private LocalDateTime payAt;

    @Column(name = "order_at")
    private LocalDateTime orderAt;

    @Column(name = "order_confirm_at")
    private LocalDateTime orderConfirmAt;

    @Column(name = "delivery_complete_at")
    private LocalDateTime deliveryCompleteAt;

    @Column(name = "order_quantity")
    private Integer orderQty;

    @Column(name = "final_payment_price")
    private Long finalPaymentPrice;

    @Column(name = "delivery_invoice_no")
    private String deliveryInvoiceNo;

    @Column(name = "pay_method_id")
    private String payMethodId;

    @Column(name = "delivery_id")
    private String deliveryId;

    @Column(name = "seller_id")
    private String sellerId;

    @Column(name = "receiver_name")
    private String receiverName;

    @Column(name = "receiver_tel")
    private String receiverTel;

    @Column(name = "receiver_zip_code")
    private String receiverZipCode;

    @Column(name = "receiver_memo")
    private String receiverMemo;

    @Column(name = "order_member_name")
    private String orderMemberName;

    @Column(name = "order_member_tel")
    private String orderMemberTel;

    protected Order() {
    }

    @Builder
    public Order(String uuid, String orderStatus, String productId, String goodsId, LocalDateTime payAt, LocalDateTime orderAt, LocalDateTime orderConfirmAt, LocalDateTime deliveryCompleteAt, Integer orderQty, Long finalPaymentPrice, String deliveryInvoiceNo, String payMethodId, String deliveryId, String sellerId, String receiverName, String receiverTel, String receiverZipCode, String receiverMemo, String orderMemberName, String orderMemberTel) {
        this.uuid = uuid;
        this.orderStatus = orderStatus;
        this.productId = productId;
        this.goodsId = goodsId;
        this.payAt = payAt;
        this.orderAt = orderAt;
        this.orderConfirmAt = orderConfirmAt;
        this.deliveryCompleteAt = deliveryCompleteAt;
        this.orderQty = orderQty;
        this.finalPaymentPrice = finalPaymentPrice;
        this.deliveryInvoiceNo = deliveryInvoiceNo;
        this.payMethodId = payMethodId;
        this.deliveryId = deliveryId;
        this.sellerId = sellerId;
        this.receiverName = receiverName;
        this.receiverTel = receiverTel;
        this.receiverZipCode = receiverZipCode;
        this.receiverMemo = receiverMemo;
        this.orderMemberName = orderMemberName;
        this.orderMemberTel = orderMemberTel;
    }
}
