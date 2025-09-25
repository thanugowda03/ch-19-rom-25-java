package com.xworkz.theatreapp.exception;

public class MovieNameNotGetByDirectorException extends RuntimeException{

    public MovieNameNotGetByDirectorException(String errorMessage){
        super(errorMessage);
    }
}
