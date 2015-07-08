package com.jixuan.tij.concurrent;

/**
 * @author jixuan
 * @DATE 15/7/7
 * @description The most basic use of the Thread class
 */

public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println(" Wait for Lift Off !");
        //start()方法迅速返回了，因为  Wait for Lift Off ! 消息在倒计时之前就出现了。
        //就是main线程启动了另一个线程去执行start，此时程序会同时运行两个方法
    }
}
