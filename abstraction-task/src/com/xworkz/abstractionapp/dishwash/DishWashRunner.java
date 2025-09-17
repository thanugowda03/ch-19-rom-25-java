package com.xworkz.abstractionapp.dishwash;

import com.xworkz.abstractionapp.dishwash.impl.VimImpl;

public class DishWashRunner {
    public static void main(String[] args) {
        DishWash wash=new VimImpl();
        wash.name();
        wash.weight();
        wash.price();
    }
}
