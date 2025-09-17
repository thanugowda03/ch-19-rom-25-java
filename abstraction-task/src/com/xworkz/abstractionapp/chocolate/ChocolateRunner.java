package com.xworkz.abstractionapp.chocolate;

import com.xworkz.abstractionapp.chocolate.impl.MilkyBarImpl;

public class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate chocolate=new MilkyBarImpl();
        chocolate.chocolateName();
        chocolate.price();
        chocolate.flavour();
    }
}
