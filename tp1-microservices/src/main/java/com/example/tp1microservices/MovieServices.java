package com.example.tp1microservices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServices {

    public static List<Movie> findAll(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1,"Annatthe", "Family/Action", 169, "Siva", "Yet to be updated"));
        movies.add(new Movie(2, "Harry Potter 1", "Fantasy", 152, "Chris Columbus", "Movie about witch school"));
        movies.add(new Movie(3, "Master", "Action", 177, "Lokesh Kanakaraj", "Movie about a school master"));
        return movies;
    }
}