package com.example.tp1microservices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @GetMapping(value = "/movies")
    public static List<Movie> getMovies() {
        List<Movie> movies = MovieServices.findAll();
        return movies;
    }
    @GetMapping(value = "/movies/{id}")
    public Movie getMovieById(@PathVariable int id){
      var searchMovie = MovieServices.findById(id);
      return searchMovie;
    }
  @RequestMapping(value = "/movies", method = RequestMethod.POST)
    public Movie createMovie(@RequestBody Movie movie){
        var addMovie = MovieServices.addMovie(movie);
        return addMovie;
    }
   /* @RequestMapping(value = "/movies/{id}", method = RequestMethod.PUT)
    public Movie modifyMovie(@PathVariable int id){

    }*/
    @RequestMapping(value = "/movies/delete/{id}", method = RequestMethod.DELETE)
    public String deleteMovie(@PathVariable int id){
        var deleteMovie = MovieServices.removeMovie(id);
        return deleteMovie;
    }

    @RequestMapping(value = "/movies/{id}", method = RequestMethod.PUT)
    public String updateMovie(@PathVariable int id, @RequestBody Movie movie){
        var modifyMovie = MovieServices.modifyMovie(id, movie);
        return modifyMovie;
    }







}