package com.xworkz.abstractionapp.wallpaint.impl;

import com.xworkz.abstractionapp.wallpaint.WallPaint;

public class NipponImpl implements WallPaint {
    @Override
    public void color() {
        System.out.println("Paint color is yellow");
    }

    @Override
    public void price() {
        System.out.println("Price is 2300Rs/5L");

    }

    @Override
    public void brand() {
        System.out.println("brand name is nippon ");

    }
}
