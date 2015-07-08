package com.jixuan.tij.concurrent;

import java.util.Arrays;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 * @DATE 15/7/8
 * @description
 */

public class Fibonacci implements Runnable {
    private final int n;
    private int count;

    public Fibonacci(int i) {
        n = i;
    }

    private int next() {
        return getfib(count++);
    }

    @Override
    public void run() {
        Integer[] fib = new Integer[n];
        for (int i = 0; i < n; i++) {
            fib[i] = next();
        }
        println(Arrays.toString(fib));
    }

    private Integer getfib(int c) {
        if (c < 2) return 1;
        return getfib(c - 2) + getfib(c - 1);
    }

}
