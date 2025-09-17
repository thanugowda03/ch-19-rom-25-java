package com.xworkz.abstractionapp.shoe;

import com.xworkz.abstractionapp.shoe.impl.BataImpl;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe shoe=new BataImpl();
        shoe.price();
        shoe.size();
        shoe.color();

    }
}
