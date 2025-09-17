package com.xworkz.abstractionapp.cellphone;

import com.xworkz.abstractionapp.cellphone.impl.VivoImpl;

public class CellPhoneRunner {
    public static void main(String[] args) {
        CellPhone phone=new VivoImpl();
        phone.brand();
        phone.color();
        phone.price();

    }
}
