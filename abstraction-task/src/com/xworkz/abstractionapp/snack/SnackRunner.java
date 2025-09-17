package com.xworkz.abstractionapp.snack;

import com.xworkz.abstractionapp.snack.impl.KurkureImpl;

public class SnackRunner {
    public static void main(String[] args) {
        Snack snack=new KurkureImpl();
        snack.name();
        snack.companyName();
        snack.quantity();
    }
}
