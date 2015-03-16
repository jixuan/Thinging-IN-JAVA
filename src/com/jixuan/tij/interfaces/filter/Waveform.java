package com.jixuan.tij.interfaces.filter;

/**
 * @author jixuan
 *         Create on 15/3/16.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Waveform " + id;
    }
}
