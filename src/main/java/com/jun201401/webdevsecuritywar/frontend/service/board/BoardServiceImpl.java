package com.jun201401.webdevsecuritywar.frontend.service.board;

import com.jun201401.webdevsecuritywar.frontend.adaptor.board.BoardAdaptor;
import com.jun201401.webdevsecuritywar.frontend.dto.board.GetBoardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardAdaptor boardAdaptor;
    @Override
    public List<GetBoardDto> getAllBoards() {
        return boardAdaptor.getAllBoards();
    }
}
