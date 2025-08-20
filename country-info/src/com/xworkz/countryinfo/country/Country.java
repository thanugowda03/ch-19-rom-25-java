package com.xworkz.countryinfo.country;

public class Country {

    private int countryId;
    public int getCountryId(){
        return countryId;
    }
    public void setCountryId(int countryId){
        this.countryId=countryId;
    }
    private String countryName;
    public String getCountryName(){
        return countryName;
    }
    public void setCountryName(String countryName){
        this.countryName=countryName;
    }
    private int noOfStates;
    public int getNoOfStates(){
        return noOfStates;
    }
    public void setNoOfStates(int noOfStates){
        this.noOfStates=noOfStates;
    }
    private String capital;
    public String getCapital(){
        return capital;
    }
    public void setCapital(String capital){
        this.capital=capital;
    }

}
