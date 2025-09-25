package com.xworkz.shoppingapp;

import com.xworkz.shoppingapp.mall.Mall;
import com.xworkz.shoppingapp.mall.MallImpl;
import com.xworkz.shoppingapp.shop.Shop;

import java.util.Scanner;

public class MallRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of Shops:");
        int size = scanner.nextInt();

        MallImpl mall = new MallImpl(size);
        for (int i = 0; i<size; i++){
            Shop shop = new Shop();
            System.out.println("Enter mallId: ");
            shop.setMallId(scanner.nextInt());
            System.out.println("Enter mallName: ");
            shop.setMallName(scanner.next());
            System.out.println("Enter location:");
            shop.setLocation(scanner.next());
            System.out.println("Enter number of shops:");
            shop.setNumberOfShops(scanner.nextInt());
            System.out.println("Enter number of floors");
            shop.setNumberOfFloors(scanner.nextInt());
            System.out.println("Enter shop opening hours");
            shop.setOpeningHours(scanner.next());
            System.out.println("Enter shop ower name");
            shop.setOwnerName(scanner.next());
            System.out.println("Enter the closingTime:");
            shop.setClosingTime(scanner.next());

            mall.addShopDetails(shop);
        }
        mall.getShop();

        System.out.println("Enter the mall id update with mall name:");scanner.nextLine();
        int mallId = scanner.nextInt();
        System.out.println("Enter update MallName");
        mall.updateMallNameByMallId(mallId,scanner.next());
        mall.getShop();

        System.out.println("Enter the mall name update with mall location:"); scanner.nextLine();
        String mallName = scanner.next();
        System.out.println("Enter update mall location:");
        mall.updateMallLocationByMallName(mallName, scanner.next());
        mall.getShop();

        System.out.println("Enter the mall id update with mall opening hours:"); scanner.nextLine();
        int mallId1 = scanner.nextInt();
        System.out.println("Enter update mall openingHours:");
        mall.updateOpeningHoursByMallId(mallId1, scanner.next());
        mall.getShop();


        System.out.println("Enter the mall name to fetch the owner name:"); scanner.nextLine();
        String mallName1=mall.getOwerNameByMallName(scanner.next());
        System.out.println(mallName1);

        System.out.println("Enter the mall id to fetch the number of shops in mall:"); scanner.nextLine();
        int mallId2 = mall.getNoOfShopsByMallId(scanner.nextInt());
        System.out.println(mallId2);

        /*Shop shop = new Shop();
        shop.setMallId(1);
        shop.setMallName("Orion Mall");
        shop.setLocation("Bangalore");
        shop.setNumberOfShops(250);
        shop.setNumberOfFloors(5);
        shop.setOpeningHours("10:00 AM");
        shop.setOwnerName("Brigade Group");

        Mall mall = new Mall();
        boolean mallAdded = mall.addMallDetails(shop);

        if (mallAdded){
            mall.getMallInfo();
        }*/
        /*Shop shop1 = new Shop();
        shop1.setMallId(1);
        shop1.setMallName("Orion Mall");
        shop1.setLocation("Bangalore");
        shop1.setNumberOfShops(250);
        shop1.setNumberOfFloors(5);
        shop1.setOpeningHours("10:00 AM");
        shop1.setOwnerName("Brigade Group");

        Shop shop2 = new Shop();
        shop2.setMallId(2);
        shop2.setMallName("Phoenix Marketcity");
        shop2.setLocation("Bangalore");
        shop2.setNumberOfShops(300);
        shop2.setNumberOfFloors(4);
        shop2.setOpeningHours("11:00 AM");
        shop2.setOwnerName("The Phoenix Mills Ltd");

        Shop shop3 = new Shop();
        shop3.setMallId(3);
        shop3.setMallName("UB City Mall");
        shop3.setLocation("Bangalore");
        shop3.setNumberOfShops(100);
        shop3.setNumberOfFloors(3);
        shop3.setOpeningHours("10:30 AM");
        shop3.setOwnerName("UB Group");

        Shop shop4 = new Shop();
        shop4.setMallId(4);
        shop4.setMallName("Mantri Square");
        shop4.setLocation("Bangalore");
        shop4.setNumberOfShops(250);
        shop4.setNumberOfFloors(5);
        shop4.setOpeningHours("10:00 AM");
        shop4.setOwnerName("Mantri Developers");

        Shop shop5 = new Shop();
        shop5.setMallId(5);
        shop5.setMallName("Forum Mall");
        shop5.setLocation("Bangalore");
        shop5.setNumberOfShops(200);
        shop5.setNumberOfFloors(4);
        shop5.setOpeningHours("11:00 AM");
        shop5.setOwnerName("Prestige Group");

        Shop shop6 = new Shop();
        shop6.setMallId(6);
        shop6.setMallName("GT World Mall");
        shop6.setLocation("Bangalore");
        shop6.setNumberOfShops(150);
        shop6.setNumberOfFloors(3);
        shop6.setOpeningHours("10:00 AM");
        shop6.setOwnerName("Golden Towers");

        Shop shop7 = new Shop();
        shop7.setMallId(7);
        shop7.setMallName("Royal Meenakshi Mall");
        shop7.setLocation("Bangalore");
        shop7.setNumberOfShops(220);
        shop7.setNumberOfFloors(4);
        shop7.setOpeningHours("10:30 AM");
        shop7.setOwnerName("Vishala India");

        Shop shop8 = new Shop();
        shop8.setMallId(8);
        shop8.setMallName("Garuda Mall");
        shop8.setLocation("Bangalore");
        shop8.setNumberOfShops(180);
        shop8.setNumberOfFloors(5);
        shop8.setOpeningHours("9:30 AM");
        shop8.setOwnerName("Maverick Holdings");

        Shop shop9 = new Shop();
        shop9.setMallId(9);
        shop9.setMallName("Esteem Mall");
        shop9.setLocation("Bangalore");
        shop9.setNumberOfShops(120);
        shop9.setNumberOfFloors(3);
        shop9.setOpeningHours("10:00 AM");
        shop9.setOwnerName("Esteem Group");

        Shop shop10 = new Shop();
        shop10.setMallId(10);
        shop10.setMallName("VR Bengaluru");
        shop10.setLocation("Bangalore");
        shop10.setNumberOfShops(250);
        shop10.setNumberOfFloors(6);
        shop10.setOpeningHours("10:00 AM");
        shop10.setOwnerName("Virtuous Retail");

        Shop shop11 = new Shop();
        shop11.setMallId(11);
        shop11.setMallName("Sigma Mall");
        shop11.setLocation("Bangalore");
        shop11.setNumberOfShops(100);
        shop11.setNumberOfFloors(4);
        shop11.setOpeningHours("11:00 AM");
        shop11.setOwnerName("Sigma Developers");

        Shop shop12 = new Shop();
        shop12.setMallId(12);
        shop12.setMallName("Safina Plaza");
        shop12.setLocation("Bangalore");
        shop12.setNumberOfShops(140);
        shop12.setNumberOfFloors(3);
        shop12.setOpeningHours("10:30 AM");
        shop12.setOwnerName("Safina Group");

        Shop shop13 = new Shop();
        shop13.setMallId(13);
        shop13.setMallName("Central Mall");
        shop13.setLocation("Bangalore");
        shop13.setNumberOfShops(160);
        shop13.setNumberOfFloors(4);
        shop13.setOpeningHours("10:00 AM");
        shop13.setOwnerName("Future Group");

        Mall mall = new Mall();
        mall.addShopDetails(shop1);
        mall.addShopDetails(shop2);
        mall.addShopDetails(shop3);
        mall.addShopDetails(shop4);
        mall.addShopDetails(shop5);
        mall.addShopDetails(shop6);
        mall.addShopDetails(shop7);
        mall.addShopDetails(shop8);
        mall.addShopDetails(shop9);
        mall.addShopDetails(shop10);
        mall.addShopDetails(shop11);
        mall.addShopDetails(shop12);
        mall.addShopDetails(shop13);
        mall.getShop();

        String mallName = mall.getMallNameByLocation("Bangalore");
        System.out.println(mallName);*/
    }
}