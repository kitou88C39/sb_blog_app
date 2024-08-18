package com.example.blog_app.dao;

import com.example.blog_app.bean.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface CommentDao extends JpaRepository<Comment, Long> {
    public List<Comment> findByPostId(Long postId);
}
