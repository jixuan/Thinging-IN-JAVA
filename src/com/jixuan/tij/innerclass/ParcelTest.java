package com.jixuan.tij.innerclass;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/31.
 */
public class ParcelTest {
    public static void main(String[] args) {
        Parcel p = new Parcel();
        Contents c = p.contents();
        Contents c2 = p.new PContents();//用.new 来创建内部类对象,只有内部类不为私有时，而且测试类对PCon有访问全线时
        println(c.value());
        Distination d = p.distination("Yosemite");
        println(d.readLabel());
        p.tuch();
    }
}
