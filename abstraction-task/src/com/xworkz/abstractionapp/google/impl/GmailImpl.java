package com.xworkz.abstractionapp.google.impl;

import com.xworkz.abstractionapp.google.Google;

public class GmailImpl implements Google {
    @Override
    public void open() {
        System.out.println("Open the Gmail to use");
    }

    @Override
    public void send() {
        System.out.println("Send the mail");

    }

    @Override
    public void recieve() {
        System.out.println("Recieve the mail");

    }
}
