package com.xworkz.abstractionapp.curd;

import com.xworkz.abstractionapp.curd.impl.NandiniImpl;

public class CurdRunner {
    public static void main(String[] args) {
        CurdPacket curd=new NandiniImpl();
        curd.brand();
        curd.price();
        curd.expDate();
    }
}
