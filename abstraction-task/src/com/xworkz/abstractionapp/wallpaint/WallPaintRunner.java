package com.xworkz.abstractionapp.wallpaint;

import com.xworkz.abstractionapp.wallpaint.impl.NipponImpl;

public class WallPaintRunner {
    public static void main(String[] args) {
        WallPaint wallPaint=new NipponImpl();
        wallPaint.brand();
        wallPaint.color();
        wallPaint.price();
    }
}
