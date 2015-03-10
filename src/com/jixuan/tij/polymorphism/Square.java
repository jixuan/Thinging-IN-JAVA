package com.jixuan.tij.polymorphism;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/10.
 */
public class Square extends Shape {
    @Override
    void draw() {
        println("Square draw");
    }

    @Override
    void erase() {
        println("Square erase");
    }
}
