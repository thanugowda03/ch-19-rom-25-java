package com.xworkz.abstractionapp.school.impl;

import com.xworkz.abstractionapp.school.School;

public class StudentImpl implements School {
    @Override
    public void schoolName() {
        System.out.println("School name is NMPUC Aranthodu");
    }

    @Override
    public void noOfStudents() {
        System.out.println(" No of Students:600");

    }

    @Override
    public void noOfSubjects() {
        System.out.println("No of subjects are 8-10");

    }
}
