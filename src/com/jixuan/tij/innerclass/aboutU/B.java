package com.jixuan.tij.innerclass.aboutU;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/5/5.
 */
public class B {
    private U[] lotsU = new U[10];
    private int i = 0;


    public void add(U u) {
        if (lotsU.length < 100) {
            lotsU[i] = u;
            i++;
        }
    }

    public void add(U[] uu) {
        if ((lotsU.length + uu.length) < 100) {
            for (int j = 0; j < uu.length; j++) {
                lotsU[i] = uu[j];
                i++;
            }
        }
    }

    public void emptyAll() {
        for (int k = 0; k < lotsU.length; k++) {
            lotsU[k] = null;
        }
    }

    public void getAll() {
        for (int k = 0; k < lotsU.length; k++) {
            println(k + " : ");
            lotsU[k].method1();
            lotsU[k].method2();
            lotsU[k].method3();
        }
    }
}
