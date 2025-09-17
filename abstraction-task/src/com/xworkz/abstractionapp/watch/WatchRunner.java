package com.xworkz.abstractionapp.watch;

import com.xworkz.abstractionapp.watch.impl.SonyImpl;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch=new SonyImpl();
        watch.color();
        watch.price();
        watch.warranty();
    }
}
