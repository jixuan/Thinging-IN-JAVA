package com.jixuan.tij.interfaces.classprocessor;

public class Upcase extends Processor {
    @Override
    public String process(Object object) {
        return ((String) object).toUpperCase();
    }
}
