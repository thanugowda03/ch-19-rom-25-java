package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;


public class HospitalRunner {

    public static void main(String[] args) {

        System.out.println("main started");

        Patient patient = new Patient();
        patient.setPatientId(14);
        patient.setPatientName("Vinutha");
        patient.setAge(25);
        patient.setGender("Female");
        patient.setDisease("Malaria");
        patient.setAdmissionDate("12-07-2025");
        patient.setDoctorAssigned("Dr.Sandya");

        Hospital hospital = new Hospital();
        boolean patientAdded = hospital.addPatient(patient);

        if (patientAdded){
        hospital.getPatientInfo();
        }else {
            System.out.println("Application is not added");
        }
    }
}
