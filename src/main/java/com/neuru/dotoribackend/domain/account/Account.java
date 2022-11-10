package com.neuru.dotoribackend.domain.account;


import com.neuru.dotoribackend.domain.BaseTimeEntity;
import com.neuru.dotoribackend.domain.account.enums.AccountType;
import com.neuru.dotoribackend.domain.member.Member;
import com.neuru.dotoribackend.global.enums.Gender;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT")
public class Account extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "account_id")
    private Long id;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    private AccountType type;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "account_img")
    private String accountImg;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Member.class)
    @JoinColumn(
            name = "member_uuid",
            foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Member member;
}
