package com.example.springbootjavajooq.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @PostMapping("/post")
    public ResponseEntity<String> post(@RequestBody String body) {
        System.out.println(body);
        return ResponseEntity.ok(body);
    }
}
