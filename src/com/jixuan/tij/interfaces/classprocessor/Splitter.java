package com.jixuan.tij.interfaces.classprocessor;

import java.util.Arrays;

public class Splitter extends Processor {
    @Override
    public Object process(Object object) {
        return Arrays.toString(((String) object).split(" "));
    }
}
