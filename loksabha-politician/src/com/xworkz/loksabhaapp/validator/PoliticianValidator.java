package com.xworkz.loksabhaapp.validator;

import com.xworkz.loksabhaapp.politician.Politician;

public class PoliticianValidator {

    Politician politician;

    public boolean validatePoliticianInfo(Politician politician) {
        boolean isValid = false;

        boolean idValid = false;
        boolean nameValid = false;
        boolean partyNameValid = false;
        boolean constituencyValid = false;
        boolean ageValid = false;
        boolean stateValid = false;
        boolean contactNumberValid = false;

        if (politician.getPoliticianId() > 0) {
            idValid = true;
        } else {
            System.out.println("Politician ID is not valid");
        }

        if (politician.getName() != null && !politician.getName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("Politician name is empty/null");
        }

        if (politician.getPartyName() != null && !politician.getPartyName().isEmpty()) {
            partyNameValid = true;
        } else {
            System.out.println("Party name is empty/null");
        }

        if (politician.getConstituency() != null && !politician.getConstituency().isEmpty()) {
            constituencyValid = true;
        } else {
            System.out.println("Constituency is empty/null");
        }

        if (politician.getAge() > 25) { // minimum 25 years
            ageValid = true;
        } else {
            System.out.println("Age is not valid (should be greater than 25)");
        }

        if (politician.getState() != null && !politician.getState().isEmpty()) {
            stateValid = true;
        } else {
            System.out.println("State is empty/null");
        }

        if (politician.getContactNumber() != null && politician.getContactNumber().length() == 10) {
            contactNumberValid = true;
        } else {
            System.out.println("Contact number is not valid (must be 10 digits)");
        }

        if (idValid && nameValid && partyNameValid && constituencyValid && ageValid && stateValid && contactNumberValid) {
            isValid = true;
        }

        return isValid;
    }
}

