package com.jixuan.tij.concurrent;

/**
 * @author jixuan
 * @DATE 15/7/7
 * @description
 */

public class GenFibMain {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            new Thread(new Fibonacci(i)).start();
        }
    }
}
