package com.xworkz.moviedetails;

import com.xworkz.moviedetails.movie.Movie;

public class MovieRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Movie movie = new Movie();
        movie.setMovieId(12);
        movie.setMovieName("Su from So");
        movie.setRatings("4.9");
        movie.setMovieDirector("J P Thuminadu");

        int movieId = movie.getMovieId();
        String movieName=movie.getMovieName();
        String ratings=movie.getRatings();
        String movieDirector=movie.getMovieDirector();

        System.out.println("Movie Id: "+movieId);
        System.out.println("Movie Name :"+movieName);
        System.out.println("Movie Ratings "+ratings);
        System.out.println("Movie Director "+movieDirector);
        System.out.println("main ended");
    }
}
