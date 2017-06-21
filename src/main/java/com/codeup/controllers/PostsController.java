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

    private final PostSvc postSvc;

    @Autowired
    public PostsController(PostSvc postSvc) {
        this.postSvc = postSvc;
    }

    @GetMapping("/posts")
    public String viewAll(Model model) {

        List<Post> posts = postSvc.findAll();
        model.addAttribute("posts", posts);

        return "/posts/index";
    }

    @GetMapping("/posts/{id}")
    public String viewIndividualPost(@PathVariable long id, Model model) {
        Post post = postSvc.findPost(id);
        model.addAttribute("post", post);
        return "/posts/show";
    }

    @GetMapping("/posts/create")
    public String showPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "/posts/create";
    }

    @PostMapping("/posts/create")
    public String savePost(
            @RequestParam(name = "title") String title,
            @RequestParam(name = "body") String body,
            Model model
    ) {
        Post post = new Post(title, body);
        postSvc.save(post);
        model.addAttribute("post", post);
        return "/posts/create";
    }

    @GetMapping("/posts/{id}/edit")
    public String showEdit(@PathVariable long id, Model model) {
        Post post = postSvc.findPost(id);
        model.addAttribute("post", post);
        return "/posts/edit";
    }
}
