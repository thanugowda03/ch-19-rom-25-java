package com.xworkz.planetinfo;

import com.xworkz.planetinfo.planet.Planet;

public class PlanetRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        Planet planet = new Planet();
        planet.setPlanetId(1);
        planet.setPlanetName("Earth");
        planet.setMass("5.972e24");
        planet.setDistFromSun("149.6e6");
        planet.setNoOfMoons("1");

        int planetId = planet.getPlanetId();
        String planetName = planet.getPlanetName();
        String mass = planet.getMass();
        String distFromSun = planet.getDistFromSun();
        String noOfMoons = planet.getNoOfMoons();

        System.out.println("Planet Id: "+planetId);
        System.out.println("Planet name: "+planetName);
        System.out.println("Planet mass: "+mass);
        System.out.println("Planet distance from sun: "+distFromSun);
        System.out.println("Planet number of moons: "+noOfMoons);
        System.out.println("main ended");
    }
}
