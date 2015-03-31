package com.jixuan.tij.innerclass;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/31.
 */
public class Parcel4 {
    public Contents contents(){
        return new Contents() {
            private int i=7;
            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel4 p4 = new Parcel4();
        Contents c = p4.contents();
        println(c.value());
    }
}
