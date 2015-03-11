package com.jixuan.tij.polymorphism;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/11.
 */
public class Sandwich extends PortableLunch{
    private Bread bread= new Bread();
    private Cheese c = new Cheese();
    private Lettuce lettuce = new Lettuce();

    public Sandwich() {
        println("Sandwich");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}

class Meal {
    public Meal() {
        println("Meal ");
    }
}

class Bread {
    public Bread() {
        println("Bread ");
    }
}

class Cheese {
    public Cheese() {
        println("Cheese  ");
    }
}

class Lettuce {
    public Lettuce() {
        println(" Lettuce");
    }
}

class Lunch extends Meal {
    public Lunch() {
        println(" Lunch");
    }
}

class PortableLunch extends Lunch {
    public PortableLunch() {
        println("portable lunch");
    }
}
/*调用构造器顺序：
* 1.调用基类的构造器
* 2.按声明顺序调用成员的初始化方法
* 3.调用导出类构造器主体*/