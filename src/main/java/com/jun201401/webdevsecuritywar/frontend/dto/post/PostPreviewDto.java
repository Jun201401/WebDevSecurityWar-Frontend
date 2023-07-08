package com.jun201401.webdevsecuritywar.frontend.dto.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostPreviewDto {
    private Long postId;
    private String title;
    private String author;
    private Long viewCount;
    private Long likeCount;
    private LocalDateTime createdAt;

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }
}
