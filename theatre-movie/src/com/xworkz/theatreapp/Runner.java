package com.xworkz.theatreapp;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.theatre.Theatre;

public class Runner {

    public static void main(String[] args) {

        System.out.println("main started");

        /*Movie movie = new Movie();
        movie.setMovieId(101);
        movie.setMovieName("KGF Chapter 2");
        movie.setDirector("Prashanth Neel");
        movie.setProducer("Vijay Kiragandur");
        movie.setHero("Yash");
        movie.setHeroine("Srinidhi Shetty");
        movie.setReleaseDate("14 April 2022");

        Theatre theatre = new Theatre();
        boolean movieAdded = theatre.addMovieDetails(movie);

        if (movieAdded) {
            theatre.getMovieInfo();
        } else {
            System.out.println("Movie details are not valid");
        }*/

        Movie movie1 = new Movie();
        movie1.setMovieId(101);
        movie1.setMovieName("KGF Chapter 2");
        movie1.setDirector("Prashanth Neel");
        movie1.setProducer("Vijay Kiragandur");
        movie1.setHero("Yash");
        movie1.setHeroine("Srinidhi Shetty");
        movie1.setReleaseDate("14 April 2022");

        Movie movie2 = new Movie();
        movie2.setMovieId(102);
        movie2.setMovieName("RRR");
        movie2.setDirector("S. S. Rajamouli");
        movie2.setProducer("D. V. V. Danayya");
        movie2.setHero("Ram Charan");
        movie2.setHeroine("Alia Bhatt");
        movie2.setReleaseDate("25 March 2022");

        Movie movie3 = new Movie();
        movie3.setMovieId(103);
        movie3.setMovieName("Baahubali: The Beginning");
        movie3.setDirector("S. S. Rajamouli");
        movie3.setProducer("Shobu Yarlagadda");
        movie3.setHero("Prabhas");
        movie3.setHeroine("Tamannaah Bhatia");
        movie3.setReleaseDate("10 July 2015");

        Movie movie4 = new Movie();
        movie4.setMovieId(104);
        movie4.setMovieName("Pushpa: The Rise");
        movie4.setDirector("Sukumar");
        movie4.setProducer("Naveen Yerneni");
        movie4.setHero("Allu Arjun");
        movie4.setHeroine("Rashmika Mandanna");
        movie4.setReleaseDate("17 December 2021");

        Movie movie5 = new Movie();
        movie5.setMovieId(105);
        movie5.setMovieName("Vikram");
        movie5.setDirector("Lokesh Kanagaraj");
        movie5.setProducer("Raaj Kamal Films");
        movie5.setHero("Kamal Haasan");
        movie5.setHeroine("Gayathrie Shankar");
        movie5.setReleaseDate("3 June 2022");

        Movie movie6 = new Movie();
        movie6.setMovieId(106);
        movie6.setMovieName("Kantara");
        movie6.setDirector("Rishab Shetty");
        movie6.setProducer("Vijay Kiragandur");
        movie6.setHero("Rishab Shetty");
        movie6.setHeroine("Sapthami Gowda");
        movie6.setReleaseDate("30 September 2022");

        Movie movie7 = new Movie();
        movie7.setMovieId(107);
        movie7.setMovieName("Leo");
        movie7.setDirector("Lokesh Kanagaraj");
        movie7.setProducer("Seven Screen Studio");
        movie7.setHero("Vijay");
        movie7.setHeroine("Trisha Krishnan");
        movie7.setReleaseDate("19 October 2023");

        Movie movie8 = new Movie();
        movie8.setMovieId(108);
        movie8.setMovieName("Salaar");
        movie8.setDirector("Prashanth Neel");
        movie8.setProducer("Vijay Kiragandur");
        movie8.setHero("Prabhas");
        movie8.setHeroine("Shruti Haasan");
        movie8.setReleaseDate("22 December 2023");

        Movie movie9 = new Movie();
        movie9.setMovieId(109);
        movie9.setMovieName("Master");
        movie9.setDirector("Lokesh Kanagaraj");
        movie9.setProducer("Xavier Britto");
        movie9.setHero("Vijay");
        movie9.setHeroine("Malavika Mohanan");
        movie9.setReleaseDate("13 January 2021");

        Movie movie10 = new Movie();
        movie10.setMovieId(110);
        movie10.setMovieName("Kirik Party");
        movie10.setDirector("Rishab Shetty");
        movie10.setProducer("GS Gupta");
        movie10.setHero("Rakshit Shetty");
        movie10.setHeroine("Rashmika Mandanna");
        movie10.setReleaseDate("30 December 2016");

        Theatre theatre = new Theatre();
        theatre.addMovie(movie1);
        theatre.addMovie(movie2);
        theatre.addMovie(movie3);
        theatre.addMovie(movie4);
        theatre.addMovie(movie5);
        theatre.addMovie(movie6);
        theatre.addMovie(movie7);
        theatre.addMovie(movie8);
        theatre.addMovie(movie9);
        theatre.addMovie(movie10);
        theatre.getMovie();

        System.out.println("main ended");
    }
}
