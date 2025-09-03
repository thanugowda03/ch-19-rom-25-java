package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.validator.MovieValidator;

public class Theatre {

    Movie[] movies = new Movie[10];
    int index;

    public boolean addMovie(Movie movie){
        boolean isMovieAdded = false;
        if (movie != null){
            movies[index++] = movie;
            isMovieAdded = true;
        }
        else {
            System.out.println("Invalid movie");
        }
        return isMovieAdded;
    }
    public void getMovie(){
        System.out.println("List of movie: "+movies.length);
        for (Movie movie:movies){
            System.out.println("Movie id: " + movie.getMovieId());
            System.out.println("Movie name: " + movie.getMovieName());
            System.out.println("Director: " + movie.getDirector());
            System.out.println("Producer: " + movie.getProducer());
            System.out.println("Hero: " + movie.getHero());
            System.out.println("Heroine: " + movie.getHeroine());
            System.out.println("Release Date: " + movie.getReleaseDate());
            System.out.println("");
        }
    }


    /*Movie movie;

    public boolean addMovieDetails(Movie movie) {
        boolean isMovieAdded = false;
        boolean isMovieInfoValid = false;

        MovieValidator movieValidator = new MovieValidator();
        isMovieInfoValid = movieValidator.validateMovieInfo(movie);

        if (isMovieInfoValid) {
            this.movie = movie;
            isMovieAdded = true;
        }
        return isMovieAdded;
    }

    public void getMovieInfo() {
        System.out.println("Movie id: " + movie.getMovieId());
        System.out.println("Movie name: " + movie.getMovieName());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Producer: " + movie.getProducer());
        System.out.println("Hero: " + movie.getHero());
        System.out.println("Heroine: " + movie.getHeroine());
        System.out.println("Release Date: " + movie.getReleaseDate());
    }*/
}

