package com.jixuan.tij.holdingyourobjects;

import java.util.*;

import static com.jixuan.tij.util.Print.println;
import static com.jixuan.tij.util.Print.printnb;

/**
 * @author jixuan
 *         Create on 15/3/20.
 */
public class SimpleCollections {
    public static void main(String[] args) {
        Random random = new Random(47);
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        Queue<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
            set.add(random.nextInt(10));
            queue.add(i);
        }
        println(" list : ");
        for (Integer item : list) {
            printnb(item + " ");
        }
        println(" ");
        println(" set : ");
        for (Integer item : set) {
            printnb(item + " ");
        }
        println(" ");
        println(" queue : ");
        for (Integer item : queue) {
            printnb(item + " ");
        }
    }
}

