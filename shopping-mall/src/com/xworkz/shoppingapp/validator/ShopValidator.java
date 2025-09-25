package com.xworkz.shoppingapp.validator;

import com.xworkz.shoppingapp.shop.Shop;

public class ShopValidator {

    Shop shop;
    public boolean validateShopInfo(Shop shop){
        boolean shopValidate = false;
        boolean mallIdValid = false;
        boolean mallNameValid = false;
        boolean locationValid = false;
        boolean numberOfShopsValid = false;
        boolean numberOfFloorsValid = false;
        boolean openingHoursValid = false;
        boolean ownerNameValid = false;

        if (shop.getMallId() > 0) {
            mallIdValid = true;
        } else {
            System.out.println("Mall id is not valid");
        }

        if (shop.getMallName() != null && !shop.getMallName().isEmpty()) {
            mallNameValid = true;
        } else {
            System.out.println("Mall name is empty/null");
        }

        if (shop.getLocation() != null && !shop.getLocation().isEmpty()) {
            locationValid = true;
        } else {
            System.out.println("Location is empty/null");
        }

        if (shop.getNumberOfShops() > 0) {
            numberOfShopsValid = true;
        } else {
            System.out.println("Number of shops is not valid");
        }

        if (shop.getNumberOfFloors() > 0) {
            numberOfFloorsValid = true;
        } else {
            System.out.println("Number of floors is not valid");
        }

        if (shop.getOpeningHours() != null && !shop.getOpeningHours().isEmpty()) {
            openingHoursValid = true;
        } else {
            System.out.println("Opening hours is empty/null");
        }

        if (shop.getOwnerName() != null && !shop.getOwnerName().isEmpty()) {
            ownerNameValid = true;
        } else {
            System.out.println("Owner name is empty/null");
        }

        if (mallIdValid && mallNameValid && locationValid && numberOfShopsValid &&
                numberOfFloorsValid && openingHoursValid && ownerNameValid) {
            shopValidate = true;
        }

        return shopValidate;
    }
}


