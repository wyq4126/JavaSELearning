package com.wyc.d4_collection_object;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("<happy0>", 9.5, "wyc0"));
        movies.add(new Movie("<happy1>", 9.5, "wyc1"));
        movies.add(new Movie("<happy2>", 9.5, "wyc2"));

        movies.forEach(movie -> movie.setActor(movie.getActor() + "333"));
        for (Movie movie : movies) {
            System.out.println(movie.getActor());
        }
    }
}
