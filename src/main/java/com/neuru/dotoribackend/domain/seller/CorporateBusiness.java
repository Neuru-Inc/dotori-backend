package com.neuru.dotoribackend.domain.seller;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Entity
@Table(name = "CORPORATE_BUSINESS")
@DiscriminatorValue(value = "cb")
public class CorporateBusiness extends Seller {
    @Column(name = "busi_regi_num")
    private String busiRegiNum;

    @Column(name = "corp_regi_num")
    private String corpRegiNum;

    //** constructor **//
    protected CorporateBusiness() {
    }

    @Builder
    public CorporateBusiness(Long id, String representName, String backName, String accountNo, String accountName, String taxInvoiceEmail, String managerName, String managerEmail, String managerTel, String busiRegiNum, String corpRegiNum) {
        super(id, representName, backName, accountNo, accountName, taxInvoiceEmail, managerName, managerEmail, managerTel);
        this.busiRegiNum = busiRegiNum;
        this.corpRegiNum = corpRegiNum;
    }
}
