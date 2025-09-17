package com.xworkz.abstractionapp.pen;

import com.xworkz.abstractionapp.pen.impl.BallPen;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen=new BallPen();
        pen.write();
        pen.brand();
        pen.color();
    }
}
