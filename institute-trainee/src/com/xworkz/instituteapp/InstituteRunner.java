package com.xworkz.instituteapp;

import com.xworkz.instituteapp.institute.Institute;
import com.xworkz.instituteapp.trainee.TraineeDetails;

public class InstituteRunner {

    public static void main(String[] args) {

        System.out.println("main started");

        TraineeDetails traineeDetails = new TraineeDetails();
        traineeDetails.setInstituteName("X-Workz traning center");
        traineeDetails.setTraineeId(223);
        traineeDetails.setTraineeName("Yashaswini K");
        traineeDetails.setAge(21);
        traineeDetails.setGender("Female");
        traineeDetails.setCourseName("Java");
        traineeDetails.setBatchTiming("9.00AM to 2.00PM");
        traineeDetails.setTrainerName("Devendra Singh sir");
        traineeDetails.setContactNumber("7022887988");
        traineeDetails.setEmailID("yashukallesh46@gmail.com");

        Institute institute = new Institute();
        boolean addTraineeDetails = institute.addTraineeDetails(traineeDetails);
        if (addTraineeDetails){
            institute.getTraineeInfo();
        }
        else {
            System.out.println("Application is not valid");
        }
    }
}
