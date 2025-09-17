package com.xworkz.abstractionapp.jewellery;

import com.xworkz.abstractionapp.jewellery.impl.NecklaceImpl;

public class JewelleryRunner {
    public static void main(String[] args) {
        Jewellery jewellery=new NecklaceImpl();
        jewellery.jewelleryName();
        jewellery.weight();
        jewellery.price();


    }
}
