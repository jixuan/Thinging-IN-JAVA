package com.jixuan.tij.innerclass.parcel;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/4/1.
 */
public class Parcel5 {
    public String name = "123123";
    /*在匿名内部类中使用外部定义的对象，如果为参数，就需要设为final*/
    public Distination distination(final String str) {
        return new Distination() {
            //给一个内部类的字段赋值
            private String label = name;//访问外部类的成员
            private String label2 = str;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel5 p5 = new Parcel5();
        Distination dd = p5.distination("asd");
        println(dd.readLabel());
    }
}
