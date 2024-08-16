package com.example.blog_app.controller;

import com.example.blog_app.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("path")
    public String postMethodName(@RequestBody String entity) {

        return entity;
    }

}
