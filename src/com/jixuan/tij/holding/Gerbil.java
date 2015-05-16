package com.jixuan.tij.holding;

import java.util.ArrayList;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/5/9.
 */
public class Gerbil {
    private static int  count=0;
    private final int gerbilNumber=count++;
    public Gerbil() {
        println(" there is another gerbil , gerbilNumber is "+gerbilNumber);
    }

    public void hop() {
        println(gerbilNumber + " Gerbil is hopping ~~");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        gerbils.add(new Gerbil());
        gerbils.add(new Gerbil());
        gerbils.add(new Gerbil());
        gerbils.add(new Gerbil());
        gerbils.add(new Gerbil());
        for (Gerbil gg : gerbils) {
            gg.hop();
        }
        println(" the number of gerbils is "+count);

    }
}
