package com.jixuan.tij.innerclass;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/5/7.
 */
public class TestInnerClass {
    private Inner ii ;
    public TestInnerClass() {
        println(" Outter !");
        ii  = new Inner();
    }

    class Inner {
        public Inner() {
            println("INner !");
        }
    }

    public static void main(String[] args) {
        TestInnerClass tt = new TestInnerClass();
    }
}
