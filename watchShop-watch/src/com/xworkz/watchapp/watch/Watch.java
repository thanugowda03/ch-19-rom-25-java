package com.xworkz.watchapp.watch;

import com.xworkz.watchapp.shop.ShopDetails;
import com.xworkz.watchapp.validator.ShopValidator;

public class Watch {

    ShopDetails shopDetails;
    public boolean addShopDetails(ShopDetails shopDetails){
        boolean isShopAdded = false;
        boolean isShopInfoValid = false;

        ShopValidator shopValidator = new ShopValidator();
        isShopInfoValid = shopValidator.validateShopInfo(shopDetails);
        if (isShopInfoValid){
            this.shopDetails = shopDetails;
            isShopAdded = true;
        }
        return isShopAdded;
    }
    public void getShopInfo(){
        System.out.println("Shop id: "+shopDetails.getShopId());
        System.out.println("Shop name: "+shopDetails.getShopName());
        System.out.println("Shop location: "+shopDetails.getLocation());
        System.out.println("Shop ower name: "+shopDetails.getOwerName());
        System.out.println("Shop number os brands: "+shopDetails.getNumberOfBrands());
        System.out.println("Shop contact number: "+shopDetails.getContactNumber());
        System.out.println("Shop opening time: "+shopDetails.getOpeningTime());
        System.out.println("Shop closing time: "+shopDetails.getClosingTime());
    }
}
