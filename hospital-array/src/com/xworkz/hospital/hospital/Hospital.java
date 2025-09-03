package com.xworkz.hospital.hospital;

import com.xworkz.hospital.patient.Patient;

public class Hospital {
        Patient[] patients = new Patient[3];
        int index;

        public boolean addPatient(Patient patient){
            boolean isPatientAdded = false;
            if (patient != null){
                patients[index++]=patient;
                isPatientAdded=true;
            }
            else {
                System.out.println("Invalid Patient");
            }
            return isPatientAdded;
        }
        public void getAllPatients(){
            System.out.println("List of patients ");
            for (Patient patient:patients){
                System.out.println(patient.getPatientId());
            }

        }

    }

