package com.example.movie_be.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// @Data: tự hieu có getter, setter
public class MovieDTO {

    private int id;
    private String name;
    private String image;
    private String actorName;
    private int year;

}
