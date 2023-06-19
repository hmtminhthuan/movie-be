package com.example.movie_be.controller;

import com.example.movie_be.entity.Post;
import com.example.movie_be.entity.User;
import com.example.movie_be.service.PostService;
import com.example.movie_be.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5173/","http://localhost:5174/"})
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/post")
    public ResponseEntity getUsers(){
        List<Post> posts = postService.getPosts();
        return ResponseEntity.ok(posts);
    }
}
