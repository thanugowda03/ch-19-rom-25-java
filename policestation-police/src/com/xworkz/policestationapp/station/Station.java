package com.xworkz.policestationapp.station;

public class Station {
   private int stationId;
   private String stationName;
   private String location;
   private String contactNumber;
   private int numberOfOfficers;
   private String inChargeName;
   private int yearEstablished;

   public int getStationId(){
       return stationId;
   }
   public void setStationId(int stationId){
       this.stationId = stationId;
   }
   public String getStationName(){
       return stationName;
   }
   public void setStationName(String stationName){
       this.stationName = stationName;
   }
   public String getLocation(){
       return location;
   }
   public void setLocation(String location) {
        this.location = location;
   }
   public String getContactNumber(){
       return contactNumber;
   }
   public void setContactNumber(String contactNumber){
       this.contactNumber = contactNumber;
   }
   public int getNumberOfOfficers(){
       return numberOfOfficers;
   }
   public void setNumberOfOfficers(int numberOfOfficers) {
        this.numberOfOfficers = numberOfOfficers;
   }
   public String getInChargeName(){
       return inChargeName;
   }
   public void setInChargeName(String inChargeName){
       this.inChargeName = inChargeName;
   }
   public int getYearEstablished(){
       return yearEstablished;
   }
   public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
   }
}
