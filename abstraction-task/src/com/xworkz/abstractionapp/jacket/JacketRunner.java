package com.xworkz.abstractionapp.jacket;

import com.xworkz.abstractionapp.jacket.impl.LetherJacketImpl;

public class JacketRunner {
    public static void main(String[] args) {
        Jacket jacket=new LetherJacketImpl();
        jacket.price();
        jacket.noOfButton();
        jacket.color();
    }
}
