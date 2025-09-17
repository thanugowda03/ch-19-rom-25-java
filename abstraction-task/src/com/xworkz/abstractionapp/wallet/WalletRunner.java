package com.xworkz.abstractionapp.wallet;

import com.xworkz.abstractionapp.wallet.impl.LadiesWalletImpl;

public class WalletRunner {
    public static void main(String[] args) {
        Wallet wallet=new LadiesWalletImpl();
        wallet.brand();
        wallet.color();
        wallet.price();
    }
}
