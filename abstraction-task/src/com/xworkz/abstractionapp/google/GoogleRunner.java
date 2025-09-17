package com.xworkz.abstractionapp.google;

import com.xworkz.abstractionapp.google.impl.GmailImpl;

public class GoogleRunner {
    public static void main(String[] args) {
        Google google=new GmailImpl();
        google.open();
        google.send();
        google.recieve();
    }
}
