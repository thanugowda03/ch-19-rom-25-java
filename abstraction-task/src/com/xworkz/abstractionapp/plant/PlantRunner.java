package com.xworkz.abstractionapp.plant;

import com.xworkz.abstractionapp.plant.impl.CoconutTreeImpl;

public class PlantRunner {
    public static void main(String[] args) {
        Plant plant=new CoconutTreeImpl();
        plant.plantName();
        plant.use();
        plant.height();
    }
}
