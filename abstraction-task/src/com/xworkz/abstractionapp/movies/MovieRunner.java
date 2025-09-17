package com.xworkz.abstractionapp.movies;

import com.xworkz.abstractionapp.movies.impl.KantaraImpl;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie=new KantaraImpl();
        movie.movieName();
        movie.director();
        movie.releasedOn();
    }
}
