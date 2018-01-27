package com.kodilla.rps.movement;

import java.util.Random;

public final class MovementRandom extends Movement {
    @Override
    public String getMovement() {

        Random rnd = new Random();
        int v = rnd.nextInt(3);
        System.out.println("RANDOM: " + v);
        return movements[v];
    }


}