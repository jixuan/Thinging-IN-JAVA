package com.jixuan.tij.polymorphism;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/11.
 */
public class Glyph {
    void draw() {
        println("Glyph draw");
    }

    public Glyph() {
        println("before draw");
        draw();
        println("after draw");
    }
}
