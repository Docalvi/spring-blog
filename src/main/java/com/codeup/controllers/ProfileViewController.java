package com.codeup.controllers;

import com.codeup.svcs.PostSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by emilioalvarado on 6/19/17.
 */
@Controller
public class ProfileViewController {

    private final PostSvc postsvc;

    @GetMapping("/resume")
    public String welcome() {
        return "profile/resume";
    }

    @GetMapping("/portfolio")
    public String portfolio() {
        return "profile/portfolio";
    }

    @Autowired
    public ProfileViewController(PostSvc postsvc) {
        this.postsvc = postsvc;
    }
}




