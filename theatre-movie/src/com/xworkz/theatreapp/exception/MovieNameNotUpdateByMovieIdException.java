package com.xworkz.theatreapp.exception;

public class MovieNameNotUpdateByMovieIdException extends RuntimeException{

    public MovieNameNotUpdateByMovieIdException(String errorMessage){
        super(errorMessage);
    }
}
