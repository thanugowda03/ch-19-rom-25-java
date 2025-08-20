package com.xworkz.policestationapp.validator;

import com.xworkz.policestationapp.station.Station;

public class StationValidator {

    Station station;
    public boolean validateStationInfo(Station station){
        boolean stationValidate = false;
        boolean stationIdValid = false;
        boolean stationNameValid = false;
        boolean locationValid = false;
        boolean contactNumberValid = false;
        boolean numberOfOfficersValid = false;
        boolean inChargeNameValid = false;
        boolean yearEstablishedValid = false;

        if (station.getStationId() > 0){
            stationIdValid = true;
        }
        else {
            System.out.println("Station id is not valid");
        }
        if (station.getStationName() != null && !station.getStationName().isEmpty()){
            stationNameValid = true;
        }
        else {
            System.out.println("Station name is empty/null");
        }
        if (station.getLocation() != null && !station.getLocation().isEmpty()){
            locationValid  = true;
        }
        else {
            System.out.println("Station location is empty/null");
        }
        if (station.getContactNumber() != null && !station.getContactNumber().isEmpty()){
            contactNumberValid = true;
        }
        else {
            System.out.println("Station contact number is empty/null");
        }
        if (station.getNumberOfOfficers() > 0){
            numberOfOfficersValid = true;
        }
        else {
            System.out.println("number of officers is not valid");
        }
        if (station.getInChargeName() != null && !station.getInChargeName().isEmpty()){
            inChargeNameValid = true;
        }
        else {
            System.out.println("station In charge name is empty/null");
        }
        if (station.getYearEstablished() > 0){
            yearEstablishedValid = true;
        }
        else {
            System.out.println("Station established year is not valid");
        }
        if (stationIdValid && stationNameValid && locationValid && contactNumberValid && numberOfOfficersValid && inChargeNameValid && yearEstablishedValid){
            stationValidate = true;
        }
        return stationValidate;
    }
}
