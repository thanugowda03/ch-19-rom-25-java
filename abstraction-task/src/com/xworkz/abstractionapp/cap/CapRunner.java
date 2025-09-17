package com.xworkz.abstractionapp.cap;

import com.xworkz.abstractionapp.cap.impl.CapImpl;

public class CapRunner {
    public static void main(String[] args) {
        Cap cap=new CapImpl();
        cap.color();
        cap.size();
        cap.price();
    }
}
