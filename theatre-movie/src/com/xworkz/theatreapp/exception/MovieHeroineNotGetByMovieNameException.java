package com.xworkz.theatreapp.exception;

public class MovieHeroineNotGetByMovieNameException extends RuntimeException{

    public MovieHeroineNotGetByMovieNameException(String errorMessage){
        super(errorMessage);
    }
}
