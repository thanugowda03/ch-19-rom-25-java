package com.xworkz.theatreapp.exception;

public class MovieDirectorNotUpdateByMovieIdException extends RuntimeException{

    public MovieDirectorNotUpdateByMovieIdException(String errorMessage){
        super(errorMessage);
    }
}
