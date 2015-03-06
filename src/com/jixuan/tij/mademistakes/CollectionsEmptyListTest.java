package com.jixuan.tij.mademistakes;

import java.util.Collections;
import java.util.List;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/6.
 */
public class CollectionsEmptyListTest {
    public static void main(String[] args) {
        List<String> testadd = Collections.emptyList();
        List<String> testadd2 = Collections.EMPTY_LIST;
        testadd.add("aaaaa");
//        这两种调用都不行，因为
//        Returns the empty list (immutable不可改变的). This list is serializable.
        println(testadd);
        println(testadd2);
    }
}
