package com.example.blog_app.controller;

import java.lang.annotation.*;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Controller;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
@RestController
public @interface RestController {
    @AliasFor(annotation = Controller.class)
    String value() default "";

}
