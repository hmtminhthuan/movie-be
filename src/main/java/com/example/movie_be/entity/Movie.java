package com.example.movie_be.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String image;
//    private String actorName;
    private int year;

    @OneToMany(mappedBy = "movie_actor")
    private List<MovieActor> actorsOfMovie;

//    @OneToMany(mappedBy = "movie_actor_id")
//    @JsonIgnore
//    List<actor_movie> actorsOfMovie;

//    @ManyToOne
//    @JoinColumn(name = "director_id")
//    Information director;

//    @ManyToMany
//    @JsonIgnore
//    List<Information> actorsOfMovie;
}
