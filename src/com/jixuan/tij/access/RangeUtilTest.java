package com.jixuan.tij.access;

import java.util.Arrays;

import static com.jixuan.tij.util.Print.println;
import static com.jixuan.tij.util.Range.range;

/**
 * @author jixuan
 *         Create on 15/3/5.
 */
public class RangeUtilTest {
    public static void main(String[] args) {
        println(Arrays.toString(range(5)));
        println(Arrays.toString(range(3,10)));
        println(Arrays.toString(range(6,20,2)));
        println(Arrays.toString(range(5,20,2)));
    }
}
