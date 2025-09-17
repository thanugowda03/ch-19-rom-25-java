package com.xworkz.abstractionapp.chair;

import com.xworkz.abstractionapp.chair.impl.PlasticChair;

public class ChairRunner {
    public static void main(String[] args) {
        Chair chair=new PlasticChair();
        chair.move();
        chair.sit();
        chair.fold();
    }
}
