package com.jixuan.tij.polymorphism;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/11.
 */
public class Mouse extends Rodent {
    public int tooth = 3;

    @Override
    public int getTooth() {
        return this.tooth;
    }

    public int getSuperTooth() {
        return super.tooth;
    }

    public static void beat() {
        println("mouse bbbbbbbeattttt ");
    }

    @Override
    public void eat() {
        println("Mouse eattttt");
    }

    public static void main(String[] args) {
        Rodent r = new Mouse();
        println(r.getTooth());
        println(r.tooth);//域的访问由编译器解析，因此不是多态的
        r.beat();//静态方法不具有多态性
        Mouse m = new Mouse();
        println(m.getTooth());
        println(m.getSuperTooth());
        println(m.tooth);
    }
}
