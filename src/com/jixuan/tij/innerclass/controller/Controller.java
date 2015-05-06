package com.jixuan.tij.innerclass.controller;

import java.util.ArrayList;
import java.util.List;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/5/6.
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();

    public void addEvent(Event event) {
        eventList.add(event);
    }

    public void run() {
        while (eventList.size() > 0) {
            for (Event e : new ArrayList<Event>(eventList)) {
                if (e.ready()) {
                    println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }

}
