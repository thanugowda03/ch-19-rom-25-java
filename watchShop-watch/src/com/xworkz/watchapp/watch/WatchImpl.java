package com.xworkz.watchapp.watch;

import com.xworkz.watchapp.exception.*;
import com.xworkz.watchapp.shop.ShopDetails;

public class WatchImpl implements Watch {

    public WatchImpl(int size){
        shopDetail = new ShopDetails[size];
    }
    public ShopDetails[] shopDetail;
    int index;

    @Override
    public boolean addShopDetails(ShopDetails shopDetails){
        boolean isShopAdded = false;
        try {
            if (shopDetails != null) {
                shopDetail[index++] = shopDetails;
                isShopAdded = true;
            } else {
                throw new AddShopDetailsNotFoundException("Invalid Exception");
            }
        }catch (AddShopDetailsNotFoundException e){
            e.printStackTrace();
        }
        return isShopAdded;
    }

@Override
    public boolean updateShopNameByShopId(int shopId , String updateShopName){
        boolean shopNameUpdate = false;
        try {
            for (ShopDetails shopDetails : this.shopDetail) {
                if (shopDetails.getShopId() == shopId) {
                    shopDetails.setShopName(updateShopName);
                    System.out.println("Shop name is updated");
                    shopNameUpdate = true;
                } else {
                    throw new UpdateShopNameByShopIdNotFoundException("Invalid update");
                }
            }
        }catch (UpdateShopNameByShopIdNotFoundException e){
            e.printStackTrace();
        }

        return shopNameUpdate;
    }


    @Override
    public boolean updateLocationByShopName(String shopName, String updateLocation){
        boolean locationUpdate = false;
         try{
        for (ShopDetails shopDetails :this.shopDetail) {
            if (shopDetails.getShopName().equals(shopName)) {
                shopDetails.setLocation(updateLocation);
                System.out.println("Location updated");
                locationUpdate = true;
            } else {
                throw new UpdateLocationByShopNameNotFoundException("Invalid Update");
            }
        }
        }catch (UpdateLocationByShopNameNotFoundException e){
             e.printStackTrace();
         }
        return locationUpdate;
    }

    @Override
    public boolean updateContactNoByShopId(String updateContactNumber,int shopId1){
        boolean contactNumberUpdate = false;
        try {
            for (ShopDetails shopDetails : this.shopDetail) {
                if (shopDetails.getShopId() == shopId1) {
                    shopDetails.setContactNumber(updateContactNumber);
                    System.out.println("Contact number update");
                    contactNumberUpdate = true;
                } else {
                    throw new UpdateContactNoByShopIdNotFoundException("Inavlid update");
                }
            }
        }catch (UpdateContactNoByShopIdNotFoundException e){
            e.printStackTrace();
        }
        return contactNumberUpdate;
    }

@Override
    public String getShopNameByShopId(int shopId2){
        String shopName = null;
    try {
        for (ShopDetails shopDetails : this.shopDetail) {
            if (shopDetails.getShopId() == shopId2) {
                return shopDetails.getShopName();
            } else {
                throw new GetShopNameByShopIdNotFoundException("Inavlid update");
            }
        }
    }catch (GetShopNameByShopIdNotFoundException e){
        e.printStackTrace();
    }
        return shopName;
    }

@Override
    public int getShopIdByShopName(String shopName1){
        int shopId = 0;
        try {
            for (ShopDetails shopDetails : this.shopDetail) {
                if (shopDetails.getShopName().equals(shopName1)) {
                    return shopDetails.getShopId();
                }else {
                    throw new GetShopIdByShopNameNotFoundException("Invalid");
                }
            }
        }catch (GetShopNameByShopIdNotFoundException e){
            e.printStackTrace();
        }
        return shopId;
    }


@Override
    public String getClosingTimeByOpeningTime(String openingTime){
        String closingTime = null;
        try {
            for (ShopDetails shopDetails : this.shopDetail) {
                if (shopDetails.getOpeningTime().equals(openingTime)) {
                    return shopDetails.getClosingTime();
                } else {
                    throw new GetClosingTimeByOpeningTimeNotFoundException("Inavlid getopertion");
                }
            }
        }catch (GetClosingTimeByOpeningTimeNotFoundException e){
            e.printStackTrace();
        }
        return closingTime;
    }


@Override
    public void getShopDetails(){
        System.out.println("List of shops: "+shopDetail.length);
        for (ShopDetails shopDetails:shopDetail){
            System.out.println("Shop id: "+shopDetails.getShopId());
            System.out.println("Shop name: "+shopDetails.getShopName());
            System.out.println("Shop location: "+shopDetails.getLocation());
            System.out.println("Shop ower name: "+shopDetails.getOwerName());
            System.out.println("Shop number os brands: "+shopDetails.getNumberOfBrands());
            System.out.println("Shop contact number: "+shopDetails.getContactNumber());
            System.out.println("Shop opening time: "+shopDetails.getOpeningTime());
            System.out.println("Shop closing time: "+shopDetails.getClosingTime());
            System.out.println("");
        }
    }

    /*ShopDetails shopDetails;
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
    }*/
}
