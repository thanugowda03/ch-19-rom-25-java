package com.xworkz.abstractionapp.breakfast;

import com.xworkz.abstractionapp.breakfast.impl.IdliImpl;

public class BreakFastRunner {
    public static void main(String[] args) {
        BreakFast breakFast=new IdliImpl();
        breakFast.foodName();
        breakFast.madeBy();
        breakFast.servedWith();
    }
}
