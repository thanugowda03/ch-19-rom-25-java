package com.xworkz.watchapp;

import com.xworkz.watchapp.shop.ShopDetails;
import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watch.WatchImpl;

import java.util.Scanner;


public class WatchRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no Shops");
        int size = scanner.nextInt();
        WatchImpl watch = new WatchImpl(size);
        System.out.println("Shops are");
        for (int i=0; i<size; i++){
            ShopDetails shopDetails = new ShopDetails();
            System.out.println("Enter the shopId:");
            shopDetails.setShopId(scanner.nextInt());
            System.out.println("Enter shopName:");
            shopDetails.setShopName(scanner.next());
            System.out.println("Enter location:");
            shopDetails.setOwerName(scanner.next());
            System.out.println("Enter OwerName:");
            shopDetails.setOwerName(scanner.next());
            System.out.println("Enter number of brands:");
            shopDetails.setNumberOfBrands(scanner.nextInt());
            System.out.println("Enter contact number:");
            shopDetails.setContactNumber(scanner.next());
            System.out.println("Enter opening time:");
            shopDetails.setOpeningTime(scanner.next());
            System.out.println("Enter closing time:");
            shopDetails.setClosingTime(scanner.next());
            watch.addShopDetails(shopDetails);
        }
        watch.getShopDetails();

        System.out.println("Enter Shop name is update with shop id: "); scanner.nextLine();
        int shopId = scanner.nextInt();
        System.out.println("Enter update shop name:");
        watch.updateShopNameByShopId(shopId,scanner.next());
        watch.getShopDetails();

        System.out.println("Enter shop name is update with shop location: "); scanner.nextLine();
        String shopName = scanner.next();
        System.out.println("Enter update shop location:");
        watch.updateLocationByShopName(shopName, scanner.next());
        watch.getShopDetails();

        System.out.println("Enter shop id is update with contact number:"); scanner.nextLine();
        int shopId1 = scanner.nextInt();
        System.out.println("Enter update shop contact number:");
        watch.updateContactNoByShopId(scanner.next(),shopId1);

        System.out.println("Enter shop id fetch to shop name:"); scanner.nextLine();
        String shopId3 = watch.getShopNameByShopId(scanner.nextInt());
        System.out.println(shopId3);

        System.out.println("Enter shop name fetch to shop id:"); scanner.nextLine();
        int shopName2 = watch.getShopIdByShopName(scanner.next());
        System.out.println(shopName2);

        System.out.println("Enter shop closing time fetch to opening time:"); scanner.nextLine();
        String closingTime = watch.getClosingTimeByOpeningTime(scanner.next());
        System.out.println(closingTime);

        /*ShopDetails shopDetails = new ShopDetails();
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
        }*/

        /*ShopDetails shop1 = new ShopDetails();
        shop1.setShopId(1);
        shop1.setShopName("TimeZone Watches");
        shop1.setLocation("Bhadravathi");
        shop1.setOwerName("Rajesh");
        shop1.setNumberOfBrands(15);
        shop1.setContactNumber("9591268523");
        shop1.setOpeningTime("9.30 am");
        shop1.setClosingTime("9.30 pm");

        ShopDetails shop2 = new ShopDetails();
        shop2.setShopId(2);
        shop2.setShopName("Trendy Fashion");
        shop2.setLocation("Shivamogga");
        shop2.setOwerName("Anjali");
        shop2.setNumberOfBrands(25);
        shop2.setContactNumber("9845123456");
        shop2.setOpeningTime("10.00 am");
        shop2.setClosingTime("8.30 pm");

        ShopDetails shop3 = new ShopDetails();
        shop3.setShopId(3);
        shop3.setShopName("FreshMart Grocery");
        shop3.setLocation("Bengaluru");
        shop3.setOwerName("Kiran");
        shop3.setNumberOfBrands(40);
        shop3.setContactNumber("9876543210");
        shop3.setOpeningTime("7.00 am");
        shop3.setClosingTime("10.00 pm");

        ShopDetails shop4 = new ShopDetails();
        shop4.setShopId(4);
        shop4.setShopName("Book World");
        shop4.setLocation("Mysuru");
        shop4.setOwerName("Divya");
        shop4.setNumberOfBrands(10);
        shop4.setContactNumber("9123456780");
        shop4.setOpeningTime("9.00 am");
        shop4.setClosingTime("8.00 pm");

        ShopDetails shop5 = new ShopDetails();
        shop5.setShopId(5);
        shop5.setShopName("ElectroHub");
        shop5.setLocation("Hubli");
        shop5.setOwerName("Prakash");
        shop5.setNumberOfBrands(30);
        shop5.setContactNumber("9988776655");
        shop5.setOpeningTime("10.30 am");
        shop5.setClosingTime("9.30 pm");

        ShopDetails shop6 = new ShopDetails();
        shop6.setShopId(6);
        shop6.setShopName("Golden Jewellery");
        shop6.setLocation("Mangalore");
        shop6.setOwerName("Suresh");
        shop6.setNumberOfBrands(20);
        shop6.setContactNumber("89745632112");
        shop6.setOpeningTime("10.00 am");
        shop6.setClosingTime("8.30 pm");

        ShopDetails shop7 = new ShopDetails();
        shop7.setShopId(7);
        shop7.setShopName("Sports Arena");
        shop7.setLocation("Davangere");
        shop7.setOwerName("Manoj");
        shop7.setNumberOfBrands(18);
        shop7.setContactNumber("7412698530");
        shop7.setOpeningTime("9.00 am");
        shop7.setClosingTime("9.00 pm");

        ShopDetails shop8 = new ShopDetails();
        shop8.setShopId(8);
        shop8.setShopName("Kids Paradise");
        shop8.setLocation("Tumakuru");
        shop8.setOwerName("Meena");
        shop8.setNumberOfBrands(22);
        shop8.setContactNumber("9345678901");
        shop8.setOpeningTime("10.00 am");
        shop8.setClosingTime("8.00 pm");

        ShopDetails shop9 = new ShopDetails();
        shop9.setShopId(9);
        shop9.setShopName("TechZone Mobiles");
        shop9.setLocation("Hassan");
        shop9.setOwerName("Arun");
        shop9.setNumberOfBrands(35);
        shop9.setContactNumber("9456123789");
        shop9.setOpeningTime("9.30 am");
        shop9.setClosingTime("9.00 pm");

        Watch watch = new Watch();
        watch.addShopDetails(shop1);
        watch.addShopDetails(shop2);
        watch.addShopDetails(shop3);
        watch.addShopDetails(shop4);
        watch.addShopDetails(shop5);
        watch.addShopDetails(shop6);
        watch.addShopDetails(shop7);
        watch.addShopDetails(shop8);
        watch.addShopDetails(shop9);
        watch.getShopDetails();
        System.out.println("main ended");*/

    }
}
