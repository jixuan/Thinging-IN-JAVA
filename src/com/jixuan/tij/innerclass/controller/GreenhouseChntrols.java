package com.jixuan.tij.innerclass.controller;

/**
 * @author jixuan
 *         Create on 15/5/6.
 */
public class GreenhouseChntrols extends Controller {
    //下面三个变量都属于GreenhouseChntrols，而内部类LightOn，LightOff等可以直接访问这些字段，无需限定条件或特殊许可。
    //而且，内部类等action（）方法里，大多涉及到硬件的控制。
    private boolean light = false;
    private String theromostat = "DAY";
    private boolean water = false;

    public class LightOn extends Event {

        protected LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        public String toString() {
            return "Light on !";
        }
    }

    public class LightOff extends Event {

        protected LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        public String toString() {
            return "Light false !";
        }
    }

    public class WaterOn extends Event {

        protected WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        public String toString() {
            return "Water On !";
        }
    }

    public class WaterOff extends Event {

        protected WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        public String toString() {
            return "Water Off !";
        }
    }

    public class TheromostatDay extends Event {

        protected TheromostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            theromostat = "DAY";
        }

        public String toString() {
            return " theromostat day !";
        }
    }

    public class TheromostatNight extends Event {

        protected TheromostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            theromostat = "Night";
        }

        public String toString() {
            return " theromostat night !";
        }
    }

    public class Bell extends Event {

        protected Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        public String toString() {
            return " Bing !";
        }
    }

    public class Restart extends Event {
        private Event[] evernList;

        protected Restart(long delayTime, Event[] evernList) {
            super(delayTime);
            this.evernList = evernList;
            for (Event e : evernList) {
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for (Event ee : evernList) {
                ee.start();
                addEvent(ee);
            }
            start();
            addEvent(this);
        }

        public String toSting() {
            return "restart System";
        }
    }

    public static class Terminate extends Event {

        protected Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        public String toString() {
            return "System Terminate";
        }
    }
}
