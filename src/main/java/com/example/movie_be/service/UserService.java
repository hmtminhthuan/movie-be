package com.example.movie_be.service;

import com.example.movie_be.entity.Information;
import com.example.movie_be.entity.Movie;
import com.example.movie_be.entity.User;
import com.example.movie_be.repository.InformationRepository;
import com.example.movie_be.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    InformationRepository informationRepository;
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Information> actors = new ArrayList<>();
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    public List<Information> getActors(){
        return informationRepository.findAll();
    }
}
