package com.example.listview;

import java.util.Arrays;
import java.util.List;

class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}

public class MoviesRepository {
    private List<Movie> models;

    public MoviesRepository() {
        this.models = Arrays.asList(
                new Movie("Vingadores"),
                new Movie("Homem de Ferro"),
                new Movie("Capitão América"),
                new Movie("Capitã Marvel"),
                new Movie("Guardiões da Galáxia")
        );
    }

    public Movie get(Integer id) {
        return this.models.get(id);
    }

    public List<Movie> getAll() {
        return this.models;
    }
}
