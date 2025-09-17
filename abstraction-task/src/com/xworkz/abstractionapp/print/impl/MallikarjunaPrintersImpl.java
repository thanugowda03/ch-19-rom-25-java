package com.xworkz.abstractionapp.print.impl;

import com.xworkz.abstractionapp.print.Print;

public class MallikarjunaPrintersImpl implements Print {
    @Override
    public void colorPrint() {
        System.out.println("Print color sheet");
    }

    @Override
    public void blackAndWhitePrint() {
        System.out.println("Print black and white sheets");

    }

    @Override
    public void binding() {
        System.out.println("Binding the books");

    }
}
