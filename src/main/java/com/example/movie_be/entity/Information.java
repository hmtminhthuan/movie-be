package com.example.movie_be.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Information implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String avatraURL;
    private String name;

//    @OneToMany(mappedBy = "actor_movie")
//    private List<MovieActor> moviesOfActor;

//    @OneToMany(mappedBy = "actor_movie_id")
//    @JsonIgnore
//    List<actor_movie> moviesOfActor;
//    @ManyToMany
//    @JsonIgnore
//    List<Movie> moviesOfActor;
}
