package com.neuru.dotoribackend.domain.order;

import com.neuru.dotoribackend.domain.BaseTimeEntity;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "DELIVERY")
public class Delivery extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id")
    private Long id;

    @Column(name = "delivery_name")
    private String deliveryName;

    @Column(name = "seller_id")
    private String sellerId;

    @Column(name = "delivery_method")
    private String deliveryMethod;

    @Column(name = "delivery_fee_type")
    private String deliveryFeeType;

    @Column(name = "delivery_company_id")
    private String deliveryCompanyId;

    @Column(name = "delivery_zip_code")
    private String deliveryZipCode;

    @Column(name = "delivery_addr")
    private String deliveryAddr;

    @Column(name = "delivery_tel")
    private String deliveryTel;

    @Column(name = "delivery_fee")
    private String deliveryFee;

    @Column(name = "extra_fee")
    private String extraFee;
}
