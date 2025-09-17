package com.xworkz.abstractionapp.glass.impl;

import com.xworkz.abstractionapp.glass.Glass;

public class GlassRunner {
    public static void main(String[] args) {
        Glass glass=new SteelGlassImpl();
        glass.glassType();
        glass.color();
        glass.price();
    }
}
