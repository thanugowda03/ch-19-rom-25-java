package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.project.Project;

public class CompanyRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Project project = new Project();
        project.setProjectId(1001);
        project.setProjectName("E-Commerce WebApp");
        project.setClientName("Flipkart");
        project.setDomain("Retail");
        project.setTeamSize(12);
        project.setProjectManager("Anjali");
        project.setBudget(2500000.00);
        project.setDeadLine("30-12-2025");

        Company company = new Company();
        boolean projectAdded = company.addProject(project);
        if (projectAdded){
            company.getProjectInfo();
        }
        else {
            System.out.println("Application is not valid");
        }
    }
}
