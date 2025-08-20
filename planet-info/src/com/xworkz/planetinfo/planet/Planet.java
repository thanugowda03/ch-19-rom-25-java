package com.xworkz.planetinfo.planet;

public class Planet {

    private int planetId;

    public int getPlanetId() {
        return planetId;
    }

    public void setPlanetId(int planetId) {
        this.planetId = planetId;
    }

    private String planetName;

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    private String mass;

    public String getMass(){
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    private String distFromSun;

    public String getDistFromSun() {
        return distFromSun;
    }

    public void setDistFromSun(String distFromSun) {
        this.distFromSun = distFromSun;
    }

    private String noOfMoons;

    public String getNoOfMoons() {
        return noOfMoons;
    }

    public void setNoOfMoons(String noOfMoons) {
        this.noOfMoons = noOfMoons;
    }
}
