package com.xworkz.abstractionapp.glass.impl;

import com.xworkz.abstractionapp.glass.Glass;


public class SteelGlassImpl implements Glass {
    @Override
    public void glassType() {
        System.out.println("Glass type is Steel");
    }

    @Override
    public void color() {
        System.out.println("Glass color silver");

    }

    @Override
    public void price() {
        System.out.println("Price is 40perPiece");

    }
}
