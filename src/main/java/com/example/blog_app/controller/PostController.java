package com.example.blog_app.controller;

import com.example.blog_app.bean.Post;
import com.example.blog_app.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/createPost")
    public ResponseEntity<String> createPost(@RequestBody Post post) {
        Post response = postService.createPost(post);
        return new ResponseEntity<>("Post created successfully. Id -> " + response.getId(), HttpStatus.CREATED);
    }

    @GetMapping("/getPost/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Long id) {

    }
}
