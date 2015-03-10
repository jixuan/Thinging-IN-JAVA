package com.jixuan.tij.reusingclasses;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/10.
 */
public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        println("Beetle constructor");
        println(" k = " + k);
        println(" j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized ");

    public static void main(String[] args) {
        Beetle b = new Beetle();
    }
}

class Insect {
    private int i = 9;
    protected int j;

    public Insect() {
        println("Insect constructor");
        println(" i = " + i + " j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized ");

    static int printInit(String s) {
        println(s);
        return 47;
    }
}
/*文件的加载和初始化是两回事，运行时，先加载相关文件，发现有基类，加载基类
* 然后，根基类中的static初始化，然后是导出类中的static
* 到此加载完成。下面是创建对象：
* 首先：对象中所有基本类型都被设置为默认值，对象引用为null
* 然后：基类的构造器被调用，实例变量按次序被初始化，然后构造器的其他部分被执行
*/