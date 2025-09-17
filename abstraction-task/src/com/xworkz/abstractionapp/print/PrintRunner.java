package com.xworkz.abstractionapp.print;

import com.xworkz.abstractionapp.print.impl.MallikarjunaPrintersImpl;

public class PrintRunner {
    public static void main(String[] args) {
        Print print=new MallikarjunaPrintersImpl();
        print.colorPrint();
        print.blackAndWhitePrint();
        print.binding();
    }
}
