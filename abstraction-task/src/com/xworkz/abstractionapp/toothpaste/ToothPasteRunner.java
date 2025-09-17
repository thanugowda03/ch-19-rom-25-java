package com.xworkz.abstractionapp.toothpaste;

import com.xworkz.abstractionapp.toothpaste.impl.ColgateImpl;

public class ToothPasteRunner {
    public static void main(String[] args) {
        ToothPaste paste=new ColgateImpl();
        paste.brand();
        paste.price();
        paste.quantity();
    }
}
