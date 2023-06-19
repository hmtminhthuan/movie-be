package com.example.movie_be.controller;

import com.example.movie_be.dto.MovieDTO;
import com.example.movie_be.entity.Movie;
import com.example.movie_be.repository.MovieRepository;
import com.example.movie_be.service.MoiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5173/","http://localhost:5174/"})
public class MovieController {
    @Autowired MoiveService movieService;

    @Autowired
    MovieRepository movieRepository;
    @GetMapping("/movie")
    public ResponseEntity getMovies(){
//       Movie movie0 = movieService.createMovie();
        List<Movie> movies = movieService.getMovies();
        return ResponseEntity.ok(movies);
    }

    @PostMapping("/movie")
    public ResponseEntity postMovie(@RequestBody Movie movie){
        movieService.postMovie(movie);
        return ResponseEntity.ok(movie);
}

    @GetMapping("/movie/{movieId}")
    public ResponseEntity getMovieDetail(@PathVariable long movieId){
        Movie movie = movieService.getMovieDetailById(movieId);
        return ResponseEntity.ok(movie);
}

    @GetMapping("/movie-by-name")
    public ResponseEntity getMovieDetailByName(String keyword){
        List<Movie> movies = movieService.getMovieDetailByKeyword(keyword);
        return ResponseEntity.ok(movies);
    }
}
