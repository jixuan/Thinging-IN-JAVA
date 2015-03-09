package com.jixuan.tij.reusingclasses;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/9.
 */
public class Amphibian {

    public void livingHabits(Amphibian amphibian) {
        amphibian.breedInWater();
        amphibian.liveOnland();
    }

    public void liveOnland() {
        println("liveOnland");
    }

    public void breedInWater() {
        println("breedInWater");
    }
}
