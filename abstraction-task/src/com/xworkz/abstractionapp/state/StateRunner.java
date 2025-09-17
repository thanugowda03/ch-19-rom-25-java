package com.xworkz.abstractionapp.state;

import com.xworkz.abstractionapp.state.impl.KarnatakaImpl;

public class StateRunner {
    public static void main(String[] args) {
        State state=new KarnatakaImpl();
        state.stateName();
        state.cmName();
        state.festival();
    }
}
