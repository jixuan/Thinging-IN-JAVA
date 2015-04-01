package com.jixuan.tij.innerclass;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/4/1.
 */
public class Parccel6 {
    public Distination distination(final String  str,final float price) {
        return new Distination() {
            private int cost;
/*instance initialization ,就像构造器一样*/
            {
                println("instance initialization");
                cost = Math.round(price);
                if (cost > 100) {
                    println("over the budget");
                }
            }
            private String label = str;
            @Override
            public String readLabel() {
                return label;
            }
        };

    }

    public static void main(String[] args) {
        Parccel6 p6 = new Parccel6();
        Distination dd = p6.distination("label", 213);
        println(dd.readLabel());
    }
}
