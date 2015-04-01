package com.jixuan.tij.innerclass;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/31.
 */
public class Parcel4 {
    /*匿名内部类实现接口*/
    public Contents contents() {
        return new Contents() {
            private int i = 7;

            @Override
            public int value() {
                return i;
            }
        };
    }

    /*匿名内部类重写方法*/
    public Wapping wapping(int x) {
        return new Wapping(x) {
            @Override
            public int value() {
                return (super.value() * 47);
            }
        };
    }

    public static void main(String[] args) {
        Parcel4 p4 = new Parcel4();
        Contents c = p4.contents();
        Wapping w = p4.wapping(23);
        println(c.value());
        println(w.value());
    }
}
