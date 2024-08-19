package com.example.blog_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.blog_app.service.CommentService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/posts/{id}/createComment")
    public ResponseEntity<String> createComment(@RequestBody Comment comment, @PathVariable Long id) {
        Comment response = commentService.addComment(comment, id);

        return new ResponseEntity<>("Post created successfully for Id -> " + response.getId(), HttpStatus.CREATED);
    }

    @GetMapping("/comment/{id}")
    public ResponseEntity<Comment> getCommentByCommentId(@PathVariable Long id) {
        Comment commentService.getCommentByCommentId(id);
        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

}
