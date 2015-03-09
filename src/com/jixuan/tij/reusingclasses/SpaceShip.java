package com.jixuan.tij.reusingclasses;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/9.
 */
public class SpaceShip {
    private DirectionController directionController;
    private String name;
    protected int numAstronaut=3;

    public SpaceShip(String name) {
        this.directionController = new DirectionController("1.1.0");
        this.name = name;
    }

    public void toUp(int velocity) {
        println("to Up!");
        directionController.toUp(velocity);
    }
    public void toDown(int velocity) {
        println("to Down!");
        directionController.toDown(velocity);
    }
    public void toDiagonallyForward(){
        println("to Diagonally Forward");
        directionController.toLift(50);
        directionController.toForword(50);
    }

    public static void main(String[] args) {
        SpaceShip s = new SpaceShip("Explore");
        s.toDiagonallyForward();
    }
}
