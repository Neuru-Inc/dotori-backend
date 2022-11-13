package com.neuru.dotoribackend.domain.seller;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Getter
@Entity
@Table(name = "PERSONAL_BUSINESS")
@DiscriminatorValue(value = "pb")
public class PersonalBusiness extends Seller {

    @Column(name = "busi_regi_num")
    private String busiRegiNum;

    //** constructor **//
    protected PersonalBusiness() {
    }

    @Builder
    public PersonalBusiness(Long id, String representName, String backName, String accountNo, String accountName, String taxInvoiceEmail, String managerName, String managerEmail, String managerTel, String busiRegiNum) {
        super(id, representName, backName, accountNo, accountName, taxInvoiceEmail, managerName, managerEmail, managerTel);
        this.busiRegiNum = busiRegiNum;
    }
}
