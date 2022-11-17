package com.neuru.dotoribackend.domain.product;

import com.neuru.dotoribackend.domain.BaseTimeEntity;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Product extends BaseTimeEntity {
    @Id
    @Column(name = "product_id")
    protected String uuid;

    @Column(name = "name")
    protected String name;

    @Column(name = "sell_commission")
    protected String sellCommission;

    @Column(name = "product_info_type")
    protected String productInfoType;

    @Column(name = "product_info")
    protected String productInfo;

    @Column(name = "stock")
    protected Integer stock;

    @Column(name = "is_sale")
    protected Boolean isSale;

    @Column(name = "delivery_company")
    protected String deliveryCompany;

    @Column(name = "image_url")
    protected String imageUrl;

    //** constructor **//
    protected Product() {
    }

    public Product(String uuid, String name, String sellCommission, String productInfoType, String productInfo, Integer stock, Boolean isSale, String deliveryCompany, String imageUrl) {
        this.uuid = uuid;
        this.name = name;
        this.sellCommission = sellCommission;
        this.productInfoType = productInfoType;
        this.productInfo = productInfo;
        this.stock = stock;
        this.isSale = isSale;
        this.deliveryCompany = deliveryCompany;
        this.imageUrl = imageUrl;
    }
}
