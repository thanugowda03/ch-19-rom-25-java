package com.xworkz.abstractionapp.detergent;

import com.xworkz.abstractionapp.detergent.impl.SurfExcel;

public class DetergentRunner {
    public static void main(String[] args) {
        Detergent detergent=new SurfExcel();
        detergent.name();
        detergent.price();
        detergent.purpose();
    }
}
