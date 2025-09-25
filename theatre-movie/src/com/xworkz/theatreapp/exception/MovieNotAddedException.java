package com.xworkz.theatreapp.exception;

public class MovieNotAddedException extends RuntimeException{

    public MovieNotAddedException(String errorMessage){
        super(errorMessage);
    }
}
