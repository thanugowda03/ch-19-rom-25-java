package com.xworkz.shoppingapp.mall;

import com.xworkz.shoppingapp.shop.Shop;
import com.xworkz.shoppingapp.validator.ShopValidator;

public class Mall {

    Shop[] shops = new Shop[13];
    int index;

    public boolean addShopDetails(Shop shop){
        boolean isShopAdded = false;
        if (shop != null){
            shops[index++]=shop;
            isShopAdded = true;
        }
        else {
            System.out.println("Invalid Shops");
        }
        return isShopAdded;
    }

    public void getShop(){
        System.out.println("List of shops: "+shops.length);
        for (Shop shop : shops){
            System.out.println("Mall Id: " + shop.getMallId());
            System.out.println("Mall Name: " + shop.getMallName());
            System.out.println("Mall Location: " + shop.getLocation());
            System.out.println("Number of Shops: " + shop.getNumberOfShops());
            System.out.println("Number of Floors: " + shop.getNumberOfFloors());
            System.out.println("Opening Hours: " + shop.getOpeningHours());
            System.out.println("Owner Name: " + shop.getOwnerName());
            System.out.println("");
        }
    }

    /*Shop shop;
    public boolean addMallDetails( Shop shop) {
        boolean isMallAdded = false;
        boolean isMallInfoValid = false;

        ShopValidator shopValidator = new ShopValidator();
        isMallInfoValid = shopValidator.validateShopInfo(shop);

        if (isMallInfoValid) {
            this.shop = shop;
            isMallAdded = true;
        }
        return isMallAdded;
    }


    public void getMallInfo() {
            System.out.println("Mall Id: " + shop.getMallId());
            System.out.println("Mall Name: " + shop.getMallName());
            System.out.println("Mall Location: " + shop.getLocation());
            System.out.println("Number of Shops: " + shop.getNumberOfShops());
            System.out.println("Number of Floors: " + shop.getNumberOfFloors());
            System.out.println("Opening Hours: " + shop.getOpeningHours());
            System.out.println("Owner Name: " + shop.getOwnerName());

    }*/
}
