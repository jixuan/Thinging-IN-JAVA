package com.jixuan.tij.accesscontrol;

/**
 * @author jixuan
 *         Create on 15/3/5.
 */
class PublicScopeInPrivateClass {
    public String str = "PublicScopeInPrivateClass";
    public static String strStatic = "PublicScopeInPrivateClass";
    public String getStr(){
        return str;
    }
    public static String getStrStatic(){
        return strStatic;
    }
}
