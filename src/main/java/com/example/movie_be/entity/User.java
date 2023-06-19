package com.example.movie_be.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String image;

    @OneToMany(mappedBy = "userOfPost")
//    @JsonIgnore
    List<Post> listOfPost;
//    @ManyToOne
//    @JoinColumn(name = "role_id")
//    Role role;
}

