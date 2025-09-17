package com.xworkz.abstractionapp.socialmedia;

import com.xworkz.abstractionapp.socialmedia.impl.WhatsAppImpl;

public class SocialMediaRunner {
    public static void main(String[] args) {
        SocialMedia media=new WhatsAppImpl();
        media.chat();
        media.voiceCall();
        media.videoCall();
    }
}
