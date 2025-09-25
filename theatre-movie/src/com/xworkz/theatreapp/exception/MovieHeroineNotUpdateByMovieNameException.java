package com.xworkz.theatreapp.exception;

public class MovieHeroineNotUpdateByMovieNameException extends RuntimeException{

    public MovieHeroineNotUpdateByMovieNameException(String errorMessage){
        super(errorMessage);
    }
}
