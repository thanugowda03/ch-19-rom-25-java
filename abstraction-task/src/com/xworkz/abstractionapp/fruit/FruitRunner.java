package com.xworkz.abstractionapp.fruit;

import com.xworkz.abstractionapp.fruit.impl.AppleImpl;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit=new AppleImpl();
        fruit.fruitName();
        fruit.color();
        fruit.vitamin();
    }
}
