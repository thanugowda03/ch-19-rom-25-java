package com.xworkz.abstractionapp.pickle;

import com.xworkz.abstractionapp.pickle.impl.SuperPicklesImpl;

public class PickleRunner {
    public static void main(String[] args) {
        Pickle pickle=new SuperPicklesImpl();
        pickle.brand();
        pickle.price();
        pickle.flavour();
    }
}
