package com.xworkz.magazinedetails;

import com.xworkz.magazinedetails.magazine.Magazine;

public class MagazineRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Magazine magazine = new Magazine();
        magazine.setMagazineId(14);
        magazine.setTitle("National Geographic");
        magazine.setLanguage("English");
        magazine.setPublisher("National Geographic Partners");
        magazine.setPrice(120.00);

        int magazineId = magazine.getMagazineId();
        String title = magazine.getTitle();
        String language = magazine.getLanguage();
        String publisher = magazine.getPublisher();
        double price = magazine.getPrice();

        System.out.println("Magazine Id: "+magazineId);
        System.out.println("Magazine title: "+title);
        System.out.println("Magazine language: "+language);
        System.out.println("Magazine publisher: "+publisher);
        System.out.println("Magazine price: "+price);
        System.out.println("main ended");
    }
}
