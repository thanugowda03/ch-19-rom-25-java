package com.xworkz.abstractionapp.perfume;

import com.xworkz.abstractionapp.perfume.impl.FoggImpl;

public class PerfumeRunner {
    public static void main(String[] args) {
        Perfume perfume=new FoggImpl();
        perfume.price();
        perfume.weight();
        perfume.bottleColor();
    }
}
