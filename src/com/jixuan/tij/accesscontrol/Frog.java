package com.jixuan.tij.accesscontrol;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/9.
 */
public class Frog extends Amphibian {
    private String hindlimbs = "hind limbs";

    public void leap(){
        println("can leap");
    }

    public static void main(String[] args) {
        Amphibian a = new Amphibian();
        a.livingHabits(new Frog());
    }
}
