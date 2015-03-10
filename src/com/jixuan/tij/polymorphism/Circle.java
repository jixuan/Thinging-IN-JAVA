package com.jixuan.tij.polymorphism;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/10.
 */
public class Circle extends Shape {
    @Override
    void draw() {
        println("Circle draw");
    }

    @Override
    void erase() {
        println("Circle erase");
    }
}
