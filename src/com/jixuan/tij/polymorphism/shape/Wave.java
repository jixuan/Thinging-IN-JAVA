package com.jixuan.tij.polymorphism.shape;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/11.
 */
public class Wave extends Shape {
    @Override
    void another() {
        println("Wave another");
    }

    public static void main(String[] args) {
        Shape s = new Wave();
        s.callanother();
        Shape w = new Circle();
        w.callanother();

    }
}
