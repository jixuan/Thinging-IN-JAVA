package com.jixuan.tij.polymorphism.shape;

import com.jixuan.tij.polymorphism.shape.Shape;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/10.
 */
public class Triangle extends Shape {
    @Override
    void draw() {
        println("Triangle draw");
    }

    @Override
    void erase() {
        println("Triangle erase");
    }
}
