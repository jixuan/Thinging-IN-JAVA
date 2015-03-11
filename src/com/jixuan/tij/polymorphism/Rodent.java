package com.jixuan.tij.polymorphism;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/11.
 */
public class Rodent {
    public int tooth=2;

    public int getTooth() {
        return tooth;
    }

    public void eat() {
        println("eattttt ");
    }

    public static void beat() {
        println("rodent bbbbbbbeattttt ");
    }
}
