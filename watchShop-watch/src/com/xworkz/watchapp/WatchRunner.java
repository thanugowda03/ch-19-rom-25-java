package com.xworkz.watchapp;

import com.xworkz.watchapp.shop.ShopDetails;
import com.xworkz.watchapp.watch.Watch;


public class WatchRunner {

    public static void main(String[] args) {

        System.out.println("main started");
        ShopDetails shopDetails1 = new ShopDetails();
        shopDetails1.setShopId(1);
        shopDetails1.setShopName("TimeZone Watches");
        shopDetails1.setLocation("Bhadravathi");
        shopDetails1.setOwerName("Rajesh");
        shopDetails1.setNumberOfBrands(15);

        ShopDetails shopDetails2 = new ShopDetails();
        shopDetails2.setShopId(1);
        shopDetails2.setShopName("TimeZone Watches");
        shopDetails2.setLocation("Bhadravathi");
        shopDetails2.setOwerName("Rajesh");
        shopDetails2.setNumberOfBrands(15);

        ShopDetails shopDetails3 = new ShopDetails();
        shopDetails3.setShopId(1);
        shopDetails3.setShopName("TimeZone Watches");
        shopDetails3.setLocation("Bhadravathi");
        shopDetails3.setOwerName("Rajesh");
        shopDetails3.setNumberOfBrands(15);

        ShopDetails shopDetails4 = new ShopDetails();
        shopDetails4.setShopId(1);
        shopDetails4.setShopName("TimeZone Watches");
        shopDetails4.setLocation("Bhadravathi");
        shopDetails4.setOwerName("Rajesh");
        shopDetails4.setNumberOfBrands(15);

        ShopDetails shopDetails5 = new ShopDetails();
        shopDetails5.setShopId(1);
        shopDetails5.setShopName("TimeZone Watches");
        shopDetails5.setLocation("Bhadravathi");
        shopDetails5.setOwerName("Rajesh");
        shopDetails5.setNumberOfBrands(15);

        ShopDetails shopDetails6 = new ShopDetails();
        shopDetails6.setShopId(1);
        shopDetails6.setShopName("TimeZone Watches");
        shopDetails6.setLocation("Bhadravathi");
        shopDetails6.setOwerName("Rajesh");
        shopDetails6.setNumberOfBrands(15);

        ShopDetails shopDetails7 = new ShopDetails();
        shopDetails7.setShopId(1);
        shopDetails7.setShopName("TimeZone Watches");
        shopDetails7.setLocation("Bhadravathi");
        shopDetails7.setOwerName("Rajesh");
        shopDetails7.setNumberOfBrands(15);

        ShopDetails shopDetails8 = new ShopDetails();
        shopDetails8.setShopId(1);
        shopDetails8.setShopName("TimeZone Watches");
        shopDetails8.setLocation("Bhadravathi");
        shopDetails8.setOwerName("Rajesh");
        shopDetails8.setNumberOfBrands(15);

        ShopDetails shopDetails9 = new ShopDetails();
        shopDetails9.setShopId(1);
        shopDetails9.setShopName("TimeZone Watches");
        shopDetails9.setLocation("Bhadravathi");
        shopDetails9.setOwerName("Rajesh");
        shopDetails9.setNumberOfBrands(15);

       Watch watch=new Watch();
        watch.addWatch(shopDetails1);
        watch.addWatch(shopDetails2);
        watch.addWatch(shopDetails3);
        watch.addWatch(shopDetails4);
        watch.addWatch(shopDetails5);
        watch.addWatch(shopDetails6);
        watch.addWatch(shopDetails7);
        watch.addWatch(shopDetails8);
        watch.addWatch(shopDetails9);

        watch.getShopInfo();

    }
}
       /* shopDetails.setContactNumber("9591268523");
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
}*/
