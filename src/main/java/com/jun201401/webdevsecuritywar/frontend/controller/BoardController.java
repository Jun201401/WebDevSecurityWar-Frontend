package com.jun201401.webdevsecuritywar.frontend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    @GetMapping
    public String welcomePage() {
        return "/welcome";
    }

//    @GetMapping
//    public String getProjects() {
//        return "board/list";
//    }
}
