package com.xworkz.hospitalapp.validator;

import com.xworkz.hospitalapp.patient.Patient;

public class PatientValidator {

    Patient patient;

    public boolean validatePatientInfo(Patient patient){
        boolean patientValidate = false;
        boolean patientIdValid = false;
        boolean patientNameValid = false;
        boolean ageValid = false;
        boolean genderValid = false;
        boolean diseaseValid = false;
        boolean admissionDateValid = false;
        boolean doctorAssignedValid = false;

        if (patient.getPatientId() > 0){
            patientIdValid = true;
        }
        else {
            System.out.println("Patient id is not valid");
        }
        if (patient.getPatientName() != null && !patient.getPatientName().isEmpty()){
            patientNameValid = true;
        }
        else {
            System.out.println("Patient name is empty/null");
        }
        if (patient.getAge() > 0){
            ageValid = true;
        }
        else {
            System.out.println("Age is not valid");
        }
        if (patient.getGender() != null && !patient.getGender().isEmpty()){
            genderValid = true;
        }
        else {
            System.out.println("Gender is empty/null");
        }
        if (patient.getDisease() != null && !patient.getDisease().isEmpty()){
            diseaseValid = true;
        }
        else {
            System.out.println("Disease is empty/null");
        }
        if (patient.getAdmissionDate() != null && !patient.getAdmissionDate().isEmpty()){
            admissionDateValid = true;
        }
        else {
            System.out.println("Admission date is empty/null");
        }
        if (patient.getDoctorAssigned() != null && !patient.getDoctorAssigned().isEmpty()){
            doctorAssignedValid = true;
        }
        else {
            System.out.println("Doctor assigned is empty/null");
        }
        if (patientIdValid && patientNameValid && ageValid && genderValid && diseaseValid && admissionDateValid && doctorAssignedValid){
            patientValidate = true;
        }
        return patientValidate;
    }
}
