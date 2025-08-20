package com.xworkz.watchapp;

import com.xworkz.watchapp.shop.ShopDetails;
import com.xworkz.watchapp.watch.Watch;


public class WatchRunner {

    public static void main(String[] args) {

        System.out.println("main started");
        ShopDetails shopDetails = new ShopDetails();
        shopDetails.setShopId(1);
        shopDetails.setShopName("TimeZone Watches");
        shopDetails.setLocation("Bhadravathi");
        shopDetails.setOwerName("Rajesh");
        shopDetails.setNumberOfBrands(15);
        shopDetails.setContactNumber("9591268523");
        shopDetails.setOpeningTime("9.30 am");
        shopDetails.setClosingTime("9.30 pm");

        Watch watch = new Watch();
        boolean shopAdded = watch.addShopDetails(shopDetails);
        if (shopAdded){
            watch.getShopInfo();
        }
        else {
            System.out.println("Application is mot valid");
        }
    }
}
