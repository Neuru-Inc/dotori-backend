package com.neuru.dotoribackend.domain.post;


import com.neuru.dotoribackend.domain.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Post extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "post_id")
    protected Long id;
    @Column(name = "title", nullable = false)
    protected String title;
    @Column(name = "content", nullable = false)
    protected String content;

    // 조회 관련 필드
    @Column(name = "like_count")
    protected Long likeCount = 0L;
    @Column(name = "bookmark_count")
    protected Long bookmarkCount = 0L;
    @Column(name = "comment_count")
    protected Long commentCount = 0L;

    // 사진 및 비디오 관련 필드
    @Column(name = "image_url")
    protected String imageUrl;
    @Column(name = "video_url")
    protected String videoUrl;

    // 사용자 설정
    @Column(name = "is_hided")
    protected Boolean isHided = false;

    //** domain logic **//
    public void addLikeCount() {
        this.likeCount++;
    }

    public void addCommentCount() {
        this.commentCount++;
    }

    public void addBookmarkCount() {
        this.bookmarkCount++;
    }

    protected Post() {}

    public Post(Long id, String title, String content, Long likeCount, Long bookmarkCount, Long commentCount, String imageUrl, String videoUrl, Boolean isHided) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.likeCount = likeCount;
        this.bookmarkCount = bookmarkCount;
        this.commentCount = commentCount;
        this.imageUrl = imageUrl;
        this.videoUrl = videoUrl;
        this.isHided = isHided;
    }
}
