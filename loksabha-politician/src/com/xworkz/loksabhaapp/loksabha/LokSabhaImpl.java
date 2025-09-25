package com.xworkz.loksabhaapp.loksabha;

import com.xworkz.loksabhaapp.exception.*;
import com.xworkz.loksabhaapp.politician.Politician;

public class LokSabhaImpl implements LokSabha {

    public LokSabhaImpl(int size){
        politicians = new Politician[size];
    }

    Politician[] politicians ;
    int index;

    @Override
    public boolean addPolitician(Politician politician){
        boolean isPoliticianAdded = false;
        try {
            if (politician != null) {
                politicians[index++] = politician;
                isPoliticianAdded = true;
            } else {
                throw new AddPoliticianNotFoundException("Invalid Update");
            }
        }catch (AddPoliticianNotFoundException e){
            e.printStackTrace();
        }
        return isPoliticianAdded;
    }

@Override
    public boolean updatePartyNameByPoliticianName(String politicianName,String updatePartyName){
        boolean partyNameUpdate = false;
        try{
        for (Politician politician:this.politicians) {
            if (politician.getName().equals(politicianName)) {
                politician.setPartyName(updatePartyName);
                System.out.println("Update Party name");
                partyNameUpdate = true;
            } else {
                throw new UpdatePartyNameByPoliticianNameNotFoundException("Inavalid update");
            }
        }
        }catch (UpdatePartyNameByPoliticianNameNotFoundException e){
            e.printStackTrace();
        }
        return partyNameUpdate;
    }

@Override
    public boolean updateConstituencyByPoliticianId(int politicianId,String updateConstituency){
        boolean constituencyUpdate = false;
        try{
        for (Politician politician:this.politicians){
            if (politician.getPoliticianId()==politicianId){
                politician.setConstituency(updateConstituency);
                System.out.println("Update Constituency");
                constituencyUpdate = true;
            }else {
                throw new UpdateConstituencyByPoliticianIdNotFoundException("Invalid Update");
            }
        }
        }catch (UpdateConstituencyByPoliticianIdNotFoundException e){
            e.printStackTrace();
        }
        return constituencyUpdate;
    }

@Override
    public boolean updateAgeByPoliticianId(int politicianId1, int updateAge){
        boolean ageUpdate = false;
        try {
            for (Politician politician : this.politicians) {
                if (politician.getPoliticianId() == politicianId1) {
                    politician.setAge(updateAge);
                    System.out.println("Update Age");
                    ageUpdate = true;
                } else {
                    throw new UpdateAgeByPoliticianIdNotFoundException("Invalid update");
                }
            }
        }catch (UpdateAgeByPoliticianIdNotFoundException e) {
            e.printStackTrace();
        }
                return ageUpdate;
    }



@Override
    public boolean updateContactNumberByPoliticianName(String name, String updateContactNumber){
        boolean contactNumberUpdate = false;
        try {
            for (Politician politician : this.politicians) {
                if (politician.getName().equals(name)) {
                    politician.setContactNumber(updateContactNumber);
                    System.out.println("Update contact number");
                    contactNumberUpdate = true;
                } else {
                    throw new UpdateContactNumberByPoliticianNameNotFoundException("Invalid Update");
                }
            }
        }catch (UpdateContactNumberByPoliticianNameNotFoundException e){
            e.printStackTrace();
        }
        return contactNumberUpdate;
    }


@Override
    public String getPoliticianNameByPoliticianId(int politicianId){
        String name = null;
        try {
            for (Politician politician : this.politicians) {
                if (politician.getPoliticianId() == politicianId) {
                    return politician.getName();
                } else {
                    throw new GetPoliticianNameByPoliticianIdNotFoundException("Invalid Update");
                }
            }
        }catch (GetPoliticianNameByPoliticianIdNotFoundException e){
            e.printStackTrace();
        }
        return name;
    }


@Override
    public int getAgeByPoliticianName(String politicianName3){
    int age = 0;
         try {
             for (Politician politician : this.politicians) {
                 if (politician.getName().equals(politicianName3)) {
                     return politician.getAge();
                 } else {
                     throw new GetAgeByPoliticianNameNotFoundException("Invalid get operation");
                 }
             }
         }catch (GetAgeByPoliticianNameNotFoundException e){
             e.printStackTrace();
         }
        return age;
    }


@Override
    public String getContactNumberByPoliticianId(int politicianId2){
        String contactNumber = null;
        try {
            for (Politician politician : this.politicians) {
                if (politician.getPoliticianId() == politicianId2) {
                    return politician.getContactNumber();
                } else {
                    throw new GetContactNumberByPoliticianIdNotFoundException("Invalid get operation");
                }
            }
        }catch (GetContactNumberByPoliticianIdNotFoundException e){
            e.printStackTrace();
        }
        return contactNumber;
    }


@Override
    public String getStateByPoliticianName(String name1){
        String state = null;
         try {
             for (Politician politician : this.politicians) {
                 if (politician.getName().equals(name1)) {
                     return politician.getState();
                 } else {
                     throw new GetStateByPoliticianNameNotFoundException("Invalid get operation");
                 }
             }
         }catch (GetStateByPoliticianNameNotFoundException e){
             e.printStackTrace();
         }
        return state;
    }

@Override
    public void getPolitician(){
        System.out.println("List of politicians: "+politicians.length);
        for (Politician politician:politicians){
            System.out.println("Politician ID: " + politician.getPoliticianId());
            System.out.println("Politician Name: " + politician.getName());
            System.out.println("Party Name: " + politician.getPartyName());
            System.out.println("Constituency: " + politician.getConstituency());
            System.out.println("Age: " + politician.getAge());
            System.out.println("State: " + politician.getState());
            System.out.println("Contact Number: " + politician.getContactNumber());
            System.out.println("");
        }
    }

    /*Politician politician;

    public boolean addPoliticianDetails(Politician politician) {
        boolean isAdded = false;
        boolean isInfoValid = false;

        PoliticianValidator validator = new PoliticianValidator();
        isInfoValid = validator.validatePoliticianInfo(politician);

        if (isInfoValid) {
            this.politician = politician;
            isAdded = true;
        }
        return isAdded;
    }

    public void getPoliticianInfo() {
        System.out.println("Politician ID: " + politician.getPoliticianId());
        System.out.println("Politician Name: " + politician.getName());
        System.out.println("Party Name: " + politician.getPartyName());
        System.out.println("Constituency: " + politician.getConstituency());
        System.out.println("Age: " + politician.getAge());
        System.out.println("State: " + politician.getState());
        System.out.println("Contact Number: " + politician.getContactNumber());
    }*/
}


