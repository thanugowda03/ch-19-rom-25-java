package com.xworkz.theatreapp.validator;

import com.xworkz.theatreapp.movie.Movie;

public class MovieValidator {

    Movie movie;
    public boolean validateMovieInfo(Movie movie) {
        boolean movieValidate = false;
        boolean movieIdValid = false;
        boolean movieNameValid = false;
        boolean directorValid = false;
        boolean producerValid = false;
        boolean heroValid = false;
        boolean heroineValid = false;
        boolean releaseDateValid = false;

        if (movie.getMovieId() > 0) {
            movieIdValid = true;
        } else {
            System.out.println("Movie id is not valid");
        }

        if (movie.getMovieName() != null && !movie.getMovieName().isEmpty()) {
            movieNameValid = true;
        } else {
            System.out.println("Movie name is empty/null");
        }

        if (movie.getDirector() != null && !movie.getDirector().isEmpty()) {
            directorValid = true;
        } else {
            System.out.println("Director is empty/null");
        }

        if (movie.getProducer() != null && !movie.getProducer().isEmpty()) {
            producerValid = true;
        } else {
            System.out.println("Producer is empty/null");
        }

        if (movie.getHero() != null && !movie.getHero().isEmpty()) {
            heroValid = true;
        } else {
            System.out.println("Hero is empty/null");
        }

        if (movie.getHeroine() != null && !movie.getHeroine().isEmpty()) {
            heroineValid = true;
        } else {
            System.out.println("Heroine is empty/null");
        }

        if (movie.getReleaseDate() != null && !movie.getReleaseDate().isEmpty()) {
            releaseDateValid = true;
        } else {
            System.out.println("Release date is empty/null");
        }

        if (movieIdValid && movieNameValid && directorValid && producerValid &&
                heroValid && heroineValid && releaseDateValid) {
            movieValidate = true;
        }

        return movieValidate;
    }
}


