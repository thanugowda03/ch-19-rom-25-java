package com.xworkz.hospital;

import com.xworkz.hospital.hospitalinfo.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("main started");
            Hospital hospital=new Hospital();
            hospital.setHospitalId(1);
            hospital.setHospitalName("Durga Hospital");
            hospital.setLocation("Bhadravathi");
            hospital.setDoctorName("Dr. Shankar");

            int hospitalId=hospital.getHospitalId();
            String hospitalName=hospital.getHospitalName();
            String location=hospital.getLocation();
            String doctorName=hospital.getDoctorName();


        System.out.println("Hospital Id "+hospitalId);
        System.out.println("Hospital Name "+hospitalName);
        System.out.println("Location "+location);
        System.out.println("Doctor Name "+doctorName);
        System.out.println("main ended");
    }
}
