package com.xworkz.companyapp.company;

import com.xworkz.companyapp.constants.Domain;
import com.xworkz.companyapp.exception.*;
import com.xworkz.companyapp.project.Project;

public class CompanyImpl implements Company {

    public CompanyImpl(int size){
        projects = new Project[size];
    }
    public Project[] projects ;
    int index;

    @Override
    public boolean addProject(Project project){
        boolean isProjectAdded = false;
        try {
            if (project != null) {
                projects[index++] = project;
                isProjectAdded = true;
            } else {
                AddProjectNotFoundException addProjectNotFoundException = new AddProjectNotFoundException("Invalid adding operation");
                throw addProjectNotFoundException;
            }
        }catch (AddProjectNotFoundException e){
            e.printStackTrace();
        }
        return isProjectAdded;
    }

    @Override
    public boolean updateProjectNameByBudget(String projectName,double updateBudget){
        boolean budgetUpdate = false;
        try{
            for (Project project : this.projects) {
                if (project.getProjectName().equals(projectName)) {
                    project.setBudget(updateBudget);
                    System.out.println("Update Budget");
                    budgetUpdate = true;
                } else {
                    throw new UpdateProjectNameByBudgetNotFoundException("Invalid Update");
                }
            }
            }catch (UpdateProjectNameByBudgetNotFoundException e){
               e.printStackTrace();
        }
        return budgetUpdate;
    }


    @Override
    public boolean updateProjectTeamSizeByProjectName(String projectName1, int updateTeamSize) {
        boolean teamSizeUpdate = false;
        try {
            for (Project project : this.projects) {
                if (project.getProjectName().equals(projectName1)) {
                    project.setTeamSize(updateTeamSize);
                    System.out.println("Team size update");
                    teamSizeUpdate = true;
                } else {
                    throw new UpdateProjectTeamSizeByProjectNameNotFoundException("Invalid Exception");
                }

            }
        } catch (UpdateProjectTeamSizeByProjectNameNotFoundException e) {
            e.printStackTrace();
        }
        return teamSizeUpdate;
    }


    @Override
    public boolean updateProjectDeadlineByProjectId(int projectId, String updateDeadLine){
        boolean deadLineUpdate = false;
        try {
            for (Project project : this.projects) {
                if (project.getProjectId() == projectId) {
                    project.setDeadLine(updateDeadLine);
                    System.out.println("Project dead line update");
                    deadLineUpdate = true;
                } else {
                    throw new UpdateProjectNameByBudgetNotFoundException("Invalid updation");
                }

            }
        }catch (UpdateProjectNameByBudgetNotFoundException e){
            e.printStackTrace();
        }

       return deadLineUpdate;
    }

    @Override
    public boolean updateProjectManagerByProjectName(String projectName2, String updateProjectManager){
        boolean projectManagerUpdate = false;
         try{
        for (Project project : this.projects){
            if (project.getProjectName().equals(projectName2)){
                project.setProjectManager(updateProjectManager);
                System.out.println("Project manager update");
                projectManagerUpdate = true;
            }else{
                throw new UpdateProjectManagerByProjectNameNotFoundException("Invalid Update");
            }
        }
    }catch(UpdateProjectManagerByProjectNameNotFoundException e) {
             e.printStackTrace();
         }
        return projectManagerUpdate;
    }

    @Override
    public String getProjectNameById(int projectId1) {
        String projectName = null;
        try {
            for (Project project : this.projects) {
                if (project.getProjectId() == projectId1) {
                    projectName = project.getProjectName();
                } else {
                    throw new GetProjectNameByIdNotFoundException("Invalid update");
                }
            }
        } catch (GetProjectNameByIdNotFoundException e) {
            e.printStackTrace();
        }
        return projectName;
    }

    @Override
    public String getProjectManagerByDomain(Domain domain) {
        String projectManager = null;
        try {
            for (Project project : this.projects) {
                if (project.getDomain().equals(domain)) {
                    projectManager = (project.getProjectManager());
                } else {
                    throw new GetProjectManagerByDomainNotFoundException("Invalid update");
                }
            }
        } catch (GetProjectManagerByDomainNotFoundException e) {
            e.printStackTrace();
        }
        return projectManager;
    }

    @Override
    public String getClientNameByProjectName(String projectName3) {
        String clientName = null;
        try {
            for (Project project : this.projects) {
                if (project.getProjectName().equals(projectName3)) {
                    return project.getClientName();
                } else {
                    throw new GetClientNameByProjectNameNotFoundException("Invalid update");
                }
            }
        } catch (GetClientNameByProjectNameNotFoundException e) {
        }
        return clientName;
    }


    @Override
    public double getBudgetByProjectId(int projectId2) {
        double budget = 0.0;
        try {
            for (Project project : this.projects) {
                if (project.getProjectId() == projectId2) {
                    return project.getBudget();
                } else {
                    throw new GetBudgetByProjectIdNotFoundException("Invalid Update");
                }
            }
        }catch (GetBudgetByProjectIdNotFoundException e){
            e.printStackTrace();
        }
        return budget;
    }

    @Override
    public String  getDadeLineByProjectName(String projectName4) {
        String dadeLine = null;
        try {
            for (Project project : this.projects) {
                if (project.getProjectName().equals(projectName4)) {
                    return project.getDeadLine();
                } else {
                    throw new GetClientNameByProjectNameNotFoundException("Invalid Update");
                }
            }
        } catch (GetDadeLineByProjectNameNotFoundException e) {
            e.printStackTrace();
        }
        return dadeLine;
    }


    @Override
    public int getTeamSizeByProjectId(int projectId3){
        int teamSize = 0;
         try{
        for (Project project : this.projects){
            if (project.getProjectId()==projectId3){
                return project.getTeamSize();
            }else{
                throw new GetTeamSizeByProjectIdNotFoundException("Invalid Update");
            }
        }
    }catch(GetTeamSizeByProjectIdNotFoundException e){
             e.printStackTrace();
         }
         return teamSize;
        }


    public void getProject(){
        System.out.println("List of projects are : "+projects.length);
        for (Project project:projects){
            System.out.println("Project id: "+project.getProjectId());
            System.out.println("Project name: "+project.getProjectName());
            System.out.println("Project client Name: "+project.getClientName());
            System.out.println("Project domain: "+project.getDomain());
            System.out.println("Project team size: "+project.getTeamSize());
            System.out.println("Project manager: "+project.getProjectManager());
            System.out.println("Project budget: "+project.getBudget());
            System.out.println("Project deadLine: "+project.getDeadLine());
            System.out.println("");
        }
    }

   /* Project project;
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
    }*/
}
