package com.jixuan.tij.innerclass;

import static com.jixuan.tij.util.Print.printnb;

/**
 * @author jixuan
 *         Create on 15/3/23.
 */
public class Test {
   /* public static void main(String[] args) {
        Parcel p = new Parcel();
        p.ship("Tasmania");
        Parcel p2 = new Parcel();
        *//*要在外部类之外的地方，创建内部类的对象，必须具体指明这个对象的类型：OutClassName.InnerClassName*//*
        Parcel.Contents c = p2.contents();
        Parcel.Distination d = p2.to("Borneo");
    }*/
   public static void main(String[] args) {
       Sequence sequence = new Sequence(10);
       for (int i = 0; i < 10; i++) {
           sequence.add(Integer.toString(i));
       }
       Selector selector = sequence.selector();
       while (!selector.end()) {
           printnb(selector.current() + " ");
           selector.next();
       }
   }
}
