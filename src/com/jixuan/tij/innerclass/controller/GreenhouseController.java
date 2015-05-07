package com.jixuan.tij.innerclass.controller;

/**
 * @author jixuan
 *         Create on 15/5/7.
 */
public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseChntrols gc = new GreenhouseChntrols();
        gc.addEvent(gc.new Bell(90000));
        Event[] list = {gc.new TheromostatDay(0), gc.new WaterOn(20000), gc.new WaterOff(40000), gc.new LightOn(60000), gc.new LightOff(80000), gc.new TheromostatNight(140000)};
        gc.addEvent(gc.new Restart(200000, list));
//        if (args.length == 1)
//            gc.addEvent(new GreenhouseChntrols.Terminate(new Integer(args[0])));
        gc.run();

    }
}
