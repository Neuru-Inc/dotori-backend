package com.neuru.dotoribackend.domain.report;

import com.neuru.dotoribackend.domain.BaseTimeEntity;
import com.neuru.dotoribackend.domain.member.Member;
import com.neuru.dotoribackend.domain.post.Post;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "REPORT")
public class Report extends BaseTimeEntity {
    @Id
    @Column(name = "report_id")
    private Long id;
    @Column(name = "reason", nullable = false)
    private String reason;

    @ManyToOne
    @JoinColumn(
            name = "post_id",
            foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Post post;

    @ManyToOne
    @JoinColumn(
            name = "member_uuid",
            foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Member member;
}