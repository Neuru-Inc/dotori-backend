package com.neuru.dotoribackend.domain.bookmark;

import com.neuru.dotoribackend.domain.member.Member;
import com.neuru.dotoribackend.domain.post.Post;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "BOOKMARK")
public class BookMark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookmark_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "member_uuid",
            foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "post_id",
            foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Post post;


    //** constructor **//
    protected BookMark() {
    }

    @Builder
    public BookMark(Long id, Member member, Post post) {
        this.id = id;
        this.member = member;
        this.post = post;
    }
}
