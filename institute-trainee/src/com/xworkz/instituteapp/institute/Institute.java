package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.trainee.TraineeDetails;

public interface Institute {

    boolean addTrainee(TraineeDetails traineeDetails);

    boolean updateTraineeIdByInstituteName(String instituteName, int updateTraineeId);

    boolean updateTraineeNameByTraineeId(int traineeId, String updateTraineeName);

    boolean updateTraineeAgeByTraineeName(String traineeName, int updateAge);

    boolean updateBatchTimeByInstituteName(String instituteName1, String updateBatchTiming);

    boolean updateTrainerByInstituteName(String instituteName2, String updateTrainer);

    String getTraineeNameByTraineeID(int traineeId1);

    int getTraineeAgeByTraineeName(String traineeName1);

    String getTraineeCourseNameByTraineeName(String traineeName2);

    String getTraineeContactNumberByTraineeId(int traineeId2);

    String getTraineeEmailIdByTraineeName(String traineeName3);

    void getTraineeDetails();
}
