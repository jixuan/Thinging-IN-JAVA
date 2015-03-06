package com.jixuan.tij.reusingclasses;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/6.
 */
public class ReferenceInitialization {
    public static void main(String[] args) {
        Bath bath = new Bath();
        println(bath);
    }
}

class Soap {
    private String s;

    public Soap() {
        println("I have a soap");
        s = "Constructor s ";
    }

    @Override
    public String toString() {
        return s;
    }
}

class Bath {
    private String
            s1 = "Water", s2 = "Happy", s3, s4;
    private Soap soap;
    private double time;

    public Bath() {
        println("take a Bath");
        soap = new Soap();
        this.s3 = "Jone";
    }

    {
        time = 60.23;
    }

    @Override
    public String toString() {
        if (s4==null)
            s4="with Sherlock";
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", soap=" + soap +
                ", time=" + time +
                '}';
    }
}