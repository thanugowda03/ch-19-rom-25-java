package com.xworkz.instituteapp;

import com.xworkz.instituteapp.institute.Institute;
import com.xworkz.instituteapp.institute.InstituteImpl;
import com.xworkz.instituteapp.trainee.TraineeDetails;

import java.util.Scanner;

public class InstituteRunner {

    public static void main(String[] args) {

        System.out.println("main started");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no trainees:");
        int size =scanner.nextInt();
        InstituteImpl institute = new InstituteImpl(size);

        for (int i=0; i<size; i++){
            TraineeDetails traineeDetails = new TraineeDetails();
            System.out.println("Enter institute name:");
            traineeDetails.setInstituteName(scanner.next());
            System.out.println("Enter traineeId:");
            traineeDetails.setTraineeId(scanner.nextInt());
            System.out.println("Enter traineeName:");
            traineeDetails.setTraineeName(scanner.next());
            System.out.println("Enter age:");
            traineeDetails.setAge(scanner.nextInt());
            System.out.println("Enter gender:");
            traineeDetails.setGender(scanner.next());
            System.out.println("Enter course name:");
            traineeDetails.setCourseName(scanner.next());
            System.out.println("Enter batch timing:");
            traineeDetails.setBatchTiming(scanner.next());
            System.out.println("Enter trainerName:");
            traineeDetails.setTrainerName(scanner.next());
            System.out.println("Enter contact number:");
            traineeDetails.setContactNumber(scanner.next());
            System.out.println("Enter email Id:");
            traineeDetails.setEmailID(scanner.next());

            institute.addTrainee(traineeDetails);
        }
        institute.getTraineeDetails();

        System.out.println("Enter institute name to update trainee id:"); scanner.nextLine();
        String  instituteName = scanner.next();
        System.out.println("Enter update trainee id:");
        institute.updateTraineeIdByInstituteName(instituteName, scanner.nextInt());
        institute.getTraineeDetails();

        System.out.println("Enter trainee id to update trainee name:"); scanner.nextLine();
        int traineeId = scanner.nextInt();
        System.out.println("Enter update trainee name:");
        institute.updateTraineeNameByTraineeId(traineeId, scanner.next());
        institute.getTraineeDetails();

        System.out.println("Enter trainee name to update trainee age:"); scanner.nextLine();
        String traineeName = scanner.next();
        System.out.println("Enter update trainee age:");
        institute.updateTraineeAgeByTraineeName(traineeName, scanner.nextInt());
        institute.getTraineeDetails();

        System.out.println("Enter institute name to update batch timing:"); scanner.nextLine();
        String instituteName1 = scanner.next();
        System.out.println("Enter update trainee id:");
        institute.updateBatchTimeByInstituteName(instituteName1, scanner.next());
        institute.getTraineeDetails();

        System.out.println("Enter institute name to update trainer:"); scanner.nextLine();
        String instituteName2 = scanner.next();
        System.out.println("Enter update trainer:");
        institute.updateTrainerByInstituteName(instituteName2, scanner.next());
        institute.getTraineeDetails();

        System.out.println("Enter trainee id to fetch the trainee name:"); scanner.nextLine();
        String traineeId1 = institute.getTraineeNameByTraineeID(scanner.nextInt());
        System.out.println(traineeId1);

        System.out.println("Enter trainee name to fetch the trainee age:"); scanner.nextLine();
        int traineeName1 = institute.getTraineeAgeByTraineeName(scanner.next());
        System.out.println(traineeName1);

        System.out.println("Enter trainee name to fetch the trainee course name:"); scanner.nextLine();
        String traineeName2 = institute.getTraineeCourseNameByTraineeName(scanner.next());
        System.out.println(traineeName2);

        System.out.println("Enter trainee id to fetch the trainee contact number:"); scanner.nextLine();
        String traineeId2 = institute.getTraineeContactNumberByTraineeId(scanner.nextInt());
        System.out.println(traineeId2);

        System.out.println("Enter trainee name to fetch the trainee emailId:"); scanner.nextLine();
        String traineeName3 = institute.getTraineeEmailIdByTraineeName(scanner.next());
        System.out.println(traineeName3);




















       /* TraineeDetails traineeDetails = new TraineeDetails();
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
        }*/

        /*TraineeDetails trainee1 = new TraineeDetails();
        trainee1.setInstituteName("X-Workz Training Center");
        trainee1.setTraineeId(1);
        trainee1.setTraineeName("Yashaswini K");
        trainee1.setAge(21);
        trainee1.setGender("Female");
        trainee1.setCourseName("Java");
        trainee1.setBatchTiming("9.00AM to 2.00PM");
        trainee1.setTrainerName("Devendra Singh sir");
        trainee1.setContactNumber("7022887988");
        trainee1.setEmailID("yashukallesh46@gmail.com");

        TraineeDetails trainee2 = new TraineeDetails();
        trainee2.setInstituteName("X-Workz Training Center");
        trainee2.setTraineeId(2);
        trainee2.setTraineeName("Rahul");
        trainee2.setAge(22);
        trainee2.setGender("Male");
        trainee2.setCourseName("Java");
        trainee2.setBatchTiming("9.00AM to 2.00PM");
        trainee2.setTrainerName("Devendra Singh sir");
        trainee2.setContactNumber("9876543210");
        trainee2.setEmailID("rahul.@gmail.com");

        TraineeDetails trainee3 = new TraineeDetails();
        trainee3.setInstituteName("X-Workz Training Center");
        trainee3.setTraineeId(3);
        trainee3.setTraineeName("Sneha");
        trainee3.setAge(21);
        trainee3.setGender("Female");
        trainee3.setCourseName("Java");
        trainee3.setBatchTiming("9.00AM to 2.00PM");
        trainee3.setTrainerName("Devendra Singh sir");
        trainee3.setContactNumber("9123456780");
        trainee3.setEmailID("sneha.@gmail.com");

        TraineeDetails trainee4 = new TraineeDetails();
        trainee4.setInstituteName("X-Workz Training Center");
        trainee4.setTraineeId(4);
        trainee4.setTraineeName("Karthik");
        trainee4.setAge(23);
        trainee4.setGender("Male");
        trainee4.setCourseName("Java");
        trainee4.setBatchTiming("9.00AM to 2.00PM");
        trainee4.setTrainerName("Devendra Singh sir");
        trainee4.setContactNumber("9988776655");
        trainee4.setEmailID("karthik.gowda@gmail.com");

        TraineeDetails trainee5 = new TraineeDetails();
        trainee5.setInstituteName("X-Workz Training Center");
        trainee5.setTraineeId(5);
        trainee5.setTraineeName("Ananya");
        trainee5.setAge(20);
        trainee5.setGender("Female");
        trainee5.setCourseName("Java");
        trainee5.setBatchTiming("9.00AM to 2.00PM");
        trainee5.setTrainerName("Devendra Singh sir");
        trainee5.setContactNumber("90897456265");
        trainee5.setEmailID("ananya.@gmail.com");

        TraineeDetails trainee6 = new TraineeDetails();
        trainee6.setInstituteName("X-Workz Training Center");
        trainee6.setTraineeId(6);
        trainee6.setTraineeName("Rohit");
        trainee6.setAge(22);
        trainee6.setGender("Male");
        trainee6.setCourseName("Java");
        trainee6.setBatchTiming("9.00AM to 2.00PM");
        trainee6.setTrainerName("Devendra Singh sir");
        trainee6.setContactNumber("9874654123");
        trainee6.setEmailID("rohit.@gmail.com");

        TraineeDetails trainee7 = new TraineeDetails();
        trainee7.setInstituteName("X-Workz Training Center");
        trainee7.setTraineeId(7);
        trainee7.setTraineeName("Divya");
        trainee7.setAge(21);
        trainee7.setGender("Female");
        trainee7.setCourseName("Java");
        trainee7.setBatchTiming("9.00AM to 2.00PM");
        trainee7.setTrainerName("Devendra Singh sir");
        trainee7.setContactNumber("8963254712");
        trainee7.setEmailID("divya.@gmail.com");

        TraineeDetails trainee8 = new TraineeDetails();
        trainee8.setInstituteName("X-Workz Training Center");
        trainee8.setTraineeId(8);
        trainee8.setTraineeName("Manoj");
        trainee8.setAge(23);
        trainee8.setGender("Male");
        trainee8.setCourseName("Java");
        trainee8.setBatchTiming("9.00AM to 2.00PM");
        trainee8.setTrainerName("Devendra Singh sir");
        trainee8.setContactNumber("8974586589");
        trainee8.setEmailID("manoj.@gmail.com");

        TraineeDetails trainee9 = new TraineeDetails();
        trainee9.setInstituteName("X-Workz Training Center");
        trainee9.setTraineeId(9);
        trainee9.setTraineeName("Pooja");
        trainee9.setAge(20);
        trainee9.setGender("Female");
        trainee9.setCourseName("Java");
        trainee9.setBatchTiming("9.00AM to 2.00PM");
        trainee9.setTrainerName("Devendra Singh sir");
        trainee9.setContactNumber("7894561230");
        trainee9.setEmailID("pooja.@gmail.com");

        TraineeDetails trainee10 = new TraineeDetails();
        trainee10.setInstituteName("X-Workz Training Center");
        trainee10.setTraineeId(10);
        trainee10.setTraineeName("Thanushree");
        trainee10.setAge(22);
        trainee10.setGender("Male");
        trainee10.setCourseName("Java");
        trainee10.setBatchTiming("9.00AM to 2.00PM");
        trainee10.setTrainerName("Devendra Singh sir");
        trainee10.setContactNumber("9874582145");
        trainee10.setEmailID("thanu.@gmail.com");

        TraineeDetails trainee11 = new TraineeDetails();
        trainee11.setInstituteName("X-Workz Training Center");
        trainee11.setTraineeId(11);
        trainee11.setTraineeName("Shreya");
        trainee11.setAge(21);
        trainee11.setGender("Female");
        trainee11.setCourseName("Java");
        trainee11.setBatchTiming("9.00AM to 2.00PM");
        trainee11.setTrainerName("Devendra Singh sir");
        trainee11.setContactNumber("9632587412");
        trainee11.setEmailID("shreya.@gmail.com");

        TraineeDetails trainee12 = new TraineeDetails();
        trainee12.setInstituteName("X-Workz Training Center");
        trainee12.setTraineeId(12);
        trainee12.setTraineeName("Vikram");
        trainee12.setAge(23);
        trainee12.setGender("Male");
        trainee12.setCourseName("Java");
        trainee12.setBatchTiming("9.00AM to 2.00PM");
        trainee12.setTrainerName("Devendra Singh sir");
        trainee12.setContactNumber("7854789626");
        trainee12.setEmailID("vikram.@gmail.com");

        TraineeDetails trainee13 = new TraineeDetails();
        trainee13.setInstituteName("X-Workz Training Center");
        trainee13.setTraineeId(235);
        trainee13.setTraineeName("Neha");
        trainee13.setAge(20);
        trainee13.setGender("Female");
        trainee13.setCourseName("Java");
        trainee13.setBatchTiming("9.00AM to 2.00PM");
        trainee13.setTrainerName("Devendra Singh sir");
        trainee13.setContactNumber("852964785");
        trainee13.setEmailID("neha.@gmail.com");

        TraineeDetails trainee14 = new TraineeDetails();
        trainee14.setInstituteName("X-Workz Training Center");
        trainee14.setTraineeId(14);
        trainee14.setTraineeName("Arjun");
        trainee14.setAge(22);
        trainee14.setGender("Male");
        trainee14.setCourseName("Java");
        trainee14.setBatchTiming("9.00AM to 2.00PM");
        trainee14.setTrainerName("Devendra Singh sir");
        trainee14.setContactNumber("8956745879");
        trainee14.setEmailID("arjun.@gmail.com");

        TraineeDetails trainee15 = new TraineeDetails();
        trainee15.setInstituteName("X-Workz Training Center");
        trainee15.setTraineeId(15);
        trainee15.setTraineeName("Megha Rao");
        trainee15.setAge(21);
        trainee15.setGender("Female");
        trainee15.setCourseName("Java");
        trainee15.setBatchTiming("9.00AM to 2.00PM");
        trainee15.setTrainerName("Devendra Singh sir");
        trainee15.setContactNumber("8745962586");
        trainee15.setEmailID("megha.@gmail.com");

        Institute institute = new Institute();
        institute.addTrainee(trainee1);
        institute.addTrainee(trainee2);
        institute.addTrainee(trainee3);
        institute.addTrainee(trainee4);
        institute.addTrainee(trainee5);
        institute.addTrainee(trainee6);
        institute.addTrainee(trainee7);
        institute.addTrainee(trainee8);
        institute.addTrainee(trainee9);
        institute.addTrainee(trainee10);
        institute.addTrainee(trainee11);
        institute.addTrainee(trainee12);
        institute.addTrainee(trainee13);
        institute.addTrainee(trainee14);
        institute.addTrainee(trainee15);
        institute.getTraineeDetails();*/
    }
}
