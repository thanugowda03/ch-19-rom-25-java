package com.xworkz.policestationapp.police;

import com.xworkz.policestationapp.station.Station;
import com.xworkz.policestationapp.validator.StationValidator;

public class Police {

    Station[] stations = new Station[6];
    int index;

    public boolean addStation(Station station){
        boolean isStationAdded = false;
        if (station != null){
            stations[index++]=station;
            isStationAdded = true;
        }
        else {
            System.out.println("Invalid station");
        }
        return isStationAdded;
    }

    public void getStation(){
        System.out.println("List of Stations : "+stations.length);
        for (Station station : stations){
            System.out.println("Station ID: "+station.getStationId());
            System.out.println("Station name: "+station.getStationName());
            System.out.println("Station location: "+station.getLocation());
            System.out.println("Station contact number: "+station.getContactNumber());
            System.out.println("Station number of officers: "+station.getNumberOfOfficers());
            System.out.println("Station in charge name: "+station.getInChargeName());
            System.out.println("Station established year: "+station.getYearEstablished());
            System.out.println("");
        }
    }

   /* Station station;
    public boolean addStation(Station station){
        boolean isStationAdded = false;
        boolean isStationInfoValid = false;

        StationValidator stationValidator = new StationValidator();
        isStationInfoValid = stationValidator.validateStationInfo(station);

        if(isStationInfoValid){
            this.station = station;
            isStationAdded = true;
        }
        return isStationAdded;
    }
    public void getStationInfo(){
        System.out.println("Station ID: "+station.getStationId());
        System.out.println("Station name: "+station.getStationName());
        System.out.println("Station location: "+station.getLocation());
        System.out.println("Station contact number: "+station.getContactNumber());
        System.out.println("Station number of officers: "+station.getNumberOfOfficers());
        System.out.println("Station in charge name: "+station.getInChargeName());
        System.out.println("Station established year: "+station.getYearEstablished());
    }*/
}
