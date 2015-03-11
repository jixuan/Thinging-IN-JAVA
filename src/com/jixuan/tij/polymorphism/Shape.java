package com.jixuan.tij.polymorphism;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/10.
 */
public class Shape {
    void draw() {
        println("Shape draw");
    }

    void erase() {
        println("Shape erase");
    }

    void description() {
        println("description shap");
    }
    void callanother(){
        println(" call ");
        another();
    }

    void another() {
        println(" another");
    }
}
