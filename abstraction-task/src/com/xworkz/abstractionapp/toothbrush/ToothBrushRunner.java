package com.xworkz.abstractionapp.toothbrush;

import com.xworkz.abstractionapp.toothbrush.impl.ColgateImpl;

public class ToothBrushRunner {
    public static void main(String[] args) {
        ToothBrush brush=new ColgateImpl();
        brush.brand();
        brush.color();
        brush.price();
    }
}
