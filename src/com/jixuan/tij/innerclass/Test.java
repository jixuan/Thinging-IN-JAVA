package com.jixuan.tij.innerclass;

import java.util.Arrays;

import static com.jixuan.tij.util.Print.println;
import static com.jixuan.tij.util.Print.printnb;

/**
 * @author jixuan
 *         Create on 15/3/23.
 */
public class Test {


    /*public static void main(String[] args) {
        Parcel p = new Parcel();
        p.ship("Tasmania");
        Parcel p2 = new Parcel();
     //   要在外部类之外的地方，创建内部类的对象，必须具体指明这个对象的类型：OutClassName.InnerClassName
        Parcel.Contents c = p2.contents();
        Parcel.Contents c2 = p2.new Contents();//用.new 来创建内部类对象
        Parcel.Distination d = p2.to("Borneo");
    }*/


    public static void main(String[] args) {
        Sequence s = new Sequence(3);
        Selector ss = s.sequenceSelector();
        for (int i = 0; i < 3; i++) {
            s.add(Integer.toString(i));
        }
        println(s);
        while (!ss.end()) {
            println(ss.current());
            ss.next();
        }
    }
}
