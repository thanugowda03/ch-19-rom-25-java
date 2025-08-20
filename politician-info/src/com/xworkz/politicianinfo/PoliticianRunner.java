package com.xworkz.politicianinfo;

import com.xworkz.politicianinfo.politician.Politician;

public class PoliticianRunner {

    public static void main(String[] args) {
        System.out.println("main started");
        Politician politician=new Politician();

        politician.setName("Mr. Narendra Modi");
        politician.setDateOfBirth("1967");
        politician.setEducation("Degree");
        politician.setPosition("Prime Minister");
        politician.setPartyAffiliation("BJP");

        String name= politician.getName();
        String dateOfBirth=politician.getDateOfBirth();
        String education= politician.getEducation();
        String position= politician.getPosition();
        String partyAffiliation= politician.getPartyAffiliation();

        System.out.println("Politician Name "+name);
        System.out.println("Date of Birth "+dateOfBirth);
        System.out.println("Education "+education);
        System.out.println("Position "+position);
        System.out.println("Party affiliation "+partyAffiliation);

        System.out.println("main ended");
    }
}
