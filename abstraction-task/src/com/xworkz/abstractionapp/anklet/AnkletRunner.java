package com.xworkz.abstractionapp.anklet;

import com.xworkz.abstractionapp.anklet.impl.SilverAnkletImpl;

public class AnkletRunner {
    public static void main(String[] args) {
        Anklet anklet=new SilverAnkletImpl();
        anklet.materialType();
        anklet.price();
        anklet.weight();
    }
}
