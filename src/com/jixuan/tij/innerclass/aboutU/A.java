package com.jixuan.tij.innerclass.aboutU;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/5/5.
 */
public class A {
    U getU() {
        return new U() {
            @Override
            public void method1() {
                println(" A method1");
            }

            @Override
            public void method2() {
                println(" A method2");
            }

            @Override
            public void method3() {
                println(" A method3");
            }
        };
    }
}
