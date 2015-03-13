package com.jixuan.tij.polymorphism.music;

/**
 * @author jixuan
 *         Create on 15/3/13.
 */
public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        tune(flute);
        tune(violin);
    }
}
