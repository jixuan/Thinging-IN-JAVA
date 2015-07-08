package com.jixuan.tij.concurrent;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 * @DATE 15/7/7
 * @description Demonstration of the Runnable interface
 */

public class LiftOff implements Runnable {

    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;//final 是希望一旦被初始化就不希望修改

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String statue() {
        return "# " + id + "( " + (countDown > 0 ? countDown+" )" : " Lift Off ! )");
    }

    @Override
    public void run() {
        //run方法通常会写成无限循环形式，除非有某种条件使得run终止，否则它将一直运行下去
        //比如开启某种鼠标的监控，就要一直监控下去
        while (countDown-- > 0) {
            println(statue());
            Thread.yield();//主动告诉线程调度器，我可以释放了
        }
    }
}
