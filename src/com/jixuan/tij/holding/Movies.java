package com.jixuan.tij.holding;

import java.util.*;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/5/9.
 */
public class Movies {
    private static MovieGenerator mg = new MovieGenerator();

    public static Collection<String> fill(Collection<String> collection, int size) {
        for (int i = 0; i < size; i++) {
            collection.add(mg.next());
        }
        return collection;
    }

    public static Map<Integer, String> fill(Map<Integer, String> map, int size) {
        for (int j = 0; j < size; j++) {
            map.put(j, mg.next());
        }
        return map;
    }


    public static void main(String[] args) {
        String[] strArrays = new String[12];
        for (int i = 0; i < 12; i++) {
            strArrays[i] = mg.next();
        }
        println(Arrays.toString(strArrays));
        println(fill(new ArrayList<String>(),12));
        println(fill(new LinkedList<String>(),12));
        println(fill(new HashSet<String>(),12));
        println(fill(new TreeSet<String>(),12));
        println(fill(new LinkedHashSet<String>(),12));
    }
}
