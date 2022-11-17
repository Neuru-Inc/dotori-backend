package com.neuru.dotoribackend.domain.product;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Getter
@Table(name = "WORK")
public class Artwork extends Product {

    //** constructor **//
    protected Artwork() {
    }

    @Builder
    public Artwork(String uuid, String name, String sellCommission, String productInfoType, String productInfo, Integer stock, Boolean isSale, String deliveryCompany, String imageUrl) {
        super(uuid, name, sellCommission, productInfoType, productInfo, stock, isSale, deliveryCompany, imageUrl);
    }
}
