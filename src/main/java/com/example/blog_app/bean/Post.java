package com.example.blog_app.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "posts")
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    Long id;
    String title;
    String description;
}
