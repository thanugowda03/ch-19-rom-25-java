package com.xworkz.abstractionapp.blanket;

import com.xworkz.abstractionapp.blanket.impl.WoollenImpl;

public class BlanketRunner {
    public static void main(String[] args) {
        Blanket blanket=new WoollenImpl();
        blanket.color();
        blanket.price();
        blanket.type();
    }
}
