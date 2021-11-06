package com.example.tp1microservices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServices {

    private static List<Movie> all_movies = new ArrayList<>();
    static {
        all_movies.add(new Movie(1,"Annatthe", "Family/Action", 169, "Siva", "Yet to be updated"));
        all_movies.add(new Movie(2, "Harry Potter 1", "Fantasy", 152, "Chris Columbus", "Movie about witch school"));
        all_movies.add(new Movie(3, "Master", "Action", 177, "Lokesh Kanakaraj", "Movie about a school master"));
        all_movies.add(new Movie(4, "Divergent", "Action", 140, "Neil Burger", "Movie about a fictionnal world"));
        all_movies.add(new Movie(5, "Ghilli", "Action", 168, "Dharani", "Movie about kabaddi"));
    }

    public static List<Movie> findAll(){
        return all_movies;
    }

    public static Movie findById(int id) {
        var movie = all_movies.stream().filter(m -> m.getId()==id).findFirst().orElse(null);
        return movie;
    }

    public static Movie addMovie(Movie movie){
        var movieToCreate = new Movie(movie.getId(),movie.getTitle(),movie.getGenre(), movie.getLength(), movie.getDirector(), movie.getSynopsis());
        all_movies.add(movieToCreate);
        return movieToCreate;
    }

    public static String removeMovie(int id){
        var selectedMovie = findById(id);
        all_movies.remove(selectedMovie);
        return "Selected movie is deleted";
    }

    public static String modifyMovie(int id, Movie movie){
        var selectedMovie = findById(id);
        selectedMovie.setTitle(movie.getTitle());
        selectedMovie.setGenre(movie.getGenre());
        selectedMovie.setLength(movie.getLength());
        selectedMovie.setDirector(movie.getDirector());
        selectedMovie.setSynopsis(movie.getSynopsis());
        all_movies.set(id, selectedMovie);
        return "The movie is modified";
    }



}