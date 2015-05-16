package com.jixuan.tij.holding;

import java.util.*;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/5/9.
 */
public class PrintingContainers {
    static Collection<String> fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map<String, String> fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Kitten");
        map.put("dog", "Lucis");
        map.put("dog", "Bosco");
        return map;
    }

    public static void main(String[] args) {
        println("ArrayList : "+fill(new ArrayList<String>()));
        println("LinkedList : "+fill(new LinkedList<String>()));
        println("HashSet : "+fill(new HashSet<String>()));
        println("TreeSet : "+fill(new TreeSet<String>()));
        println("LinkedHashSet : "+fill(new LinkedHashSet<String>()));
        println("HashMap : "+fill(new HashMap<String, String>()));
        println("TreeMap : "+fill(new TreeMap<String, String>()));
        println("LinkedHashMap : "+fill(new LinkedHashMap<String, String>()));
    }
}
