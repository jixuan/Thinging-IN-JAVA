package com.jixuan.tij.innerclass.aboutU;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/5/5.
 */
public class B {
    private U[] lotsU;
    private int i = 0;

    public B(int size) {
        this.lotsU = new U[size];
    }

    public boolean add(U elem) {
        for(int i = 0; i < lotsU.length; i++) {
            if(lotsU[i] == null) {
                lotsU[i] = elem;
                return true;
            }
        }
        return false; // Couldn't find any space
    }
    public boolean setNull(int i) {
        if(i < 0 || i >= lotsU.length)
            return false; // Value out of bounds
        // (Normally throw an exception)
        lotsU[i] = null;
        return true;
    }

    public void setNulAll() {
        for (int k = 0; k < lotsU.length; k++) {
            lotsU[k] = null;
        }
    }

    public void callMethod() {
        for (int k = 0; k < lotsU.length; k++) {
            if (lotsU[k] != null) {
                println(k + " : ");
                lotsU[k].method1();
                lotsU[k].method2();
                lotsU[k].method3();
            }
        }
    }
}
