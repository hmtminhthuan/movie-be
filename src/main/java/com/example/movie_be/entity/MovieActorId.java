package com.example.movie_be.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieActorId implements Serializable {
    @Column(name = "movie_id")
    private long movieId;
    @Column(name = "actor_id")
    private long actorId;

}
