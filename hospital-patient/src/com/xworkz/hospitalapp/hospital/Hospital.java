package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.validator.PatientValidator;

public class Hospital {

Patient patient;
    public boolean addPatient(Patient patient){
        boolean isPatinetAdded = false;
        boolean isPatientInfoValid = false;

        PatientValidator patientValidator = new PatientValidator();

        isPatientInfoValid = patientValidator.validatePatientInfo(patient);

        if (isPatientInfoValid) {
            this.patient = patient;
            isPatinetAdded = true;
        }
        return isPatinetAdded;
    }

    public void getPatientInfo(){
        System.out.println("Patient id: "+patient.getPatientId());
        System.out.println("Patient name: "+patient.getPatientName());
        System.out.println("Patient age: "+patient.getAge());
        System.out.println("Patient gender: "+patient.getGender());
        System.out.println("Patient disease: "+patient.getDisease());
        System.out.println("Patient admission date: "+patient.getAdmissionDate());
        System.out.println("Patient doctor assigned: "+patient.getDoctorAssigned());
    }

}