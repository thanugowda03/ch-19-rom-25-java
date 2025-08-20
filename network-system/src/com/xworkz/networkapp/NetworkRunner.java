package com.xworkz.networkapp;

import com.xworkz.networkapp.network.Network;

public class NetworkRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Network network = new Network();
        network.setNetworkId(1);
        network.setNetworkType("VPN");
        network.setNetworkName("BSNL");
        network.setPrice(450.00);

        int networkId=network.getNetworkId();
        String networkType=network.getNetworkType();
        String networkName= network.getNetworkName();
        double price=network.getPrice();

        System.out.println("Network Id "+networkId);
        System.out.println("Network Type "+networkType);
        System.out.println("Network Name "+networkName);
        System.out.println("Price "+price);
        System.out.println("main ended");

    }
}
