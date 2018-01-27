package com.kodilla.rps;

import com.kodilla.rps.player.Player;

public final class RpsGame {

    private Player playerA;
    private Player playerB;


    public RpsGame(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;

    }

    public void updateScore() {

    }
/*
    public String getWinnerMovement(String mvA, String mvB) {

        String ret = "";

        //kamień zgniata nożyce,
        if (mvA.equals(ROCK) && mvB.equals(SCISSORS) || mvB.equals(ROCK) && mvA.equals(SCISSORS)) {
            ret = ROCK;
        }

        //nożyce tną papier,
        if (mvA.equals(SCISSORS) && mvB.equals(PAPER) || mvB.equals(SCISSORS) && mvA.equals(PAPER)) {
            return SCISSORS;
        }

        //papier przykrywa kamień,
        if (mvA.equals(PAPER) && mvB.equals(ROCK) || mvB.equals(PAPER) && mvA.equals(ROCK)) {
            return PAPER;
        }

        return ret;
    }*/

    public void start() {

        String playerA_Move;
        String playerB_Move;

        boolean end = false;

        while (!end) {

            playerA_Move = playerA.getMovement();
            playerB_Move = playerB.getMovement();

            System.out.println("A " + playerA_Move);
            System.out.println("B " + playerB_Move);
            if (playerB_Move.equals("EXIT")) {
                end = true;

            }


        }


    }
}

