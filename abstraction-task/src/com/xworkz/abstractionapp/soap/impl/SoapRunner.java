package com.xworkz.abstractionapp.soap.impl;

import com.xworkz.abstractionapp.soap.Soap;

public class SoapRunner {
    public static void main(String[] args) {
        Soap soap=new LuxImpl();
        soap.soapColor();
        soap.price();
        soap.price();
    }
}
