package com.codeup.controllers;

import com.codeup.models.Post;
import com.codeup.svcs.PostSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by emilioalvarado on 6/19/17.
 */
@Controller
public class PostsController {

    private final PostSvc postsvc;

    @Autowired
    public PostsController(PostSvc postsvc) {
        this.postsvc = postsvc;
    }

    @GetMapping("/post")
    public String viewAll(Model model) {
// Don't know why this variable is greyed out
        List<Post> posts = postsvc.findAll();
        model.addAttribute("posts", postsvc.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String viewIndividualPost(@PathVariable long id, Model model) {
        Post post = postsvc.findPost(id);
        model.addAttribute("post", post);
        return "posts/show ";
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
