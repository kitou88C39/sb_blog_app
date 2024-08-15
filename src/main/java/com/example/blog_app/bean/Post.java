package com.example.blog_app.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {

    Long id;
    String title;
    String description;
}
