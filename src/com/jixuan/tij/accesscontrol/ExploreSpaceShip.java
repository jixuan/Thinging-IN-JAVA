package com.jixuan.tij.accesscontrol;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/9.
 */
public class ExploreSpaceShip extends SpaceShip {
    public ExploreSpaceShip(String name) {
        super(name);
    }

    @Override
    public void toUp(int velocity) {
        println("to up " + velocity);
        super.toUp(velocity);
    }

    public void toUp() {
        println("to up zero");
        super.toUp(0);
    }

    @Override
    public void toDown(int velocity) {
        super.toDown(velocity);
    }

    @Override
    public void toDiagonallyForward() {
        super.toDiagonallyForward();
    }

    public static void main(String[] args) {
        ExploreSpaceShip e = new ExploreSpaceShip("Explore");
        e.toUp();
        e.toUp(12);
        println("num Astronaut : "+e.numAstronaut);
    }
}
