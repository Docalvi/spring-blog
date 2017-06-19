package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by emilioalvarado on 6/19/17.
 */
@Controller
public class ProfileViewController {

    @GetMapping("/resume")
    public String welcome() {
        return "profile/resume";
    }

    @GetMapping("/portfolio")
    public String portfolio() {
        return "profile/portfolio";
    }
}
