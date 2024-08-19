package com.example.blog_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.blog_app.service.CommentService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

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
        Comment comment = commentService.getCommentByCommentId(id);

        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    @GetMapping("/post/{id}/getComments")
    public List<Comment> getCommentByPostId(@PathVariable Long id) {
        return commentService.getCommentByPostId(id);
    }

    @PutMapping("path/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        // TODO: process PUT request

        return entity;
    }

}
