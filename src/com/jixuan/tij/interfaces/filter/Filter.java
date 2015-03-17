package com.jixuan.tij.interfaces.filter;

/**
 * @author jixuan
 *         Create on 15/3/16.
 */
public class Filter implements Processor {


    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public Waveform process(Object waveform) {
        return (Waveform)waveform;
    }


}
