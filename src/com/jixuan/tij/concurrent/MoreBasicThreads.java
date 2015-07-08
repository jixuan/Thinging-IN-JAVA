package com.jixuan.tij.concurrent;

/**
 * @author jixuan
 * @DATE 15/7/7
 * @description
 */

public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            new Thread(new LiftOff()).start();
        System.out.println("Wait for Lift Off !");
    }
}
