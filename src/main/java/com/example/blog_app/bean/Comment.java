package com.example.blog_app.bean;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "comments")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Comment {

    private Long id;

    private String name;

    private String email;

    private String comment_desc;
}
