package com.xworkz.abstractionapp.pillow;

import com.xworkz.abstractionapp.pillow.impl.KurlOnImpl;

public class PillowRunner {
    public static void main(String[] args) {
        Pillow pillow=new KurlOnImpl();
        pillow.color();
        pillow.price();
        pillow.purpose();
    }
}
