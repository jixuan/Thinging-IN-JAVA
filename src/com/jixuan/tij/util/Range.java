package com.jixuan.tij.util;

/**
 * @author jixuan
 *         Create on 15/3/5.
 */
public class Range {
    public static int[] range(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    public static int[] range(int start, int end) {
        int length = end - start + 1;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = i + start;
        }
        return result;
    }

    public static int[] range(int start, int end, int step) {
        int length = (end - start) / step + 1;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = start + i * step;
        }
        return result;
    }
}
