package com.xwokz.juiceshop.juice;

public class JuiceShop {

    private String juiceShopName;
    public String getJuiceShopName(){
        return juiceShopName;
    }
    public void setJuiceShopName(String juiceShopName){
        this.juiceShopName=juiceShopName;
    }

    private String location;
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location=location;
    }

   private String ownerName;
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }
    private long phNumber;
    public long getPhNumber(){
        return phNumber;
    }
    public void setPhNumber(long phNumber){
        this.phNumber=phNumber;
    }
}
