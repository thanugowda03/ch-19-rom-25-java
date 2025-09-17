package com.xworkz.abstractionapp.ironbox.impl;

import com.xworkz.abstractionapp.ironbox.IronBox;

public class IronBoxRunner {
    public static void main(String[] args) {
        IronBox ironBox=new PigeonImpl();
        ironBox.brandName();
        ironBox.price();
        ironBox.color();
    }


}
