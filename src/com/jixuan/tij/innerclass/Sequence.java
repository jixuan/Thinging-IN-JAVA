package com.jixuan.tij.innerclass;

/**
 * @author jixuan
 *         Create on 15/3/23.
 */
public class Sequence {
    private String name;
    private int next = 0;
    private Object[] items;

    public Sequence(int size, String name) {
        items = new Object[size];
        this.name = name;
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            /*选择器里可以访问外部类的私有变量*/
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
        }

        public String toString() {
            return name + " " + this.getClass().getSimpleName();
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }


}

interface Selector {
    boolean end();

    Object current();

    void next();

    String toString();
}
