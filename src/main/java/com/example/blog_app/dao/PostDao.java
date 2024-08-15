package com.example.blog_app.dao;

import com.example.blog_app.bean.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDao implements JpaReponsitory<Post, Long> {

}
