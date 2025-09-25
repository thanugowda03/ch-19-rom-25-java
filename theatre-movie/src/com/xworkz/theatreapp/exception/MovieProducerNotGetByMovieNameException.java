package com.xworkz.theatreapp.exception;

public class MovieProducerNotGetByMovieNameException extends RuntimeException{

    public MovieProducerNotGetByMovieNameException(String errorMessage){
        super(errorMessage);
    }
}
