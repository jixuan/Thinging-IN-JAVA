package com.jixuan.tij.interfaces.music2;

import com.jixuan.tij.polymorphism.music.Note;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/13.
 */
public class Wind implements Instrument {

    @Override
    public void play(Note note) {
        println(this + ".play() " + note);
    }

    @Override
    public void adjust() {
        println(this + ".adjust() ");
    }

    @Override
    public String toString() {
        return " Wind ";
    }
}
