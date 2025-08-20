package com.xworkz.moviedetails.movie;

public class Movie {

    private int movieId;
    public int getMovieId(){
        return movieId;
    }
    public void setMovieId(int movieId){
        this.movieId=movieId;
    }
    private String movieName;
    public String getMovieName(){
        return movieName;
    }
    public void setMovieName(String movieName){
        this.movieName=movieName;
    }

    private String ratings;
    public String getRatings(){
        return ratings;
    }
    public void setRatings(String ratings){
        this.ratings=ratings;
    }
    private String movieDirector;
    public String getMovieDirector(){
        return movieDirector;
    }
    public void setMovieDirector(String movieDirector){
        this.movieDirector=movieDirector;
    }

    private String releaseOn;
    public String getReleaseOn(){
        return releaseOn;
    }
    public void setReleaseOn(String releaseOn){
        this.releaseOn=releaseOn;
    }
}
