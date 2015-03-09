package com.jixuan.tij.reusingclasses;

import java.util.Arrays;
import java.util.Random;

import static com.jixuan.tij.util.Print.printf;
import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/9.
 */
public class FinalData {
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    static Random random = new Random(47);
    final int valueOne = 9;
    static final int STATIC_FINAL_VALUEONE = 99;
    final int ValueTwo = random.nextInt(20);
    static final int STATIC_FINAL_VALUEONE_RANDOM = random.nextInt(20);
    Value v1 = new Value(111);
    final Value v2 = new Value(222);
    static final Value v3 = new Value(333);
    int[] a1 = {1, 2, 3};
    final int[] a2 = {1, 2, 3,4,5,6};

    public static void main(String[] args) {

        /* final的基本数据类型不可以改变值 */

        for (int i = 0; i < 3; i++) {
            FinalData item = new FinalData(" test : " + i);
            println("final : " + item.valueOne);
            println("static final : " + item.STATIC_FINAL_VALUEONE);
            println("Final Random : " + item.ValueTwo);
            println("STATIC_FINAL_VALUEONE_RANDOM : " + item.STATIC_FINAL_VALUEONE_RANDOM);

            println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        FinalData tt = new FinalData("aaa");
        println("Value 1: "+tt.v1.i);
        tt.v1 = new Value(1);
        println("Value 1: "+tt.v1.i);
        println("Value 1 ++ : "+(++tt.v1.i));

        println("Value 2 : "+tt.v2.i);
//        tt.v2 = new Value(2);
        println("Value 2 ++ : "+(++tt.v2.i));

        println("Value 3 : "+tt.v3.i);
//        tt.v3 = new Value(2);
        println("Value 3 ++: "+(++tt.v3.i));
        println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        println(" a1 "+ Arrays.toString(tt.a1));
        tt.a1[1] = 5;
        println(" a1 "+ Arrays.toString(tt.a1));
        tt.a1 = new int[4];
        println(" a1 "+ Arrays.toString(tt.a1));

        println(" a2 "+ Arrays.toString(tt.a2));
        tt.a2[1] = 0;
        println(" a2 "+ Arrays.toString(tt.a2));
//        tt.a2 = new int[12];

    }
}

class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}