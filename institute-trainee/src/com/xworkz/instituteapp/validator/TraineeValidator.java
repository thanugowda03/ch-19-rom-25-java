package com.xworkz.instituteapp.validator;

import com.xworkz.instituteapp.trainee.TraineeDetails;

public class TraineeValidator {

    TraineeDetails traineeDetails;

    public boolean validateTraineeInfo(TraineeDetails traineeDetails) {
        boolean traineeValidate = false;
        boolean instituteNameValid = false;
        boolean traineeIdValid = false;
        boolean traineeNameValid = false;
        boolean ageValid = false;
        boolean genderValid = false;
        boolean courseNameValid = false;
        boolean batchTimingValid = false;
        boolean trainerNameValid = false;
        boolean contactNumberValid = false;
        boolean emailIDValid = false;

        if (traineeDetails.getInstituteName() != null && !traineeDetails.getInstituteName().isEmpty()) {
            instituteNameValid = true;
        } else {
            System.out.println("Institute name is empty/null");
        }
        if (traineeDetails.getTraineeId() > 0) {
            traineeIdValid = true;
        } else {
            System.out.println("trainee id is not valid");
        }
        if (traineeDetails.getTraineeName() != null && !traineeDetails.getTraineeName().isEmpty()) {
            traineeNameValid = true;
        } else {
            System.out.println("trainee name is empty/null");
        }
        if (traineeDetails.getAge() > 0) {
            ageValid = true;
        } else {
            System.out.println("age is not valid");
        }
        if (traineeDetails.getGender() != null && !traineeDetails.getGender().isEmpty()) {
            genderValid = true;
        } else {
            System.out.println("Gender is empty/null");
        }
        if (traineeDetails.getCourseName() != null && !traineeDetails.getCourseName().isEmpty()) {
            courseNameValid = true;
        } else {
            System.out.println("Course name is empty/null");
        }
        if (traineeDetails.getBatchTiming() != null && !traineeDetails.getBatchTiming().isEmpty()) {
            batchTimingValid = true;
        } else {
            System.out.println("Batch timing is empty/null");
        }
        if (traineeDetails.getTrainerName() != null && !traineeDetails.getTrainerName().isEmpty()) {
            trainerNameValid = true;
        } else {
            System.out.println("Trainer Name is empty/null");
        }
        if (traineeDetails.getContactNumber() != null && !traineeDetails.getContactNumber().isEmpty()) {
            contactNumberValid = true;
        } else {
            System.out.println("Contact number is empty/null");
        }
        if (traineeDetails.getEmailID() != null && !traineeDetails.getEmailID().isEmpty()) {
            emailIDValid = true;
        } else {
            System.out.println("Email id empty/null");
        }
        if (instituteNameValid && traineeIdValid && traineeNameValid && ageValid && genderValid && courseNameValid && batchTimingValid && trainerNameValid && contactNumberValid && emailIDValid) {
            traineeValidate = true;
        }
        return traineeValidate;
    }
}
