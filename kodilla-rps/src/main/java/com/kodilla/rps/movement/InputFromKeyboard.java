package com.kodilla.rps.movement;

import java.util.Scanner;

public class InputFromKeyboard {

    public String getString(String msg) {

        System.out.println(msg);

        return
                new Scanner(System.in)
                        .next();

    }

    public int getInt(String msg) {

        System.out.println(msg);

        return
                new Scanner(System.in)
                        .nextInt();

    }
}
