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

    /*匿名内部类重写方法，wapping被当成公共接口来使用*/
    public Wapping wapping(int x) {
        return new Wapping(x) {
            /*x 被传递给基类的构造器，在匿名内部类中不被直接使用，所以不用为final*/
            /*匿名类没有构造器，因为根本没有名字*/
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
