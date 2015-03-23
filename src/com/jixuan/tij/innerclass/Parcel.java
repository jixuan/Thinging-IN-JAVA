package com.jixuan.tij.innerclass;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/23.
 */
public class Parcel {
    class Contents {
        private int i = 1;

        public int value() {
            return i;
        }
    }

    class Distination {
        private String lable;

        public Distination(String lable) {
            this.lable = lable;
        }

        String readLable() {
            return lable;
        }
    }

    public Distination to(String s) {
        return new Distination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        /**创建内部类对象*/
        Contents c = contents();
        Distination d = to(dest);
        println(d.readLable());
    }

    public static void main(String[] args) {
        Parcel p = new Parcel();
        p.ship("Tasmania");
        /**只有在本包内才有下面的访问权限*/
        Parcel p2 = new Parcel();
        /*要在外部类之外的地方，创建内部类的对象，必须具体指明这个对象的类型：OutClassName.InnerClassName*/
        Contents c = p2.contents();
        Distination d = p2.to("Borneo");
        println(d.readLable());
    }
}
