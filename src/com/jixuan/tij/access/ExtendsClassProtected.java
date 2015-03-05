package com.jixuan.tij.access;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/5.
 */
public class ExtendsClassProtected {
    private String str2 = "private str";
    protected String str3 = "protected str";
    protected void getProtectedStr(){
        println(str2);
        println(str3);
    }

}
