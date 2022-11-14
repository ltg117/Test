package com.atguigu.boot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello, Spring Boot 2!";
    }

    // 一个变化test

    // 第二个变化，用于test
    
    // 第三个变化，用于pull

    // 第四个变化，用于merge

    // 第五个变化，用于merge
}
