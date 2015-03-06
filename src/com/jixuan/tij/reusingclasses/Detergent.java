package com.jixuan.tij.reusingclasses;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/6.
 */
public class Detergent extends Cleaner {
    private String name;

    public void getBasicInfo() {
//        println(s);
        println(ss);
        println(sss);
        dilute();
        apply();
        scrub();
        super.toString();
    }

    public Detergent() {
        println("Constructor Detergent");
        this.name = "Detergent";
    }

    public void append(String a) {
//        super.append(a);
        name += a;
    }

    @Override
    public String toString() {
        return "Detergent{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        println(detergent);
        detergent.getBasicInfo();
        println(detergent);
        Cleaner.main(args);
    }
}

class Cleaner {
    public String sss = "public String";
    protected String ss = "protected String";
    private String s;

    public Cleaner() {
        println("Constructor Cleaner");
        this.s = "Cleaner private";
    }

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append("dilute()");
    }

    public void apply() {
        append("apply()");
    }

    public void scrub() {
        append("scrub()");
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner();
        cleaner.dilute();
        cleaner.scrub();
        cleaner.apply();
        println(cleaner);
    }
}