package com.jixuan.tij.polymorphism;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/11.
 */
public class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph(int radius) {
        this.radius = radius;
        println("RoundGlyph constructor , radius = " + radius);
    }

    @Override
    void draw() {
        println("RoundGlyph draw radius = "+radius);
    }

    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
/*在其他任何事务之前，将分配给对象的存储空间初始化成二进制的零。
* 在基类的构造方法种，调用动态绑定的方法，会向外深入到继承层次结构内部，它可以调用导出类的方法。*/