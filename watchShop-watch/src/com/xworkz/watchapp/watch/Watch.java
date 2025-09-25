package com.xworkz.watchapp.watch;

import com.xworkz.watchapp.shop.ShopDetails;

public interface Watch {

    boolean addShopDetails(ShopDetails shopDetails);

    boolean updateShopNameByShopId(int shopId , String updateShopName);

    boolean updateLocationByShopName(String shopName, String updateLocation);

    boolean updateContactNoByShopId(String updateContactNumber,int shopId1);

    String getShopNameByShopId(int shopId2);

    int getShopIdByShopName(String shopName1);

    String getClosingTimeByOpeningTime(String openingTime);

    void getShopDetails();
}
