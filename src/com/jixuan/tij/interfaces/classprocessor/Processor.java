package com.jixuan.tij.interfaces.classprocessor;

/**
 * @author jixuan
 *         Create on 15/3/16.
 */
public class Processor {
    public String name() {
        return this.getClass().getSimpleName();
    }

    public Object process(Object object) {
        return object;
    }
}
