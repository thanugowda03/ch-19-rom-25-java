package com.xworkz.abstractionapp.pipe.impl;

import com.xworkz.abstractionapp.pipe.Pipe;

public class PVCImpl implements Pipe {
    @Override
    public void type() {
        System.out.println("Type is water Pipe");
    }

    @Override
    public void color() {
        System.out.println("Pipe color is white");

    }

    @Override
    public void purpose() {
        System.out.println("Purpose of pipe is Water supply");

    }
}
