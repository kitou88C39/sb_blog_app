package com.example.blog_app.service;

import com.example.blog_app.dao.PostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostDao postDao;

    public Post createPost(Post post) {
        postDao.save(post);
    }

}
