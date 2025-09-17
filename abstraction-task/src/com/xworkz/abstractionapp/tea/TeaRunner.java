package com.xworkz.abstractionapp.tea;

import com.xworkz.abstractionapp.tea.impl.TataImpl;

public class TeaRunner {
    public static void main(String[] args) {
        Tea tea=new TataImpl();
        tea.teaPowderBrand();
        tea.flavour();
        tea.price();
    }
}
