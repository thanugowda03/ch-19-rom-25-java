package com.xworkz.theatreapp.exception;

public class MovieNameNotGetByProducerException extends RuntimeException{

    public MovieNameNotGetByProducerException(String errorMessage){
        super(errorMessage);
    }
}
