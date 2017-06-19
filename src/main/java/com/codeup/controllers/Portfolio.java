package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Portfolio {
    @GetMapping("/portfolio")
    public String portfolio(){
        return "profile/portfolio";
    }

}
