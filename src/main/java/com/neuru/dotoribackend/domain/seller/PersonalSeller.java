package com.neuru.dotoribackend.domain.seller;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "PERSONAL_SELLER")
@DiscriminatorValue(value = "ps")
public class PersonalSeller extends Seller {

    @Column(name = "seller_zip_code")
    private String sellerZipcode;

    @Column(name = "seller_tel")
    private String sellerTel;

    @Column(name = "seller_email")
    private String sellerEmail;

    //** constructor **//
    protected PersonalSeller() {
    }

    @Builder
    public PersonalSeller(Long id, String representName, String backName, String accountNo, String accountName, String taxInvoiceEmail, String managerName, String managerEmail, String managerTel, String sellerZipcode, String sellerTel, String sellerEmail) {
        super(id, representName, backName, accountNo, accountName, taxInvoiceEmail, managerName, managerEmail, managerTel);
        this.sellerZipcode = sellerZipcode;
        this.sellerTel = sellerTel;
        this.sellerEmail = sellerEmail;
    }
}
