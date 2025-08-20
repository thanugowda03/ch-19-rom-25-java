package com.xworkz.mobileinfo;

import com.xworkz.mobileinfo.mobile.Mobile;

public class MobileRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Mobile mobile=new Mobile();
        mobile.setMobileId(1);
        mobile.setBrand("Vivo");
        mobile.setSpecialFeature("Camera Quality,Storage capacity");
        mobile.setStorage("256GB");

        int mobileId=mobile.getMobileId();
        String brand=mobile.getBrand();
        String specialFeature=mobile.getSpecialFeature();
        String storage=mobile.setStorage();

        System.out.println("Mobile Id "+mobileId);
        System.out.println("Mobile brand "+brand);
        System.out.println("Special Features "+specialFeature);
        System.out.println("Storage capacity "+storage);
        System.out.println("main ended");
    }
}
