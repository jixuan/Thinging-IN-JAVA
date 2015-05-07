package com.jixuan.tij.innerclass.extend;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/5/7.
 */
public class Egg {
    private Yolk y = new Yolk();

    public Egg() {
        println("Egg !!!");
    }

    public void insertYolk(Yolk yy) {
        this.y = yy;
    }

    public void g() {
        y.f();
    }
    protected class Yolk{
        public Yolk() {
            println("Yolk !!");
        }

        public void f() {
            println(" Yolk.f()");
        }
    }
}
