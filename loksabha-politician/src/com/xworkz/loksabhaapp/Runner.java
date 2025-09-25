package com.xworkz.loksabhaapp;

import com.xworkz.loksabhaapp.loksabha.LokSabha;
import com.xworkz.loksabhaapp.loksabha.LokSabhaImpl;
import com.xworkz.loksabhaapp.politician.Politician;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no politicians:");
        int size = scanner.nextInt();

        LokSabhaImpl lokSabha = new LokSabhaImpl(size);
        for (int i=0; i<size; i++){
            Politician politician = new Politician();
            System.out.println("Enter politicianId:");
            politician.setPoliticianId(scanner.nextInt());
            System.out.println("Enter PoliticianName:");
            politician.setName(scanner.next());
            System.out.println("Enter PartyName:");
            politician.setPartyName(scanner.next());
            System.out.println("Enter constituency:");
            politician.setConstituency(scanner.next());
            System.out.println("Enter age:");
            politician.setAge(scanner.nextInt());
            System.out.println("Enter state:");
            politician.setState(scanner.next());
            System.out.println("Enter contactNumber:");
            politician.setContactNumber(scanner.next());
            lokSabha.addPolitician(politician);
        }
        lokSabha.getPolitician();

        System.out.println("Enter the politician name to update party name:");scanner.nextLine();
        String politicianName = scanner.next();
        System.out.println("Enter update party name:");
        lokSabha.updatePartyNameByPoliticianName(politicianName,scanner.next());
        lokSabha.getPolitician();

        System.out.println("Enter the politician Id to update Constituency:"); scanner.nextLine();
        int politicianId = scanner.nextInt();
        System.out.println("Enter Update Constituency:");
        lokSabha.updateConstituencyByPoliticianId(politicianId,scanner.next());
        lokSabha.getPolitician();

        System.out.println("Enter politician id to update politician age:"); scanner.nextLine();
        int politicianId1 = scanner.nextInt();
        System.out.println("Enter update age:");
        lokSabha.updateAgeByPoliticianId(politicianId1, scanner.nextInt());
        lokSabha.getPolitician();

        System.out.println("Enter politician name to update politician contact number:");scanner.nextLine();
        String name = scanner.next();
        System.out.println("Enter update contact number:");
        lokSabha.updateContactNumberByPoliticianName(name, scanner.next());
        lokSabha.getPolitician();

        System.out.println("Enter the politician id fetch the politician name:"); scanner.nextLine();
        String politicianId3 = lokSabha.getPoliticianNameByPoliticianId(scanner.nextInt());
        System.out.println(politicianId3);

        System.out.println("Enter the politician name fetch the politician age:"); scanner.nextLine();
        int politicianName1 = lokSabha.getAgeByPoliticianName(scanner.next());
        System.out.println(politicianName1);

        System.out.println("Enter the politician id fetch the politician contact number:"); scanner.nextLine();
        String politicianId2 = lokSabha.getContactNumberByPoliticianId(scanner.nextInt());
        System.out.println(politicianId2);

        System.out.println("Enter the politician name fetch the politician State:"); scanner.nextLine();
        String name1 = lokSabha.getStateByPoliticianName(scanner.next());
        System.out.println(name1);

        /*Politician politician = new Politician();
        politician.setPoliticianId(101);
        politician.setName("Narendra Modi");
        politician.setPartyName("Bharatiya Janata Party");
        politician.setConstituency("Varanasi");
        politician.setAge(73);
        politician.setState("Uttar Pradesh");
        politician.setContactNumber("9876543210");


        LokSabha lokSabha = new LokSabha();
        boolean isAdded = lokSabha.addPoliticianDetails(politician);

        if (isAdded) {
            lokSabha.getPoliticianInfo();
        } else {
            System.out.println("Politician details are not valid.");
        }

        System.out.println("main ended");*/

        /*Politician p1 = new Politician();
        p1.setPoliticianId(201);
        p1.setName("Siddaramaiah");
        p1.setPartyName("Indian National Congress");
        p1.setConstituency("Varuna");
        p1.setAge(76);
        p1.setState("Karnataka");
        p1.setContactNumber("9845000001");

        Politician p2 = new Politician();
        p2.setPoliticianId(202);
        p2.setName("DK Shivakumar");
        p2.setPartyName("Indian National Congress");
        p2.setConstituency("Kanakapura");
        p2.setAge(62);
        p2.setState("Karnataka");
        p2.setContactNumber("9845000002");

        Politician p3 = new Politician();
        p3.setPoliticianId(203);
        p3.setName("Basavaraj Bommai");
        p3.setPartyName("Bharatiya Janata Party");
        p3.setConstituency("Shiggaon");
        p3.setAge(64);
        p3.setState("Karnataka");
        p3.setContactNumber("9845000003");

        Politician p4 = new Politician();
        p4.setPoliticianId(204);
        p4.setName("BS Yediyurappa");
        p4.setPartyName("Bharatiya Janata Party");
        p4.setConstituency("Shikaripura");
        p4.setAge(81);
        p4.setState("Karnataka");
        p4.setContactNumber("9845000004");

        Politician p5 = new Politician();
        p5.setPoliticianId(205);
        p5.setName("HD Kumaraswamy");
        p5.setPartyName("Janata Dal (Secular)");
        p5.setConstituency("Channapatna");
        p5.setAge(65);
        p5.setState("Karnataka");
        p5.setContactNumber("9845000005");

        Politician p6 = new Politician();
        p6.setPoliticianId(206);
        p6.setName("HD Deve Gowda");
        p6.setPartyName("Janata Dal (Secular)");
        p6.setConstituency("Hassan");
        p6.setAge(91);
        p6.setState("Karnataka");
        p6.setContactNumber("9845000006");

        Politician p7 = new Politician();
        p7.setPoliticianId(207);
        p7.setName("R Ashoka");
        p7.setPartyName("Bharatiya Janata Party");
        p7.setConstituency("Padmanabhanagar");
        p7.setAge(67);
        p7.setState("Karnataka");
        p7.setContactNumber("9845000007");

        Politician p8 = new Politician();
        p8.setPoliticianId(208);
        p8.setName("Suresh Kumar");
        p8.setPartyName("Bharatiya Janata Party");
        p8.setConstituency("Rajajinagar");
        p8.setAge(68);
        p8.setState("Karnataka");
        p8.setContactNumber("9845000008");

        Politician p9 = new Politician();
        p9.setPoliticianId(209);
        p9.setName("Priyank Kharge");
        p9.setPartyName("Indian National Congress");
        p9.setConstituency("Chittapur");
        p9.setAge(45);
        p9.setState("Karnataka");
        p9.setContactNumber("9845000009");

        Politician p10 = new Politician();
        p10.setPoliticianId(210);
        p10.setName("UT Khader");
        p10.setPartyName("Indian National Congress");
        p10.setConstituency("Mangaluru");
        p10.setAge(54);
        p10.setState("Karnataka");
        p10.setContactNumber("9845000010");

        Politician p11 = new Politician();
        p11.setPoliticianId(211);
        p11.setName("KJ George");
        p11.setPartyName("Indian National Congress");
        p11.setConstituency("Sarvagnanagar");
        p11.setAge(74);
        p11.setState("Karnataka");
        p11.setContactNumber("9845000011");

        Politician p12 = new Politician();
        p12.setPoliticianId(212);
        p12.setName("BY Vijayendra");
        p12.setPartyName("Bharatiya Janata Party");
        p12.setConstituency("Shikaripura");
        p12.setAge(48);
        p12.setState("Karnataka");
        p12.setContactNumber("9845000012");

        LokSabha lokSabha = new LokSabha();
        lokSabha.addPolitician(p1);
        lokSabha.addPolitician(p2);
        lokSabha.addPolitician(p3);
        lokSabha.addPolitician(p4);
        lokSabha.addPolitician(p5);
        lokSabha.addPolitician(p6);
        lokSabha.addPolitician(p7);
        lokSabha.addPolitician(p8);
        lokSabha.addPolitician(p9);
        lokSabha.addPolitician(p10);
        lokSabha.addPolitician(p11);
        lokSabha.addPolitician(p12);
        lokSabha.getPolitician();*/
    }
}

