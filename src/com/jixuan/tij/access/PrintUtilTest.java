package com.jixuan.tij.access;

import static com.jixuan.tij.util.Print.*;

/**
 * @author jixuan
 *         Create on 15/3/5.
 */
public class PrintUtilTest {
    public static void main(String[] args) {
        println("this is Print Util Test");
        printnb(123.1231);
        println();
        printf("%c  %d",'a',-3);
        println();
        printf("%d",-1);
        println();
        printf("%f",-1.123);
        println();
        printf("%o",-1);
        println();
        printf("%s", "字符串");
    }
}
