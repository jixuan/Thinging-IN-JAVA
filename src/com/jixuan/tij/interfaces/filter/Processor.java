package com.jixuan.tij.interfaces.filter;

public interface Processor {
    String name();

    Object process(Object object);
}
