package com.jixuan.tij.accesscontrol;

/**
 * @author jixuan
 *         Create on 15/3/5.
 */
public class Test {
    public static void main(String[] args) {
        PublicScopeInPrivateClass publicScopeInPrivateClass = new PublicScopeInPrivateClass();
        String str = publicScopeInPrivateClass.getStr();
    }
}
