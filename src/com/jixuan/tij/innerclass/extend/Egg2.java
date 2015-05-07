package com.jixuan.tij.innerclass.extend;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/5/7.
 */
public class Egg2 extends Egg {
    public Egg2() {
        println("Egg2 !!");
        insertYolk(new Yolk());
    }

    public class Yolk extends Egg.Yolk {
        public Yolk() {
            println("Egg2.Yolk");
        }
        public void f() {
            println(" Egg2.Yolk.f()");
        }
    }
}
