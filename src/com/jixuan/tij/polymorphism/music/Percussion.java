package com.jixuan.tij.polymorphism.music;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/13.
 */
public class Percussion extends Instrument {
    @Override
    public void play(Note note) {
        println(" Percussion.play() " + note);
    }

    @Override
    public void adjust() {
        println("adjust Percussion");
    }

    @Override
    public String what() {
        return "Percussion";
    }
}
