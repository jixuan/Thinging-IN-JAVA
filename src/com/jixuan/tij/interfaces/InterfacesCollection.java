package com.jixuan.tij.interfaces;

/**
 * @author jixuan
 *         Create on 15/3/17.
 */
public class InterfacesCollection {

}

interface I1 {
    void f();
}

interface I2 {
    int f();
}

interface I3 {
    void f(int i);
}

interface I4 {
    int f(int i);
}

class C {
    public void f(int i) {
    }
}


/** C2 同时实现I1 I2 接口就会发现，里面有相同的方法（方法名和参数列表相同）
 * 在实现到时候，就会有冲突
 * class C2 implements I1, I2 {
 *  public void f() {｝
 * }
 */


/**
 * C3 这样是可以到相当于继承的来自C的方法f（int i） 相当于实现了接口I3的要求
 */
class C3 extends C implements I3 {

}

/**
 * C4 是一般的继承，子类包含父类的方法，同时也必须实现借口里的要求
 */
class C4 extends C implements I2 {

    @Override
    public int f() {
        return 0;
    }
}


/** C5 继承了C，就有了public void f(int i) 方法，然而I4 里面也有相同的方法（方法名和参数类型列表相同）int f(int i)
 * 但是两个方法的返回值不同，所以冲突
 * class C5 extends C implements I4 {
 * }
 */

