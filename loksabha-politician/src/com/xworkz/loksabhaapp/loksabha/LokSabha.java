package com.xworkz.loksabhaapp.loksabha;

import com.xworkz.loksabhaapp.politician.Politician;

public interface LokSabha {

    boolean addPolitician(Politician politician);

    boolean updatePartyNameByPoliticianName(String politicianName,String updatePartyName);

    boolean updateConstituencyByPoliticianId(int politicianId,String updateConstituency);

    boolean updateAgeByPoliticianId(int politicianId1, int updateAge);

    boolean updateContactNumberByPoliticianName(String name, String updateContactNumber);

    String getPoliticianNameByPoliticianId(int politicianId);

    int getAgeByPoliticianName(String politicianName3);

    String getContactNumberByPoliticianId(int politicianId2);

    String getStateByPoliticianName(String name1);

    void getPolitician();
}
