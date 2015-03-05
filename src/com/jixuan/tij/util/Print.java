package com.jixuan.tij.util;

import java.io.PrintStream;

/**
 * @author jixuan
 *         Create on 15/3/5.
 */
public class Print {
    public static void println(Object object){
        System.out.println(object);
    }
    public static void println(){
        System.out.println();
    }
    public static void printnb(Object object){
        System.out.print(object);
    }
    public static PrintStream printf(String format,Object... args){
        return System.out.printf(format,args);
    }
}
