package com.xworkz.networkapp.network;

public class Network {

 private int networkId;
 public  int getNetworkId(){
  return networkId;
}
public void setNetworkId(int networkId){
   this.networkId=networkId;
}

private String networkType;
 public String getNetworkType() {
   return networkType;
 }
 public void setNetworkType(String networkType){
   this.networkType=networkType;
 }
  private String networkName;
  public String getNetworkName() {
    return networkName;
 }
 public void setNetworkName(String networkName) {
    this.networkName=networkName;
 }
  private double price;
  public double getPrice(){
    return price;
  }
  public void setPrice(double price){
    this.price=price;
  }

}
