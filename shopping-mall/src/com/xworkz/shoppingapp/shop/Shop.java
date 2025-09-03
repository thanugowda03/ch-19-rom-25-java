package com.xworkz.shoppingapp.shop;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Shop {
    private int mallId;
    private String mallName;
    private String location;
    private int numberOfShops;
    private int numberOfFloors;
    private String openingHours;
    private String ownerName;

    /*public int getMallId(){
        return mallId;
    }
    public void setMallId(int mallId){
        this.mallId = mallId;
    }
    public String getMallName(){
        return mallName;
    }
    public void setMallName(String mallName){
        this.mallName = mallName;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public int getNumberOfShops(){
        return numberOfShops;
    }
    public void setNumberOfShops(int numberOfShops){
        this.numberOfShops = numberOfShops;
    }
    public int getNumberOfFloors(){
        return numberOfFloors;
    }
    public void setNumberOfFloors(int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
    }
    public String getOpeningHours(){
        return openingHours;
    }
    public void setOpeningHours(String openingHours){
        this.openingHours = openingHours;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }*/
}

