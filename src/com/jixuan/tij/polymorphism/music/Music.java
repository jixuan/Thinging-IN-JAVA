package com.jixuan.tij.polymorphism.music;

/**
 * @author jixuan
 *         Create on 15/3/13.
 */
public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] a) {
        for (Instrument item : a) {
            tune(item);
        }
    }

    public static void main(String[] args) {
        Instrument[] ccc = {new Percussion(), new Brass(), new Stringed(), new Wind(), new Woodwind()};
        tuneAll(ccc);
    }
}
