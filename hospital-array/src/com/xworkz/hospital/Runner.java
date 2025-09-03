package com.xworkz.hospital;

import com.xworkz.hospital.hospital.Hospital;
import com.xworkz.hospital.patient.Patient;

public class Runner {
    public static void main(String[] args) {
        System.out.println("main started");
        Patient patient=new Patient();
        patient.setPatientId(1);
        patient.setPatientName("XXX");
        Patient patient1=new Patient();
        patient1.setPatientId(2);
        patient1.setPatientName("YYY");
        Patient patient2=new Patient();
        patient2.setPatientId(3);
        patient2.setPatientName("ZZZ");
        patient.setLocation("Sullia");
        patient.setDoctorName("Dr.Himakara");

        Hospital hospital=new Hospital();
        hospital.addPatient(patient);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.getAllPatients();
        System.out.println("Patient1 id "+patient.getPatientId());
        System.out.println("Patient2 id "+patient1.getPatientId());
        System.out.println("Patient3 id "+patient2.getPatientId());
        System.out.println("Patient1 Name "+patient.getPatientName());
        System.out.println("Patient2 Name "+patient1.getPatientName());
        System.out.println("Patien3t Name "+patient2.getPatientName());
        System.out.println("Patient Location "+patient.getLocation());
        System.out.println("Doctor Name "+patient.getDoctorName());
        System.out.println("main ended");

    }


}
