package com.jixuan.tij.polymorphism;

/**
 * @author jixuan
 *         Create on 15/3/10.
 */
public class TestShap {
    public static void main(String[] args) {
        Shape[] a = new Shape[6];
        ShapGenerator gener = new ShapGenerator();
        for (int i = 0; i < 6; i++) {
            a[i] = gener.getShap();
            a[i].draw();
            a[i].erase();
        }
    }

}
