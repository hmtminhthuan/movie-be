package com.example.movie_be.repository;


import com.example.movie_be.entity.Movie;
import com.example.movie_be.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(long id);

//    @Query("SELECT mv from Movie mv where mv.name LIKE %?1%")
//    List<Movie> find(String keyword);

}
