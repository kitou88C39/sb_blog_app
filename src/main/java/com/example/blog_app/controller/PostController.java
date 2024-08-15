package com.example.blog_app.controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
@RestController
public class PostController {

}
