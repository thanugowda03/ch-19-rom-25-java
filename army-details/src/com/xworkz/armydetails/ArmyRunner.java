package com.xworkz.armydetails;

import com.xworkz.armydetails.army.Army;

public class ArmyRunner {
    public static void main(String[] args) {
        System.out.println("main stared");
        Army army=new Army();

        army.setId(1);
        army.setBranch("Airforce");
        army.setName("Rahul");
        army.setRank("5");
        army.setYearsOfExperience("10");

        int id=army.getId();
        String branch= army.getBranch();
        String name= army.getName();
        String rank= army.getRank();
        String yearsOfExperience= army.getYearsOfExperience();

        System.out.println("Id "+id);
        System.out.println("Branch "+branch);
        System.out.println("Name "+name);
        System.out.println("Rank "+rank);
        System.out.println("Years of Experience "+yearsOfExperience);


        System.out.println("main ended");
    }
}
