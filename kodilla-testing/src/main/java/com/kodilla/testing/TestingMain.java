package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        //SimpleUser test
        final SimpleUser simpleUser = new SimpleUser("theForumUser");
        final String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("SimpleUser test OK");
        } else {
            System.out.println("SimpleUser test Error!");
        }

        //Calculator test

        final int a = 5, b = 7;
        final Calculator calc = new Calculator();


        if (calc.add(a, b) == a + b) {
            System.out.println("Calculator.add test OK");
        } else {
            System.out.println("Calculator.add test Error!");
        }


        if (calc.subtract(a, b) == a - b) {
            System.out.println("Calculator.subtract test OK");
        } else {
            System.out.println("Calculator.subtract test Error!");
        }
    }
}