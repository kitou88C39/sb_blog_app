package com.example.blog_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.blog_app.service.CommentService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/posts/{id}/createComment")
    public ResponseEntity<String> createComment(@RequestBody Comment comment, @PathVariable Long id) {
        commentService.addComment(comment, id);

        return new ResponseEntity<>("Post created successfully. Id -> " + response.getId(), HttpStatus.CREATED);
    }

}
