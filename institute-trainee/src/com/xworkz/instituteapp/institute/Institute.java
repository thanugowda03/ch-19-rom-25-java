package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.trainee.Trainee;


public class Institute {
    Trainee[] trainees = new Trainee[15];
    int index;

    public void addTrainee(Trainee trainee) {
        boolean isTraineeAdded = false;
        if (trainee != null) {
            trainees[index++] = trainee;
            isTraineeAdded = true;
        } else {
            System.out.println("Invalid Trainee");
        }
    }

    /*TraineeDetails traineeDetails;
    public boolean addTraineeDetails(TraineeDetails traineeDetails){
        boolean isTraineeDetailsAdded = false;
        boolean isTraineeInfoValid = false;

        TraineeValidator traineeValidator = new TraineeValidator();
        isTraineeInfoValid = traineeValidator.validateTraineeInfo(traineeDetails);

        if (isTraineeInfoValid){
            this.traineeDetails = traineeDetails;
            isTraineeDetailsAdded = true;
        }
        return isTraineeDetailsAdded;
    }*/
    public void getTraineeInfo() {
        System.out.println("List of trainee : " + trainees.length);
        for (Trainee trainee : trainees) {
            System.out.println("Institute name: " + trainee.getInstituteName());
            System.out.println("Trainee id: " + trainee.getTraineeId());
            System.out.println("Trainee name: " + trainee.getTraineeName());
        /*System.out.println("Trainee age: "+traineeDetails.getAge());
        System.out.println("Trainee gender: "+traineeDetails.getGender());
        System.out.println("Trainee course name: "+traineeDetails.getCourseName());
        System.out.println("Trainee batch timing: "+traineeDetails.getBatchTiming());
        System.out.println("Trainer name: "+traineeDetails.getTrainerName());
        System.out.println("Trainee contact number: "+traineeDetails.getContactNumber());
        System.out.println("Trainee emailID: "+traineeDetails.getEmailID());*/
        }
    }
}
