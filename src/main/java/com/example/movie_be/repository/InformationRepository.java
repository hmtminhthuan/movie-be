package com.example.movie_be.repository;

import com.example.movie_be.entity.Information;
import com.example.movie_be.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface InformationRepository extends JpaRepository<Information, Long> {



}
