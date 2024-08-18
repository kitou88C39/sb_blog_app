package com.example.blog_app.service;

import com.example.blog_app.bean.Comment;
import com.example.blog_app.dao.CommentDao;
import com.example.blog_app.dao.PostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CommentService {

    @Autowired
    private PostDao postDao;

    @Autowired
    private CommentDao commentDao;

    public Comment addComment(Comment comment, Long postId) {
        Post post = postDao.findById(postId)
                .orElseThrow(() -> new RuntimeException(postId + " -> This post id doesn't exists"));
        comment.setPost(post);

        return commentDao.save(comment);
    }

    public Comment getCommentByCommentId(Long id) {
        return commentDao.findById(id)
                .orElseThrow(() -> new RuntimeException(id + " -> This id doesn't exists"));
    }

    public List<Comment> getCommentByPostId(Long postId) {
        return commentDao.findByPostId(postId);
    }
    // updateComment()
    // deleteComment()

}
