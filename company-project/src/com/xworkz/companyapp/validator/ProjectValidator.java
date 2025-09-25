package com.xworkz.companyapp.validator;

import com.xworkz.companyapp.project.Project;

public class ProjectValidator {

    Project project;
    public boolean validateProjectInfo(Project project){
        boolean projectValidate = false;
        boolean projectIdValid = false;
        boolean projectNameValid = false;
        boolean clientNameValid = false;
        boolean domainValid = false;
        boolean teamSizeValid = false;
        boolean projectManagerValid = false;
        boolean budgetValid = false;
        boolean deadLineValid = false;

        if (project.getProjectId() > 0){
            projectIdValid = true;
        }
        else {
            System.out.println("Project id is not valid");
        }
        if (project.getProjectName() != null && !project.getProjectName().isEmpty()){
            projectNameValid = true;
        }
        else {
            System.out.println("Project name is empty/null");
        }
        if (project.getClientName() != null && !project.getClientName().isEmpty()){
            clientNameValid = true;
        }
        else {
            System.out.println("Client name is empty/null");
        }
        if (project.getDomain() != null){
            domainValid = true;
        }
        else {
            System.out.println("Domain is empty/null");
        }
        if (project.getTeamSize() > 0){
            teamSizeValid = true;
        }
        else {
            System.out.println("Team size is not valid");
        }
        if (project.getProjectManager() != null && !project.getProjectManager().isEmpty()){
            projectManagerValid = true;
        }
        else {
            System.out.println("Project manager is empty/null");
        }
        if (project.getBudget() > 0){
            budgetValid = true;
        }
        else {
            System.out.println("Budget is not valid");
        }
        if (project.getDeadLine() != null && !project.getDeadLine().isEmpty()){
            deadLineValid = true;
        }
        else {
            System.out.println("Dead line is empty/null");
        }
        if (projectIdValid && projectNameValid && clientNameValid && domainValid && teamSizeValid && projectManagerValid && budgetValid && deadLineValid){
            projectValidate = true;
        }
        return projectValidate;
    }
}
