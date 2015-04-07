package com.jixuan.tij.innerclass;

import static com.jixuan.tij.util.Print.println;
import static com.jixuan.tij.util.Print.printnb;

/**
 * @author jixuan
 *         Create on 15/4/7.
 *         还是有限使用类，而不是接口
 */

public class Games {
    public static void playGame(GameFactories gameFactories) {
        Game game = gameFactories.getGame();
        while(game.move()){
            printnb("-->");
        }
        println(" ");
        println("game over");
    }

    public static void main(String[] args) {
        playGame(Checkers.gameFactories);
        playGame(Chess.gameFactories);
    }
}

interface GameFactories {
    Game getGame();
}

interface Game {
    boolean move();
}

class Chess implements Game {
    private int steps = 0;
    private static int MOVE = 4;
    public static GameFactories gameFactories = new GameFactories() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };

    private Chess() {
    }

    @Override
    public boolean move() {
        printnb("Chess move " + steps);
        return (++steps) != MOVE;
    }
}

class Checkers implements Game {

    private int steps = 0;
    private static int MOVE = 3;
    public static GameFactories gameFactories = new GameFactories() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };

    private Checkers() {
    }

    @Override
    public boolean move() {
        printnb("Checkers move " + steps);
        return (++steps) != MOVE;
    }
}
