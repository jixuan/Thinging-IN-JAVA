package com.jixuan.tij.polymorphism.music;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/13.
 */
public class Brass extends Wind {
    @Override
    public String what() {
        return "Brass";
    }

    @Override
    public void play(Note note) {
        println(" Brass.play() " + note);
    }
}
