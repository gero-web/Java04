package com.example.itog.controllers;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class MainController {

    @GetMapping("/index")
    public @ResponseBody String getText() {
        return "asdsadda";
    }
}