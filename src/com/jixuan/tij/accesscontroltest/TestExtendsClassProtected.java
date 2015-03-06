package com.jixuan.tij.accesscontroltest;

import com.jixuan.tij.accesscontrol.ExtendsClassProtected;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/5.
 */
public class TestExtendsClassProtected extends ExtendsClassProtected {

    public void test() {
        println("TestExtendsClassProtected   " + str3);
        getProtectedStr();
    }

    public static void main(String[] args) {
        TestExtendsClassProtected testExtendsClassProtected = new TestExtendsClassProtected();
        testExtendsClassProtected.test();
    }
}
