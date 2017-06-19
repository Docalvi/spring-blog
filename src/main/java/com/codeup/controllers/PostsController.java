package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by emilioalvarado on 6/19/17.
 */
@Controller
public class PostsController {

    @GetMapping("/post")
    @ResponseBody
    public String viewAll() {
        return "post index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String viewIndividualPost(@PathVariable Long id) {
        return "view id " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showPostForm() {
        return "show post form";
    }

    @PostMapping("/post/create")
    @ResponseBody
    public String savePost() {
        return "new post made";
    }
}
