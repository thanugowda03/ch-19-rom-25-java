package com.xworkz.theatreapp.exception;

public class MovieHeroNotUpdateByMovieNameException extends RuntimeException{

    public MovieHeroNotUpdateByMovieNameException(String errorMessage){
        super(errorMessage);
    }
}
