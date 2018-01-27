package com.kodilla.rps.player;

import com.kodilla.rps.movement.Movement;

public class PlayerImp implements Player {

    private String name;
    private int points;
    private Movement movement;

    public PlayerImp(String name, Movement movement) {
        this.points = 0;
        this.name = name;
        this.movement = movement;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public void addPoint() {

        points += 1;

    }

    @Override
    public String getMovement() {
        return movement.getMovement();
    }


}
