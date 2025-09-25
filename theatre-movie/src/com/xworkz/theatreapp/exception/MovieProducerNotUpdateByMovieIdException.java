package com.xworkz.theatreapp.exception;

public class MovieProducerNotUpdateByMovieIdException extends RuntimeException{

    public MovieProducerNotUpdateByMovieIdException(String errorMessage){
        super(errorMessage);
    }
}
