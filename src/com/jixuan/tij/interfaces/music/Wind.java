package com.jixuan.tij.interfaces.music;


import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/13.
 */
public class Wind extends Instrument {
    private int num = 5;

    @Override
    public void play() {
        println("num : " + num);
    }

    @Override
    public void adjust() {
        println(" Wind adjust");
    }

    @Override
    public String what() {
        return "Wind";
    }
}
