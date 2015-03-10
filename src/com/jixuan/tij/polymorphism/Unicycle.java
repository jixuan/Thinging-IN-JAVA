package com.jixuan.tij.polymorphism;

/**
 * @author jixuan
 *         Create on 15/3/10.
 */
public class Unicycle extends Cycle {
    public Unicycle() {
        super.wheelNum = 1;
    }

    public static void main(String[] args) {
        Cycle c = new Unicycle();
        Cycle c2 = new Bicycle();
        c.ride(c);
        c2.ride(c2);
    }
}

class Bicycle extends Cycle {
    public Bicycle() {
        super.wheelNum = 2;
    }
}