package com.byrenx.apinotes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController {
    NotesController() {} 

    @GetMapping("/ping")
    public String ping() {
        return "Hello World";
    }
}