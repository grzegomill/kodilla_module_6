package com.kodilla.rps.movement;

import java.util.Scanner;

public final class MovementByKey extends Movement {

    @Override
    public String getMovement() {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String ret = "";

        if (line != null) {

            if (line.equals("1")) {
                ret = ROCK;
            }
            if (line.equals("2")) {
                ret = PAPER;
            }
            if (line.equals("3")) {
                ret = SCISSORS;
            }


            if (line.equals("x")) {
                ret = EXIT;
            }

            if (line.equals("n")) {
                ret = REPEAT;
            }

        }

        return ret;
    }


}
