package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.exception.*;
import com.xworkz.instituteapp.trainee.TraineeDetails;

public class InstituteImpl implements Institute {

    public InstituteImpl(int size){
        traineeDetail = new TraineeDetails[size];
    }

    public TraineeDetails[] traineeDetail;
    int index;

    @Override
    public boolean addTrainee(TraineeDetails traineeDetails){
        boolean isTraineeAdded = false;
        try {
            if (traineeDetails != null) {
                traineeDetail[index++] = traineeDetails;
                isTraineeAdded = true;
            } else {
                throw new AddTraineeException("Invalid Add Trainee");
            }
        }catch (AddTraineeException e){
            e.printStackTrace();
        }
        return isTraineeAdded;
    }


    @Override
    public boolean updateTraineeIdByInstituteName(String instituteName, int updateTraineeId) {
        boolean traineeIdUpdate = false;
        try {
            for (TraineeDetails traineeDetails : this.traineeDetail) {
                if (traineeDetails.getInstituteName().equals(instituteName)) {
                    traineeDetails.setTraineeId(updateTraineeId);
                    System.out.println("Trainee id update");
                    traineeIdUpdate = true;
                } else {
                    throw new UpdateTraineeIdByInstituteNameNotFoundException("Inavlid update");
                }
            }
        }catch (UpdateTraineeIdByInstituteNameNotFoundException e){
            e.printStackTrace();
        }
        return traineeIdUpdate;
    }


    @Override
    public boolean updateTraineeNameByTraineeId(int traineeId, String updateTraineeName) {
        boolean traineeNameUpdate = false;
          try {
              for (TraineeDetails traineeDetails : this.traineeDetail) {
                  if (traineeDetails.getTraineeId() == traineeId) {
                      traineeDetails.setTraineeName(updateTraineeName);
                      System.out.println("Trainee id update");
                      traineeNameUpdate = true;
                  } else {
                      throw new UpdateTraineeNameByTraineeIdNotFoundException("Invalid Update");
                  }
              }
          }catch (UpdateTraineeNameByTraineeIdNotFoundException e){
              e.printStackTrace();
          }
        return traineeNameUpdate;
    }


@Override
    public boolean updateTraineeAgeByTraineeName(String traineeName, int updateAge) {
        boolean ageUpdate = false;
        try {
            for (TraineeDetails traineeDetails : this.traineeDetail) {
                if (traineeDetails.getTraineeName().equals(traineeName)) {
                    traineeDetails.setAge(updateAge);
                    System.out.println("Trainee id update");
                    ageUpdate = true;
                } else {
                    throw new UpdateTraineeAgeByTraineeNameNotFoundException("Invalid Upddate");
                }
            }
        }catch (UpdateTraineeAgeByTraineeNameNotFoundException e){
            e.printStackTrace();
        }
        return ageUpdate;
    }


@Override
    public boolean updateBatchTimeByInstituteName(String instituteName1, String updateBatchTiming) {
        boolean batchTimeUpdate = false;
         try {
             for (TraineeDetails traineeDetails : this.traineeDetail) {
                 if (traineeDetails.getInstituteName().equals(instituteName1)) {
                     traineeDetails.setBatchTiming(updateBatchTiming);
                     System.out.println("Trainee id update");
                     batchTimeUpdate = true;
                 } else {
                     throw new UpdateBatchTimeByInstituteNameNotFoundException("Invalid update");
                 }
             }
         }catch (UpdateBatchTimeByInstituteNameNotFoundException e){
             e.printStackTrace();
         }
        return batchTimeUpdate;
    }

@Override
    public boolean updateTrainerByInstituteName(String instituteName2, String updateTrainer) {
        boolean trainerUpdate = false;
         try {
             for (TraineeDetails traineeDetails : this.traineeDetail) {
                 if (traineeDetails.getInstituteName().equals(instituteName2)) {
                     traineeDetails.setTrainerName(updateTrainer);
                     System.out.println("Trainee id update");
                     trainerUpdate = true;
                 } else {
                     throw new UpdateTrainerByInstituteNameNotFoundException("Invalid update");
                 }
             }
         }catch (UpdateTrainerByInstituteNameNotFoundException e){
             e.printStackTrace();
         }
        return trainerUpdate;
    }

@Override
    public String getTraineeNameByTraineeID(int traineeId1){
        String traineeName = null;
         try{
        for (TraineeDetails traineeDetails: this.traineeDetail){
            if (traineeDetails.getTraineeId()==traineeId1){
                return traineeDetails.getTraineeName();
            }else{
                throw new GetTraineeNameByTraineeIDNotFoundException("Invalid get operation");
            }
        }
         }catch (GetTraineeNameByTraineeIDNotFoundException e){
             e.printStackTrace();
         }
        return traineeName;
    }

@Override
    public int getTraineeAgeByTraineeName(String traineeName1){
        int age = 0;
        try{
        for (TraineeDetails traineeDetails: this.traineeDetail) {
            if (traineeDetails.getTraineeName().equals(traineeName1)) {
                return traineeDetails.getAge();
            } else {
                throw new GetTraineeAgeByTraineeNameNotFoundException("Invalid Get operation");
            }
        }
        }catch (GetTraineeAgeByTraineeNameNotFoundException e){
            e.printStackTrace();
        }
        return age;
    }


@Override
    public String getTraineeCourseNameByTraineeName(String traineeName2){
        String courseName = null;

        for (TraineeDetails traineeDetails: this.traineeDetail){
            if (traineeDetails.getTraineeName().equals(traineeName2)){
                return traineeDetails.getCourseName();
            }
        }
        if (courseName != null) System.out.println("Trainee course name not found to trainee name"+traineeName2);
        return courseName;
    }
    @Override
    public String getTraineeContactNumberByTraineeId(int traineeId2){
        String contactNumber = null;
        try {
            for (TraineeDetails traineeDetails : this.traineeDetail) {
                if (traineeDetails.getTraineeId() == traineeId2) {
                    return traineeDetails.getContactNumber();
                } else {
                    throw new GetTraineeContactNumberByTraineeIdNotFoundException("Invalid Get operation");
                }
            }
        }catch (GetTraineeContactNumberByTraineeIdNotFoundException e){
            e.printStackTrace();
        }
        return contactNumber;
    }

@Override
    public String getTraineeEmailIdByTraineeName(String traineeName3){
        String emailId = null;
        try {
            for (TraineeDetails traineeDetails : this.traineeDetail) {
                if (traineeDetails.getTraineeName().equals(traineeName3)) {
                    return traineeDetails.getEmailID();
                } else {
                    throw new GetTraineeEmailIdByTraineeNameNotFoundException("Invalid get operation");
                }
            }
        }catch (GetTraineeEmailIdByTraineeNameNotFoundException e){
            e.printStackTrace();
        }
        return emailId;
    }



    public void getTraineeDetails(){
        System.out.println("List of trainee: "+traineeDetail.length);
        for (TraineeDetails traineeDetails : traineeDetail){
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
            System.out.println("");
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
    }*/
}
