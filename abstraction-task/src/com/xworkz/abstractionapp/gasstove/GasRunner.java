package com.xworkz.abstractionapp.gasstove;

import com.xworkz.abstractionapp.gasstove.impl.PreethiStoveImpl;

public class GasRunner {
    public static void main(String[] args) {
        GasStove gas=new PreethiStoveImpl();
        gas.On();
        gas.Off();
        gas.price();
    }
}
