package com.xworkz.abstractionapp.pen.impl;

import com.xworkz.abstractionapp.pen.Pen;

public class BallPen implements Pen {

    @Override
    public void write() {
        System.out.println("Pen is used for writing");
    }

    @Override
    public void brand() {
        System.out.println("Pen brand is Cello");

    }

    @Override
    public void color() {
        System.out.println("Pen ink color is Blue");

    }
}
