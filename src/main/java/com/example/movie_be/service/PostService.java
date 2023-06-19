package com.example.movie_be.service;

import com.example.movie_be.entity.Post;
import com.example.movie_be.entity.User;
import com.example.movie_be.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    ArrayList<Post> posts = new ArrayList<>();
    public List<Post> getPosts(){
        return postRepository.findAll();
    }

}
