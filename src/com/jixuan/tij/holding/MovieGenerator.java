package com.jixuan.tij.holding;

import java.util.Random;

/**
 * @author jixuan
 *         Create on 15/5/9.
 */
public class MovieGenerator {
    private Random random = new Random(47);
    private int flag = 0;
    private String[] movice = {"Idiots", "Black Swan", "The Shawshank Redemption", "Léon", "Forrest Gump", "Farewell My Concubine", "Life is Beautiful", "Wall E", "The Godefather", "Fight Club"};

    public String getRandomMovice() {
        switch (random.nextInt(10)) {
            default:
            case 0:
                return movice[0];
            case 1:
                return movice[1];
            case 2:
                return movice[2];
            case 3:
                return movice[3];
            case 4:
                return movice[4];
            case 5:
                return movice[5];
            case 6:
                return movice[6];
            case 7:
                return movice[7];
            case 8:
                return movice[8];
            case 9:
                return movice[9];

        }
    }

    public String next() {
        if (flag == 10) {
            flag = 0;
        }
        return movice[flag++];
    }
}
