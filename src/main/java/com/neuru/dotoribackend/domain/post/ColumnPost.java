package com.neuru.dotoribackend.domain.post;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "COLUMN_POST")
public class ColumnPost extends Post {

    @Column(name = "view_count")
    private Long viewCount = 0L;

    //** domain logic **//
    public void addViewCount() {
        this.viewCount++;
    }

    //** constructor **//
    protected ColumnPost() {
    }

    @Builder
    public ColumnPost(Long id, String title, String content, Long likeCount, Long bookmarkCount, Long commentCount, String imageUrl, String videoUrl, Boolean isHided, Long viewCount) {
        super(id, title, content, likeCount, bookmarkCount, commentCount, imageUrl, videoUrl, isHided);
        this.viewCount = viewCount;
    }
}