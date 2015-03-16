package com.jixuan.tij.interfaces.filter;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/16.
 */
public class BandPass extends Filter {
    double lowCutOff, highCutOff;

    public BandPass(double lowCutOff, double highCutOff) {
        this.lowCutOff = lowCutOff;
        this.highCutOff = highCutOff;
    }
    @Override
    public Waveform process(Object waveform) {
        println(" lowCutOff : "+lowCutOff+" highCutOff : "+highCutOff);
        return super.process(waveform);
    }
}
