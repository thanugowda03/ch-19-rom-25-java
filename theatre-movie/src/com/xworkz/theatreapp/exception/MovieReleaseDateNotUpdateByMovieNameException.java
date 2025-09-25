package com.xworkz.theatreapp.exception;

public class MovieReleaseDateNotUpdateByMovieNameException extends RuntimeException{

    public MovieReleaseDateNotUpdateByMovieNameException(String errorMessage){
        super(errorMessage);
    }
}
