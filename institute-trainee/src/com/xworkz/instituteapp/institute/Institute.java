package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.trainee.TraineeDetails;
import com.xworkz.instituteapp.validator.TraineeValidator;

public class Institute {

    TraineeDetails traineeDetails;
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
    }
    public void getTraineeInfo(){
        System.out.println("Institute name: "+traineeDetails.getInstituteName());
        System.out.println("Trainee id: "+traineeDetails.getTraineeId());
        System.out.println("Trainee name: "+traineeDetails.getTraineeName());
        System.out.println("Trainee age: "+traineeDetails.getAge());
        System.out.println("Trainee gender: "+traineeDetails.getGender());
        System.out.println("Trainee course name: "+traineeDetails.getCourseName());
        System.out.println("Trainee batch timing: "+traineeDetails.getBatchTiming());
        System.out.println("Trainer name: "+traineeDetails.getTrainerName());
        System.out.println("Trainee contact number: "+traineeDetails.getContactNumber());
        System.out.println("Trainee emailID: "+traineeDetails.getEmailID());
    }
}
