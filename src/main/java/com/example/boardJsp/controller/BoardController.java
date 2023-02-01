package com.example.boardJsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @GetMapping("/index")
    public String getIndex() {

        return "index";
    }

    @PostMapping("/board/write")
    public String boardWriteForm() {

        return "boardwrite";
    }
}
