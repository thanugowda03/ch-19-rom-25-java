package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.movie.Movie;

public class TheatreImpl implements Theatre {

    public TheatreImpl(int size){
    movies = new Movie[size];
    }
    public Movie[] movies;
    int index;

    @Override
    public boolean addMovie(Movie movie){
        boolean isMovieAdded = false;
        if (movie != null){
            movies[index++] = movie;
            isMovieAdded = true;
        }
        else {
            System.out.println("Invalid movie");
        }
        return isMovieAdded;
    }
@Override
    public boolean updateMovieNameById(int existingId, String updateMovieName){
        boolean movieNameUpdate = false;

            for (Movie movie:this.movies){
                if (movie.getMovieId()==existingId){
                    movie.setMovieName(updateMovieName);
                    System.out.println("Movie name is update");
                    movieNameUpdate = true;
                }
            }
        if (movieNameUpdate == false) System.out.println("Movie Id"  + existingId + "does not exist");
        return movieNameUpdate;
    }
@Override
    public boolean updateReleaseDateByMovieName(String movieName1,String updateReleaseDate){
        boolean ReleaseDateUpdate = false;

        if (movieName1 != null)
            for (Movie movie : this.movies){
                if (movie.getMovieName().equals(movieName1)){
                    movie.setReleaseDate(updateReleaseDate);
                    System.out.println("Release date update");
                    ReleaseDateUpdate = true;
                }
            }
        if (ReleaseDateUpdate == false) System.out.println("Movie name" +movieName1+ "does not exist");
        return ReleaseDateUpdate;
    }
@Override
    public boolean updateHeroByMovieName(String movieName,String updateHeroName){
        boolean heroNameUpdate = false;

        if (movieName != null) {
            for (Movie movie : this.movies) {
                if (movie.getMovieName().equals(movieName)) {
                    movie.setHero(updateHeroName);
                    System.out.println("Hero name update");
                    heroNameUpdate = true;
                }
            }
        }
            if (heroNameUpdate == false) System.out.println("Movie name" +movieName+ "does not exist");
            return heroNameUpdate;
        }
        @Override
        public boolean updateHeroineByMovieName(String movieName4,String updateHeroineName){
        boolean heroineNameUpdate = false;

        if (movieName4 != null)
            for (Movie movie:this.movies){
                if (movie.getMovieName().equals(movieName4)){
                    movie.setHeroine(updateHeroineName);
                    System.out.println("Heroine name update");
                    heroineNameUpdate = true;
                }
            }
        if (heroineNameUpdate == false) System.out.println("Movie name"+movieName4+"does not exist");
        return heroineNameUpdate;
        }
@Override
        public boolean updateDirectorByMovieId(int movieId1, String updateDirectorName){
        boolean directorNameUpdate = false;

        if (movieId1 > 0)
            for (Movie movie:this.movies){
                if (movie.getMovieId()==movieId1){
                    movie.setDirector(updateDirectorName);
                    System.out.println("Director name update");
                    directorNameUpdate = true;
                }
            }
        if (directorNameUpdate == false) System.out.println("Movie id" +movieId1+ "does not exist");
        return directorNameUpdate;
        }
@Override
        public boolean updateProducerNameByMovieId(int movieId2,String updateProducerName){
        boolean producerNameUpdate = false;

        if (movieId2 > 0)
            for (Movie movie : this.movies){
                if (movie.getMovieId()==movieId2){
                    movie.setProducer(updateProducerName);
                    System.out.println("Producer name update");
                    producerNameUpdate = true;
                }
            }
        if (producerNameUpdate == false) System.out.println("Movie id"+movieId2+"does not exist" );
        return producerNameUpdate;
        }

@Override
        public String getMovieNameByHeroine(String heroine){
        String movieName2 = null;
        if (heroine != null)
            for (Movie movie : this.movies){
                if (movie.getHeroine().equals(heroine)){
                    return movie.getMovieName();
                }
            }
        if (movieName2 == null) System.out.println("Movie name is not found with heroine");
        return movieName2;
    }
@Override
        public String getMovieNameByDirector(String director){
        String movieName3 = null;
        if (director != null)
            for (Movie movie : this.movies){
                if (movie.getDirector().equals(director)) {
                    return movie.getMovieName();
                }
            }
        if (movieName3 == null) System.out.println("Movie name is not found with director");
        return movieName3;
        }
@Override
        public String getMovieNameByProducer(String producer){
        String movieName5 = null;
        if (producer != null)
            for (Movie movie:this.movies){
                if (movie.getProducer().equals(producer)){
                    return movie.getMovieName();
                }
            }
        if (movieName5 == null) System.out.println("Movie name is not found with producer");
        return movieName5;
        }
@Override
        public String getProducerByMovieName(String movieName){
        String producer = null;
        if (movieName != null)
            for (Movie movie : this.movies){
                if (movie.getMovieName().equals(movieName)){
                    return movie.getProducer();
                }
            }
        if (producer == null) System.out.println("Producer name is not found with movieName");
        return producer;
        }


@Override
    public void getMovie(){
        System.out.println("List of movie: "+movies.length);
        for (Movie movie:movies){
            System.out.println("Movie id: " + movie.getMovieId());
            System.out.println("Movie name: " + movie.getMovieName());
            System.out.println("Director: " + movie.getDirector());
            System.out.println("Producer: " + movie.getProducer());
            System.out.println("Hero: " + movie.getHero());
            System.out.println("Heroine: " + movie.getHeroine());
            System.out.println("Release Date: " + movie.getReleaseDate());
            System.out.println("");
        }
    }


    /*Movie movie;

    public boolean addMovieDetails(Movie movie) {
        boolean isMovieAdded = false;
        boolean isMovieInfoValid = false;

        MovieValidator movieValidator = new MovieValidator();
        isMovieInfoValid = movieValidator.validateMovieInfo(movie);

        if (isMovieInfoValid) {
            this.movie = movie;
            isMovieAdded = true;
        }
        return isMovieAdded;
    }

    public void getMovieInfo() {
        System.out.println("Movie id: " + movie.getMovieId());
        System.out.println("Movie name: " + movie.getMovieName());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Producer: " + movie.getProducer());
        System.out.println("Hero: " + movie.getHero());
        System.out.println("Heroine: " + movie.getHeroine());
        System.out.println("Release Date: " + movie.getReleaseDate());
    }*/
}

