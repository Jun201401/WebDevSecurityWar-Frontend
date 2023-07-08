package com.jun201401.webdevsecuritywar.frontend.controller;

import com.jun201401.webdevsecuritywar.frontend.service.board.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class PostController {
    private final BoardService boardService;

    @GetMapping
    public String showBoard(Model model) {
        model.addAttribute("boards", boardService.getAllBoards());
        return "/board/boards";
    }
}
