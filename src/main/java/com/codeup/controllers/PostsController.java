package com.codeup.controllers;

import com.codeup.models.Post;
import com.codeup.svcs.PostSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String showPostForm(Model model) {

        model.addAttribute("post", new Post());
        return "/posts/create";
    }

    @PostMapping("/post/create")
    public String savePost(
            @RequestParam(name = "title") String title,
            @RequestParam(name = "body") String body,
            Model model
    ) {
        Post post = new Post(title, body);
        model.addAttribute("post", post);

        return "/posts/create";
    }
}
