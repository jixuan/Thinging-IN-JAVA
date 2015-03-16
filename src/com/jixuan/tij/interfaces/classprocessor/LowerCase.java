package com.jixuan.tij.interfaces.classprocessor;

public class LowerCase extends Processor {
    @Override
    public Object process(Object object) {
        return ((String)object).toLowerCase();
    }
}
