package com.jixuan.tij.polymorphism;

/**
 * @author jixuan
 *         Create on 15/3/11.
 */
public class WheatMill extends Mill {
    @Override
    Wheat process() {
        return new Wheat();
    }
}
