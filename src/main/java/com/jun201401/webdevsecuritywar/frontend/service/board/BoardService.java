package com.jun201401.webdevsecuritywar.frontend.service.board;

import com.jun201401.webdevsecuritywar.frontend.dto.board.GetBoardDto;

import java.util.List;

public interface BoardService {
    List<GetBoardDto>  getAllBoards();
}
