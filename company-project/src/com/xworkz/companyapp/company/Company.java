package com.xworkz.companyapp.company;

import com.xworkz.companyapp.constants.Domain;
import com.xworkz.companyapp.project.Project;

public interface Company {

    boolean addProject(Project project);

    boolean updateProjectNameByBudget(String projectName,double updateBudget);

    boolean updateProjectTeamSizeByProjectName(String projectName1, int updateTeamSize);

    boolean updateProjectDeadlineByProjectId(int projectId, String updateDeadLine);

    boolean updateProjectManagerByProjectName(String projectName2, String updateProjectManager);

    String getProjectNameById(int projectId1);

    String getProjectManagerByDomain(Domain domain);

    String getClientNameByProjectName(String projectName3);

    double getBudgetByProjectId(int projectId2);

    String  getDadeLineByProjectName(String projectName4);

    int getTeamSizeByProjectId(int projectId3);

    void getProject();
}
