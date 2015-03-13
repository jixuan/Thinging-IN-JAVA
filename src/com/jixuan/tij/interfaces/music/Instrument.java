package com.jixuan.tij.interfaces.music;

/**
 * @author jixuan
 *         Create on 15/3/13.
 */
abstract class Instrument {
    private int i ;

    public abstract void play();

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}
