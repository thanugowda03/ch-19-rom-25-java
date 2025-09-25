package com.xworkz.shoppingapp.mall;

import com.xworkz.shoppingapp.shop.Shop;

public interface Mall {

    boolean addShopDetails(Shop shop);

    boolean updateMallNameByMallId(int mallId,String updatedMallName);

    boolean updateMallLocationByMallName(String mallName,String updateLocation);

    boolean updateOpeningHoursByMallId(int mallId1, String updateOpeningHours);

    String getOwerNameByMallName(String mallName1);

    int getNoOfShopsByMallId(int mallId2);

    String getMallNameByLocation(String location);

    void getShop();
}
