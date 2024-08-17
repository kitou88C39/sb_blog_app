package com.example.blog_app.service;

import com.example.blog_app.bean.Post;
import com.example.blog_app.dao.PostDao;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostDao postDao;

    public Post createPost(Post post) {
        return postDao.save(post);
    }

    public Post getPostById(Long id) {
        return postDao.findById(id).orElseThrow(() -> new RuntimeException(id + " -> This id dosen't exists"));
    }

    public List<Post> getAllPost() {
        return postDao.findAll();
    }

    public Post updatePostById(Post post, Long id) {
        if (postDao.findById(id).isPresent()) {
            Post newPost = new Post();
            newPost.setId(id);
            newPost.setTitle(post.getTitle());
        } else {
            return new RuntimeException(id + " -> This id dosen't exists");
        }
    }
}
