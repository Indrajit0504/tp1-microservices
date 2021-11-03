package com.example.tp1microservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @GetMapping(value = "/movies")
    public List<Movie> getMovies() {
        List<Movie> movies = MovieServices.findAll();
        return movies;
    }

    @GetMapping(value = "/movies/{id}")
    public List<Movie> getMovies() {
        List<Movie> movies = MovieServices.findAll();
        return movies;
    }



}