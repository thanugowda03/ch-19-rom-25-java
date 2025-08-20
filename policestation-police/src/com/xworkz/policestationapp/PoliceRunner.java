package com.xworkz.policestationapp;

import com.xworkz.policestationapp.police.Police;
import com.xworkz.policestationapp.station.Station;

public class PoliceRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        Station station = new Station();
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
    }
}
