package com.xworkz.companydetails.c;

import com.xworkz.companydetails.company.Company;

public class CompanyRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Company company=new Company();
        company.setCompanyName("Infosys");
        company.setIndustryType("IT");
        company.setFounderYear("1998");
        company.setNoOfEmployees(125);
        company.setRevenue("42,273crore");

        String companyName= company.getCompanyName();
        String industryType=company.getIndustryType();
        String founderYear=company.getFounderYear();
        int noOfEmployees=company.getNoOfEmployees();
        String revenue=company.getRevenue();

        System.out.println("Company Name "+companyName);
        System.out.println("Industry type "+industryType);
        System.out.println("Founder year "+founderYear);
        System.out.println("No of employees "+noOfEmployees);
        System.out.println("Revenue "+revenue);
        System.out.println("main ended");
    }
}
