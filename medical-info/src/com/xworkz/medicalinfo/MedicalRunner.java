package com.xworkz.medicalinfo;

import com.xworkz.medicalinfo.medical.Medical;

public class MedicalRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Medical medical=new Medical();
        medical.setMedicalId(12);
        medical.setMedicalName("Harsha Medicals");
        medical.setLocation("Sullia");
        medical.setOwnerName("Mr. Harsha");

        int medicalId=medical.getMedicalId();
        String medicalName=medical.getMedicalName();
        String location=medical.getLocation();
        String ownerName=medical.getOwnerName();

        System.out.println("Medical Id "+medicalId);
        System.out.println("Medical Name "+medicalName);
        System.out.println("Location "+location);
        System.out.println("Owner Name "+ownerName);
        System.out.println("main ended");
    }
}
