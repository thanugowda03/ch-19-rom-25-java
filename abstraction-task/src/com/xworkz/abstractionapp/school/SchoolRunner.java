package com.xworkz.abstractionapp.school;

import com.xworkz.abstractionapp.school.impl.StudentImpl;

public class SchoolRunner {
    public static void main(String[] args) {
        School school=new StudentImpl();
        school.schoolName();
        school.noOfStudents();
        school.noOfSubjects();
    }
}
