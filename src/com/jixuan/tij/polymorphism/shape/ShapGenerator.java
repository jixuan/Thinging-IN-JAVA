package com.jixuan.tij.polymorphism.shape;

import java.util.Random;

/**
 * @author jixuan
 *         Create on 15/3/10.
 */
public class ShapGenerator {
    private Random random = new Random(4);
    public Shape getShap() {
        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}
