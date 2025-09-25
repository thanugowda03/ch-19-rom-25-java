package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.company.CompanyImpl;
import com.xworkz.companyapp.constants.Domain;
import com.xworkz.companyapp.project.Project;

import java.util.Date;
import java.util.Scanner;

public class CompanyRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of projects:");

        int size = scanner.nextInt();
        CompanyImpl company = new CompanyImpl(size);
        System.out.println("Enter the projects are: "+company.projects.length);
        for (int i=0; i<size; i++){
            Project project = new Project();
            System.out.println("Enter the project id:");
            project.setProjectId(scanner.nextInt());
            System.out.println("Enter the project name:");
            project.setProjectName(scanner.next());
            System.out.println("Enter client name:");
            project.setClientName(scanner.next());
            System.out.println("Enter domain:");
            project.setDomain(Domain.valueOf(scanner.next().toUpperCase()));
            System.out.println("Enter team size: ");
            project.setTeamSize(scanner.nextInt());
            System.out.println("Enter Project manager name:");
            project.setProjectManager(scanner.next());
            System.out.println("Enter budget:");
            project.setBudget(scanner.nextDouble());
            System.out.println("Enter deadline of project:");
            project.setDeadLine(scanner.next());
            company.addProject(project);
        }
        company.getProject();

        System.out.println("Enter the project name update with budget:"); scanner.nextLine();
        String projectName = scanner.next();
        System.out.println("Enter update budget :");
        company.updateProjectNameByBudget(projectName, scanner.nextDouble());
        company.getProject();

        System.out.println("Enter the project name to update team size: "); scanner.nextLine();
        String projectName1 = scanner.next();
        System.out.println("Enter update teamSize:");
        company.updateProjectTeamSizeByProjectName(projectName1, scanner.nextInt());
        company.getProject();

        System.out.println("Enter the project id to update dead line:"); scanner.nextLine();
        int projectId = scanner.nextInt();
        System.out.println("Enter update project dead line: ");
        company.updateProjectDeadlineByProjectId(projectId, scanner.next());
        company.getProject();

        System.out.println("Enter the project name to update project manager:"); scanner.nextLine();
        String projectName2 = scanner.next();
        System.out.println("Enter update project manager:");
        company.updateProjectManagerByProjectName(projectName2, scanner.next());
        company.getProject();

        System.out.println("Enter project id to fetch the project name:"); scanner.nextLine();
        String projectId1 = company.getProjectNameById(scanner.nextInt());
        System.out.println(projectId1);

        System.out.println("Enter domain name to fetch the project manager:"); scanner.nextLine();
        String domain =company.getProjectManagerByDomain(Domain.valueOf(scanner.next()));
        System.out.println(domain);

        System.out.println("Enter project name to fetch client name:"); scanner.nextLine();
        String projectName3 = company.getClientNameByProjectName(scanner.next());
        System.out.println(projectName3);

        System.out.println(("Enter project id to fetch project budget:")); scanner.nextLine();
        double projectId2 = company.getBudgetByProjectId(scanner.nextInt());
        System.out.println(projectId2);

        System.out.println("Enter project name to fetch project dade line:"); scanner.nextLine();
        String projectName4 = company.getDadeLineByProjectName(scanner.next());
        System.out.println(projectName4);

        System.out.println("Enter project id to fetch project team size:"); scanner.nextLine();
        int projectId3 = company.getTeamSizeByProjectId(scanner.nextInt());
        System.out.println(projectId3);


        /*Project project = new Project();
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
        }*/
        /*Project project1 = new Project();
        project1.setProjectId(1001);
        project1.setProjectName("E-Commerce WebApp");
        project1.setClientName("Flipkart");
        project1.setDomain("Retail");
        project1.setTeamSize(12);
        project1.setProjectManager("Anjali");
        project1.setBudget(2500000.00);
        project1.setDeadLine("30-12-2025");

        Project project2 = new Project();
        project2.setProjectId(1002);
        project2.setProjectName("Banking Mobile App");
        project2.setClientName("HDFC Bank");
        project2.setDomain("Banking");
        project2.setTeamSize(15);
        project2.setProjectManager("Ramesh");
        project2.setBudget(4000000.00);
        project2.setDeadLine("15-11-2025");

        Project project3 = new Project();
        project3.setProjectId(1003);
        project3.setProjectName("Healthcare Portal");
        project3.setClientName("Apollo Hospitals");
        project3.setDomain("Healthcare");
        project3.setTeamSize(10);
        project3.setProjectManager("Priya");
        project3.setBudget(1800000.00);
        project3.setDeadLine("20-09-2025");

        Project project4 = new Project();
        project4.setProjectId(1004);
        project4.setProjectName("Travel Booking System");
        project4.setClientName("MakeMyTrip");
        project4.setDomain("Travel");
        project4.setTeamSize(14);
        project4.setProjectManager("Suresh");
        project4.setBudget(3000000.00);
        project4.setDeadLine("10-01-2026");

        Project project5 = new Project();
        project5.setProjectId(1005);
        project5.setProjectName("Food Delivery App");
        project5.setClientName("Zomato");
        project5.setDomain("FoodTech");
        project5.setTeamSize(11);
        project5.setProjectManager("Deepa");
        project5.setBudget(2200000.00);
        project5.setDeadLine("05-08-2025");

        Project project6 = new Project();
        project6.setProjectId(1006);
        project6.setProjectName("Online Learning Platform");
        project6.setClientName("Byju's");
        project6.setDomain("EdTech");
        project6.setTeamSize(16);
        project6.setProjectManager("Karthik");
        project6.setBudget(5000000.00);
        project6.setDeadLine("12-12-2025");

        Project project7 = new Project();
        project7.setProjectId(1007);
        project7.setProjectName("Digital Wallet");
        project7.setClientName("Paytm");
        project7.setDomain("Finance");
        project7.setTeamSize(13);
        project7.setProjectManager("Shweta");
        project7.setBudget(3500000.00);
        project7.setDeadLine("25-07-2025");

        Project project8 = new Project();
        project8.setProjectId(1008);
        project8.setProjectName("Streaming Service");
        project8.setClientName("Hotstar");
        project8.setDomain("Entertainment");
        project8.setTeamSize(18);
        project8.setProjectManager("Vinay");
        project8.setBudget(6000000.00);
        project8.setDeadLine("19-02-2026");

        Project project9 = new Project();
        project9.setProjectId(1009);
        project9.setProjectName("Smart Home IoT");
        project9.setClientName("LG Electronics");
        project9.setDomain("IoT");
        project9.setTeamSize(9);
        project9.setProjectManager("Harini");
        project9.setBudget(2700000.00);
        project9.setDeadLine("30-06-2025");

        Project project10 = new Project();
        project10.setProjectId(1010);
        project10.setProjectName("Insurance Claim System");
        project10.setClientName("LIC");
        project10.setDomain("Insurance");
        project10.setTeamSize(14);
        project10.setProjectManager("Rajesh");
        project10.setBudget(3200000.00);
        project10.setDeadLine("18-03-2026");

        Project project11 = new Project();
        project11.setProjectId(1011);
        project11.setProjectName("Logistics Tracker");
        project11.setClientName("DHL");
        project11.setDomain("Logistics");
        project11.setTeamSize(12);
        project11.setProjectManager("Meena");
        project11.setBudget(2800000.00);
        project11.setDeadLine("14-04-2026");

        Project project12 = new Project();
        project12.setProjectId(1012);
        project12.setProjectName("Social Media Platform");
        project12.setClientName("Meta");
        project12.setDomain("Social Networking");
        project12.setTeamSize(20);
        project12.setProjectManager("Arjun");
        project12.setBudget(7000000.00);
        project12.setDeadLine("01-01-2026");

        Project project13 = new Project();
        project13.setProjectId(1013);
        project13.setProjectName("Fitness Tracker App");
        project13.setClientName("CureFit");
        project13.setDomain("Fitness");
        project13.setTeamSize(8);
        project13.setProjectManager("Divya");
        project13.setBudget(1500000.00);
        project13.setDeadLine("20-10-2025");

        Project project14 = new Project();
        project14.setProjectId(1014);
        project14.setProjectName("Ride Sharing Platform");
        project14.setClientName("Ola Cabs");
        project14.setDomain("Transport");
        project14.setTeamSize(17);
        project14.setProjectManager("Naveen");
        project14.setBudget(4500000.00);
        project14.setDeadLine("09-09-2025");

        Project project15 = new Project();
        project15.setProjectId(1015);
        project15.setProjectName("Stock Trading App");
        project15.setClientName("Zerodha");
        project15.setDomain("Finance");
        project15.setTeamSize(11);
        project15.setProjectManager("Sneha");
        project15.setBudget(2400000.00);
        project15.setDeadLine("25-12-2025");

        Project project16 = new Project();
        project16.setProjectId(1016);
        project16.setProjectName("Music Streaming Platform");
        project16.setClientName("Spotify");
        project16.setDomain("Entertainment");
        project16.setTeamSize(19);
        project16.setProjectManager("Abhishek");
        project16.setBudget(5500000.00);
        project16.setDeadLine("16-06-2026");

        Project project17 = new Project();
        project17.setProjectId(1017);
        project17.setProjectName("Cloud Storage System");
        project17.setClientName("Google Drive");
        project17.setDomain("Cloud");
        project17.setTeamSize(15);
        project17.setProjectManager("Latha");
        project17.setBudget(5000000.00);
        project17.setDeadLine("08-05-2026");

        Project project18 = new Project();
        project18.setProjectId(1018);
        project18.setProjectName("Job Portal");
        project18.setClientName("Naukri.com");
        project18.setDomain("Recruitment");
        project18.setTeamSize(10);
        project18.setProjectManager("Sanjay");
        project18.setBudget(2000000.00);
        project18.setDeadLine("27-07-2025");

        Project project19 = new Project();
        project19.setProjectId(1019);
        project19.setProjectName("Gaming App");
        project19.setClientName("EA Sports");
        project19.setDomain("Gaming");
        project19.setTeamSize(22);
        project19.setProjectManager("Harsha");
        project19.setBudget(8000000.00);
        project19.setDeadLine("14-11-2026");

        Project project20 = new Project();
        project20.setProjectId(1020);
        project20.setProjectName("News Aggregator");
        project20.setClientName("Times of India");
        project20.setDomain("Media");
        project20.setTeamSize(12);
        project20.setProjectManager("Kavya");
        project20.setBudget(2600000.00);
        project20.setDeadLine("05-04-2026");

        Company company = new Company();
        company.addProject(project1);
        company.addProject(project2);
        company.addProject(project3);
        company.addProject(project4);
        company.addProject(project5);
        company.addProject(project6);
        company.addProject(project7);
        company.addProject(project8);
        company.addProject(project9);
        company.addProject(project10);
        company.addProject(project11);
        company.addProject(project12);
        company.addProject(project13);
        company.addProject(project14);
        company.addProject(project15);
        company.addProject(project16);
        company.addProject(project17);
        company.addProject(project18);
        company.addProject(project19);
        company.addProject(project20);
        company.getProject();*/


    }
}
