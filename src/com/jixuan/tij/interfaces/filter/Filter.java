package com.jixuan.tij.interfaces.filter;

import com.jixuan.tij.interfaces.classprocessor.Processor;

/**
 * @author jixuan
 *         Create on 15/3/16.
 */
public class Filter extends Processor {

    @Override
    public Waveform process(Object waveform) {
        return (Waveform)waveform;
    }
}
