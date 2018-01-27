package com.kodilla.rps.movement;

public abstract class Movement {

    public final static String EXIT = "EXIT";
    final static String ROCK = "ROCK";
    final static String PAPER = "PAPER";
    final static String SCISSORS = "SCISSORS";
    protected final static String[] movements = {ROCK, PAPER, SCISSORS};
    public static String REPEAT = "REPEAT";

    public abstract String getMovement();


}
