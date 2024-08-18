package com.example.blog_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog_app.service.CommentService;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

}
