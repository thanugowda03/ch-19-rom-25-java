package com.xworkz.abstractionapp.charger;

import com.xworkz.abstractionapp.charger.impl.CTypeImpl;

public class ChargerRunner {
    public static void main(String[] args) {
        Charger charger=new CTypeImpl();
        charger.type();
        charger.color();
        charger.price();
    }
}
