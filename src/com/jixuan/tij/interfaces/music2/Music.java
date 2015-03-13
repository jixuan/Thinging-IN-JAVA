package com.jixuan.tij.interfaces.music2;


import com.jixuan.tij.polymorphism.music.Note;

/**
 * @author jixuan
 *         Create on 15/3/13.
 */
public class Music {
    public static void tune(Instrument instrument) {
        instrument.play(Note.B_FLAT);
    }

    public static void tuneAll(Instrument[] instruments) {
        for (Instrument i : instruments) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Woodwind(),
                new Brass()
        };
        tuneAll(orchestra);
    }
}
