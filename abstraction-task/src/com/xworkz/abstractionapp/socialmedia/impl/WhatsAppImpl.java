package com.xworkz.abstractionapp.socialmedia.impl;

import com.xworkz.abstractionapp.socialmedia.SocialMedia;

public class WhatsAppImpl implements SocialMedia {
    @Override
    public void chat() {
        System.out.println("WhtsApp is uded to chat");
    }

    @Override
    public void voiceCall() {
        System.out.println("WhtsApp is uded to make voice call");

    }

    @Override
    public void videoCall() {
        System.out.println("WhtsApp is uded to make videocall");

    }
}
