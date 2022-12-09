package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoupangController {

    @GetMapping(value = "/coupang")
    public String main() {
        return "coupang/main";
    }
}

