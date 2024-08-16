package com.example.blog_app.service;

import com.example.blog_app.bean.Post;
import com.example.blog_app.dao.PostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostDAO postDAO;

    public Post createPost(Post post) {
        return postDAO.save(post);

    }

    public Post getPostById(Long id) {
        return postDAO.findById(id).orElseThrow(() -> new RuntimeException(id + " -> This id dosen't exists"));
    }

}
