package com.example.movie_be.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "movie_actor")
@Data
public class MovieActor {
    @EmbeddedId
    @JsonIgnore
    private MovieActorId id;

    @ManyToOne
    @MapsId("movieId")
    private Movie movie_actor;

    @ManyToOne
    @MapsId("actorId")
    private Information actor_movie;

    @Column
    private String characterName;

}
