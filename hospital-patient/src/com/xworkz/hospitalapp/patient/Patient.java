package com.xworkz.hospitalapp.patient;

public class Patient {

    private int patientId;
    private String patientName;
    private int age;
    private String gender;
    private String disease;
    private String admissionDate;
    private String doctorAssigned;

    public int getPatientId(){
        return patientId;
    }
    public void setPatientId(int patientId){
        this.patientId = patientId;
    }
    public String getPatientName(){
        return patientName;
    }
    public void setPatientName(String patientName){
        this.patientName = patientName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getDisease(){
        return disease;
    }
    public void setDisease(String disease){
        this.disease = disease;
    }
    public String getAdmissionDate(){
        return admissionDate;
    }
    public void setAdmissionDate(String admissionDate){
        this.admissionDate = admissionDate;
    }
    public String getDoctorAssigned(){
        return doctorAssigned;
    }
    public void setDoctorAssigned(String doctorAssigned){
        this.doctorAssigned = doctorAssigned;
    }
}
