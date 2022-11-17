package com.neuru.dotoribackend.domain.seller;

import com.neuru.dotoribackend.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "seller_type")
public abstract class Seller extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seller_id")
    protected Long id;

    @Column(name = "represent_name")
    protected String representName;

    @Column(name = "bank_name")
    protected String backName;

    @Column(name = "account_no")
    protected String accountNo;

    @Column(name = "account_name")
    protected String accountName;

    @Column(name = "tax_invoice_email")
    protected String taxInvoiceEmail;

    @Column(name = "manager_name")
    protected String managerName;

    @Column(name = "manager_email")
    protected String managerEmail;

    @Column(name = "manager_tel")
    protected String managerTel;

    //** constructor **//
    protected Seller() {
    }

    public Seller(Long id, String representName, String backName, String accountNo, String accountName, String taxInvoiceEmail, String managerName, String managerEmail, String managerTel) {
        this.id = id;
        this.representName = representName;
        this.backName = backName;
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.taxInvoiceEmail = taxInvoiceEmail;
        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.managerTel = managerTel;
    }
}
