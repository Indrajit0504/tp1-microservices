package com.example.tp1microservices;

public class Movie {

    private int id;
    private String title;
    private String genre;
    private int length;
    private String director;
    private String synopsis;

    public Movie(int id, String title, String genre, int length, String director, String synopsis) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.length = length;
        this.director = director;
        this.synopsis = synopsis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

}