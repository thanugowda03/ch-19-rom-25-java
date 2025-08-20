package com.xworkz.hospital.hospitalinfo;

public class Hospital {

    private int hospitalId;
    public int getHospitalId(){
        return hospitalId;
    }
    public void setHospitalId(int hospitalId){
        this.hospitalId=hospitalId;
    }
    private String hospitalName;
    public String getHospitalName(){
        return hospitalName;
    }
    public void setHospitalName(String hospitalName){
        this.hospitalName=hospitalName;
    }
   private String location;
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location=location;
    }
    private String doctorName;
    public String getDoctorName(){
        return doctorName;
    }
    public void setDoctorName(String doctorName){
        this.doctorName=doctorName;
    }

}
