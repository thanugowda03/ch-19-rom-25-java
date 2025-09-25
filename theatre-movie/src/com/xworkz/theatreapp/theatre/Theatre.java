package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.movie.Movie;

public interface Theatre {

    boolean addMovie(Movie movie);

    boolean updateMovieNameById(int existingId, String updateMovieName);

    boolean updateReleaseDateByMovieName(String movieName1,String updateReleaseDate);

    boolean updateHeroByMovieName(String movieName,String updateHeroName);

    boolean updateHeroineByMovieName(String movieName4,String updateHeroineName);

    boolean updateDirectorByMovieId(int movieId1, String updateDirectorName);

    boolean updateProducerNameByMovieId(int movieId2,String updateProducerName);

    String getMovieNameByHeroine(String heroine);

    String getMovieNameByDirector(String director);

    String getMovieNameByProducer(String producer);

    String getProducerByMovieName(String movieName);

    void getMovie();
}
