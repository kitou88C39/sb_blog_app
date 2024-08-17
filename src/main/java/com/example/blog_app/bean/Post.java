package com.example.blog_app.bean;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Table(name = "posts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String title;

    @Column
    String description;

    @OneToMany
    List<Comment> comments = new ArrayList<>();
}
