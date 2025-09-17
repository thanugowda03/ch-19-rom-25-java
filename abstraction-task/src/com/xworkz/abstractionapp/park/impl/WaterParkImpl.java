package com.xworkz.abstractionapp.park.impl;

import com.xworkz.abstractionapp.park.Park;

public class WaterParkImpl implements Park {
    @Override
    public void name() {
        System.out.println("Water park name is Wonderlla");
    }

    @Override
    public void entryFee() {
        System.out.println("Entry fees is 400Rs");

    }

    @Override
    public void openings() {
        System.out.println("Openings from 7.30am-10pm");

    }
}
