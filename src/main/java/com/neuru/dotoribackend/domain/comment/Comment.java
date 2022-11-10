package com.neuru.dotoribackend.domain.comment;

import com.neuru.dotoribackend.domain.BaseTimeEntity;
import com.neuru.dotoribackend.domain.member.Member;
import com.neuru.dotoribackend.domain.post.Post;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "COMMENT")
public class Comment extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    @Column(name = "content")
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "post_id",
            foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "member_id",
            foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Member creator;

    //** constructor **//
    protected Comment() {
    }

    @Builder
    public Comment(Long id, String content, Post post, Member creator) {
        this.id = id;
        this.content = content;
        this.post = post;
        this.creator = creator;
    }
}
