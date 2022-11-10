package com.neuru.dotoribackend.domain.post;


import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "GENERAL_POST")
public class GeneralPost extends Post {

    //** constructor **//
    protected GeneralPost() {
    }

    @Builder
    public GeneralPost(Long id, String title, String content, Long likeCount, Long bookmarkCount, Long commentCount, String imageUrl, String videoUrl, Boolean isHided) {
        super(id, title, content, likeCount, bookmarkCount, commentCount, imageUrl, videoUrl, isHided);
    }
}
