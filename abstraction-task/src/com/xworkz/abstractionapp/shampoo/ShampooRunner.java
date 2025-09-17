package com.xworkz.abstractionapp.shampoo;

import com.xworkz.abstractionapp.shampoo.impl.KarthikaImpl;

public class ShampooRunner {
    public static void main(String[] args) {
        Shampoo shampoo=new KarthikaImpl();
        shampoo.shampooColor();
        shampoo.price();
        shampoo.weight();
    }
}
