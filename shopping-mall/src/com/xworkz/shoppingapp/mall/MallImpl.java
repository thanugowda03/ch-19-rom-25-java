package com.xworkz.shoppingapp.mall;

import com.xworkz.shoppingapp.exception.*;
import com.xworkz.shoppingapp.shop.Shop;

public class MallImpl implements Mall {

    public MallImpl(int size){
        shops = new Shop[size];
    }

    public Shop[] shops;
    int index;

    @Override
    public boolean addShopDetails(Shop shop){
        boolean isShopAdded = false;
        try{
        if (shop != null){
            shops[index++]=shop;
            isShopAdded = true;
        }
        else {
            throw new AddShopDetailsNotFoundException("Invalid Add operation");
        }
        }catch (AddShopDetailsNotFoundException e){
            e.printStackTrace();
        }
        return isShopAdded;
    }

    @Override
    public boolean updateMallNameByMallId(int mallId,String updatedMallName) {
        boolean mallNameUpdate = false;
        try {
            for (Shop shop : this.shops) {
                if (shop.getMallId() == mallId) {
                    shop.setMallName(updatedMallName);
                    System.out.println("Mall name is update");
                    mallNameUpdate = true;
                } else {
                    throw new UpdateMallNameByMallIdNotFoundException("Invalid update");
                }
            }

        } catch (UpdateMallNameByMallIdNotFoundException e) {
            e.printStackTrace();
        }return mallNameUpdate;
    }

@Override
    public boolean updateMallLocationByMallName(String mallName,String updateLocation){
        boolean mallLocationUpdate = false;
            try{
            for (Shop shop:this.shops) {
                if (shop.getMallName().equals(mallName)) {
                    shop.setLocation(updateLocation);
                    System.out.println("Mall location is updated");
                    mallLocationUpdate = true;
                } else {
                    throw new GetMallNameByLocationNotFoundException("Invalid update");
                }
            }
            }catch (GetMallNameByLocationNotFoundException e){
                e.printStackTrace();
            }
        return mallLocationUpdate;
    }
@Override
    public boolean updateOpeningHoursByMallId(int mallId1, String updateOpeningHours){
        boolean openingHoursUpdate = false;
        try {
            if (mallId1 > 0)
                for (Shop shop : this.shops) {
                    if (shop.getMallId() == mallId1) {
                        shop.setOpeningHours(updateOpeningHours);
                        System.out.println("Opening hours update");
                        openingHoursUpdate = true;
                    } else {
                        throw new UpdateOpeningHoursByMallIdNotFoundException("Not update");
                    }
                }
        }catch (UpdateOpeningHoursByMallIdNotFoundException e){
            e.printStackTrace();
        }
        return openingHoursUpdate;
    }

@Override
    public String getOwerNameByMallName(String mallName1){
        String ownerName = null;
        try {
            if (mallName1 != null)
                for (Shop shop : this.shops) {
                    if (shop.getMallName().equals(mallName1)) {
                        ownerName = shop.getOwnerName();
                    } else {
                        throw new GetOwerNameByMallNameNotFoundException("Invalid update");
                    }
                }
        }catch (GetOwerNameByMallNameNotFoundException e){
            e.printStackTrace();
        }
        return ownerName;
    }

/*    @Override
    public boolean updateMallShopsByMallId(int mallId,int updatedMallShops) {
        boolean mallShopsUpdate = false;

        for (Shop shop : this.shops) {
            if (shop.getMallId() == mallId) {
                shop.setNumberOfShops(updatedMallShops);
                System.out.println("Mall shops is update");
                mallShopsUpdate = true;
            }
        }
        if (mallShopsUpdate == false) System.out.println("Mall id" + mallId + "does not exist");
        return mallShopsUpdate;

    }*/
@Override
    public int getNoOfShopsByMallId(int mallId2){
        int noOfShops = 0;
        try {
            if (mallId2 > 0)
                for (Shop shop : this.shops) {
                    if (shop.getMallId() == mallId2) {
                        noOfShops = shop.getNumberOfShops();
                    } else {
                        throw new GetNoOfShopsByMallIdNotFoundException("Invalid get operation");
                    }
                }
        }catch (GetNoOfShopsByMallIdNotFoundException e){
            e.printStackTrace();
        }
        return noOfShops;
    }

@Override
    public String getMallNameByLocation(String location){
        String mallName = null;
        try {
            for (Shop shop : this.shops) {
                if (shop.getLocation().equals(location)) {
                    mallName = shop.getMallName();
                } else {
                    throw new GetMallNameByLocationNotFoundException("Invalid get opeartion");
                }
            }
        }catch (GetMallNameByLocationNotFoundException e){
            e.printStackTrace();
        }
        return mallName;
    }

   /* public boolean deleteMallByClosingTime(String closingTime){
        boolean remove = false;
        for (Shop shop : this.shops){
            if (shop.getClosingTime().equals(closingTime)){
                this.shops.remove(shop);

            }
        }
        return remove;
    }*/


@Override

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
            System.out.println("Closing time:" +shop.getClosingTime());
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
