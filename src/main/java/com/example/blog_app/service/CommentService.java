package com.example.blog_app.service;

import com.example.blog_app.bean.Comment;
import com.example.blog_app.dao.CommentDao;
import com.example.blog_app.dao.PostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private PostDao postDao;

    @Autowired
    private CommentDao commentDao;

    // addComment()
    Comment addComment(Comment comment, Long postId) {

    }

    // getCommentByCommentId()
    // getCommentByPostId()
    // updateComment()
    // deleteComment()

}
