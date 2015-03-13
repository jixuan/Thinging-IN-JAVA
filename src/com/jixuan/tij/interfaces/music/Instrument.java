package com.jixuan.tij.interfaces.music;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/13.
 */
abstract class Instrument {

    public Instrument() {
        println(" Instrument constructor ");
        play();
    }

    public abstract void play();

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}
