package com.neuru.dotoribackend.domain.follow;


import com.neuru.dotoribackend.domain.member.Member;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "FOLLOW")
public class Follow {
    @Id
    @Column(name = "follow_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "following",
            foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Member following;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "followed",
            foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Member followed;
}
