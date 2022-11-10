package com.neuru.dotoribackend.domain.product;

import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "WORK")
public class Work extends Product {

    //** constructor **//
    protected Work() {
    }

    @Builder
    public Work(String uuid, String name, String sellCommission, String productInfoType, String productInfo, Integer stock, Boolean isSale, String deliveryCompany, String imageUrl) {
        super(uuid, name, sellCommission, productInfoType, productInfo, stock, isSale, deliveryCompany, imageUrl);
    }
}
