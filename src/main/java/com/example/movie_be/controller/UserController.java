package com.example.movie_be.controller;

import com.example.movie_be.entity.Information;
import com.example.movie_be.entity.Movie;
import com.example.movie_be.entity.User;
import com.example.movie_be.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5173/","http://localhost:5174/"})
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
    public ResponseEntity getUsers(){
//       Movie movie0 = movieService.createMovie();
        List<User> users = userService.getUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/ìnformation")
    public ResponseEntity getActors(){
//       Movie movie0 = movieService.createMovie();
        List<Information> actors = userService.getActors();
        return ResponseEntity.ok(actors);
    }
}
