package com.xworkz.abstractionapp.fruit.impl;

import com.xworkz.abstractionapp.fruit.Fruit;

public class AppleImpl implements Fruit {
    @Override
    public void fruitName() {
        System.out.println("Fruit name is apple");
    }

    @Override
    public void color() {
        System.out.println("Fruit color is red");

    }

    @Override
    public void vitamin() {
        System.out.println("It contains vitamin A");

    }
}
