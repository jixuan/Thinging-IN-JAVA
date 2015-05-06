package com.jixuan.tij.innerclass.controller;

/**
 * @author jixuan
 *         Create on 15/5/6.
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    protected Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
}
