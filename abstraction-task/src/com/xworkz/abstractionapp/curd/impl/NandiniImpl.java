package com.xworkz.abstractionapp.curd.impl;

import com.xworkz.abstractionapp.curd.CurdPacket;

public class NandiniImpl implements CurdPacket {

    @Override
    public void brand() {
        System.out.println("Brand is Nandini");
    }

    @Override
    public void price() {
        System.out.println("Price is 26Rs/500ml");

    }

    @Override
    public void expDate() {
        System.out.println("Expire Date is 18/09/2025");

    }
}
