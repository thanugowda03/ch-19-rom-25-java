package com.xworkz.companyapp.company;

import com.xworkz.companyapp.project.Project;
import com.xworkz.companyapp.validator.ProjectValidator;

public class Company {

    Project project;
    public boolean addProject(Project project){
        boolean isProjectAdded = false;
        boolean isProjectInfoValid = false;

        ProjectValidator projectValidator = new ProjectValidator();
        isProjectInfoValid = projectValidator.validateProjectInfo(project);

        if (isProjectInfoValid){
            this.project = project;
            isProjectAdded = true;
        }
        return isProjectAdded;
    }
    public void getProjectInfo(){
        System.out.println("Project id: "+project.getProjectId());
        System.out.println("Project name: "+project.getProjectName());
        System.out.println("Project client Name: "+project.getClientName());
        System.out.println("Project domain: "+project.getDomain());
        System.out.println("Project team size: "+project.getTeamSize());
        System.out.println("Project manager: "+project.getProjectManager());
        System.out.println("Project budget: "+project.getBudget());
        System.out.println("Project deadLine: "+project.getDeadLine());
    }
}
