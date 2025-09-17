package com.xworkz.abstractionapp.wallet.impl;

import com.xworkz.abstractionapp.wallet.Wallet;

public class LadiesWalletImpl implements Wallet{

    @Override
    public void color() {
        System.out.println("Wallet Color is pink");
    }

    @Override
    public void price() {
        System.out.println("Wallet price is 580Rs");

    }

    @Override
    public void brand() {
        System.out.println("Wallet brand is Mega");

    }
}
