package com.example.blog_app.controller;

import com.example.blog_app.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("path")
    public ResponseEntity<String> createPost(@RequestBody Post post) {
        Post response = postService.createPost(post);
        return entity;
    }

}
