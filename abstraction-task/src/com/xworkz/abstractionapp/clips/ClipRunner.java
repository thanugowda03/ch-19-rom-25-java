package com.xworkz.abstractionapp.clips;

import com.xworkz.abstractionapp.clips.Impl.HairClip;

public class ClipRunner {
    public static void main(String[] args) {
        Clips clips=new HairClip();
        clips.color();
        clips.brand();
        clips.price();
    }
}
