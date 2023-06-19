package com.example.movie_be.service;


import com.example.movie_be.entity.Movie;
import com.example.movie_be.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoiveService {
    @Autowired
    MovieRepository movieRepository;
    ArrayList<Movie> movies = new ArrayList<>();

   public List<Movie> getMovies(){
       return movieRepository.findAll();
   }

   public Movie postMovie(Movie movie){
    movieRepository.save(movie);
       return null;
   }

    public Movie getMovieDetailById(long movieId){
        Movie newMovie = movieRepository.findMovieById(movieId);
        return newMovie;
    }

    public List<Movie> getMovieDetailByKeyword(String keyword){
        List<Movie> movies = movieRepository.find(keyword);
        return movies;
    }

}
