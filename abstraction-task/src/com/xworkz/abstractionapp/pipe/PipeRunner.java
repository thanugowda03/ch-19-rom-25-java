package com.xworkz.abstractionapp.pipe;

import com.xworkz.abstractionapp.pipe.impl.PVCImpl;

public class PipeRunner {
    public static void main(String[] args) {
        Pipe pipe=new PVCImpl();
        pipe.type();
        pipe.color();
        pipe.purpose();
    }
}
