package com.jixuan.tij.interfaces.classprocessor;

public class Processor {
    public String name() {
        return this.getClass().getSimpleName();
    }

    public Object process(Object object) {
        return object;
    }
}
