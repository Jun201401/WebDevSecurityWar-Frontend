package com.jun201401.webdevsecuritywar.frontend.dto.board;

import com.jun201401.webdevsecuritywar.frontend.dto.post.PostPreviewDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GetBoardDto {
    private Long id;
    private String name;
    private List<PostPreviewDto> posts;

    public GetBoardDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
