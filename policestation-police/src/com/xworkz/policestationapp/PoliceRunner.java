package com.xworkz.policestationapp;

import com.xworkz.policestationapp.police.Police;
import com.xworkz.policestationapp.station.Station;

public class PoliceRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        /*Station station = new Station();
        station.setStationId(112);
        station.setStationName("New town police station");
        station.setLocation("Papertown Bhadravathi");
        station.setContactNumber("080-25551289");
        station.setNumberOfOfficers(23);
        station.setInChargeName("Inspector Ravi kumar");
        station.setYearEstablished(1992);

        Police police = new Police();
        boolean stationAdded = police.addStation(station);
        if (stationAdded){
            police.getStationInfo();
        }
        else {
            System.out.println("Application is not valid");
        }
        System.out.println("main ended");
    }*/
        Station station = new Station();
        station.setStationId(1);
        station.setStationName("New town police station");
        station.setLocation("Papertown Bhadravathi");
        station.setContactNumber("080-25551289");
        station.setNumberOfOfficers(23);
        station.setInChargeName("Inspector Ravi kumar");
        station.setYearEstablished(1992);

        Station station1 = new Station();
        station1.setStationId(2);
        station1.setStationName("Old police station");
        station1.setLocation("Bhadravathi");
        station1.setContactNumber("080-25551289");
        station1.setNumberOfOfficers(20);
        station1.setInChargeName("Inspector Harish");
        station1.setYearEstablished(1990);

        Station station2 = new Station();
        station2.setStationId(3);
        station2.setStationName("Old police station");
        station2.setLocation("Shivmogga");
        station2.setContactNumber("9632587412");
        station2.setNumberOfOfficers(25);
        station2.setInChargeName("Inspector Dhanush");
        station2.setYearEstablished(1985);

        Station station3 = new Station();
        station3.setStationId(4);
        station3.setStationName("New police station");
        station3.setLocation("Shivmogga new Town");
        station3.setContactNumber("8794563120");
        station3.setNumberOfOfficers(30);
        station3.setInChargeName("Inspector Ramesh");
        station3.setYearEstablished(1985);

        Station station4 = new Station();
        station4.setStationId(5);
        station4.setStationName("Police station");
        station4.setLocation("Basveshwar nagar ");
        station4.setContactNumber("7894563214");
        station4.setNumberOfOfficers(15);
        station4.setInChargeName("Inspector Ganesh");
        station4.setYearEstablished(1995);

        Station station5 = new Station();
        station5.setStationId(6);
        station5.setStationName("Police station");
        station5.setLocation("Rajaji nagar ");
        station5.setContactNumber("7894563214");
        station5.setNumberOfOfficers(15);
        station5.setInChargeName("Inspector Ganesh");
        station5.setYearEstablished(1995);

        Police police = new Police();
        police.addStation(station);
        police.addStation(station1);
        police.addStation(station2);
        police.addStation(station3);
        police.addStation(station4);
        police.addStation(station5);
        police.getStation();


    }

    }
