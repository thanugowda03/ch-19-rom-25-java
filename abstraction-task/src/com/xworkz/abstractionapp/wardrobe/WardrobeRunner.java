package com.xworkz.abstractionapp.wardrobe;

import com.xworkz.abstractionapp.wardrobe.impl.GodrageImpl;

public class WardrobeRunner {
    public static void main(String[] args) {
        Wardrobe wardrobe=new GodrageImpl();
        wardrobe.brand();
        wardrobe.color();
        wardrobe.price();
    }
}
