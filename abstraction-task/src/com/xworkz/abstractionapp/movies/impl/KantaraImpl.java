package com.xworkz.abstractionapp.movies.impl;

import com.xworkz.abstractionapp.movies.Movie;

public class KantaraImpl implements Movie {
    @Override
    public void movieName() {
        System.out.println("Movie name is Kantara");
    }

    @Override
    public void director() {
        System.out.println("Director name is Rishab Shetty");

    }

    @Override
    public void releasedOn() {
        System.out.println("Released on 2022");

    }
}
