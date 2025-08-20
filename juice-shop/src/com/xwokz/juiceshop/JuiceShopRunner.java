package com.xwokz.juiceshop;

import com.xwokz.juiceshop.juice.JuiceShop;

public class JuiceShopRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        JuiceShop juiceShop=new JuiceShop();
        juiceShop.setJuiceShopName("Varsha juice center");
        juiceShop.setLocation("Sullia");
        juiceShop.setOwnerName("Ram");
        juiceShop.setPhNumber(9483526695l);

        String juiceShopName=juiceShop.getJuiceShopName();
        String location=juiceShop.getLocation();
        String ownerName=juiceShop.getOwnerName();
        long phNumber=juiceShop.getPhNumber();

        System.out.println("Juice Shop Name "+juiceShopName);
        System.out.println("Juice shop loction "+location);
        System.out.println("Owner name is "+ownerName);
        System.out.println("Phone number "+phNumber);
        System.out.println("main ended");
    }
}
