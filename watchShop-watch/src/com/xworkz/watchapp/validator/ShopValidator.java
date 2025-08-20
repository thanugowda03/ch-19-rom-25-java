package com.xworkz.watchapp.validator;

import com.xworkz.watchapp.shop.ShopDetails;

public class ShopValidator {
    ShopDetails shopDetails;

    public boolean validateShopInfo(ShopDetails shopDetails){
        boolean shopValidate = false;
        boolean shopIdValid = false;
        boolean shopNameValid = false;
        boolean locationValid = false;
        boolean owerNameValid = false;
        boolean numberOfBrandsValid = false;
        boolean contactNumberValid = false;
        boolean openingTimeValid = false;
        boolean closingTimeValid = false;

        if (shopDetails.getShopId() > 0){
            shopIdValid = true;
        }
        else {
            System.out.println("Shop id is not valid");
        }
        if (shopDetails.getShopName() != null && !shopDetails.getShopName().isEmpty()){
            shopNameValid = true;
        }
        else {
            System.out.println("Shop name is empty/null");
        }
        if (shopDetails.getLocation() != null && !shopDetails.getLocation().isEmpty()){
            locationValid = true;
        }
        else {
            System.out.println("Location is empty/null");
        }
        if (shopDetails.getOwerName() != null && !shopDetails.getOwerName().isEmpty()){
            owerNameValid = true;
        }
        else {
            System.out.println("Ower name is empty/null");
        }
        if (shopDetails.getNumberOfBrands() > 0){
            numberOfBrandsValid = true;
        }
        else {
            System.out.println("Number of brands is not valid");
        }
        if (shopDetails.getContactNumber() != null && !shopDetails.getContactNumber().isEmpty()){
            contactNumberValid = true;
        }
        else {
            System.out.println("Contact number is empty/ null");
        }
        if (shopDetails.getOpeningTime() != null && !shopDetails.getOpeningTime().isEmpty()){
            openingTimeValid = true;
        }
        else {
            System.out.println("Opening time is empty/null");
        }
        if (shopDetails.getClosingTime() != null && !shopDetails.getClosingTime().isEmpty()){
            closingTimeValid = true;
        }
        else {
            System.out.println("Closing time is empty/null");
        }
        if (shopIdValid && shopNameValid && locationValid && owerNameValid && numberOfBrandsValid && contactNumberValid && openingTimeValid && closingTimeValid){
            shopValidate = true;
        }
        return shopValidate;
    }

}
