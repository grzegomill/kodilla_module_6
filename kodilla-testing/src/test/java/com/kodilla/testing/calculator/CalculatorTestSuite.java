package com.kodilla.testing.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTestSuite {

    private Calculator calculator;
    static int i = 0;

    @Before
    public void beforeTest() {
        System.out.println("Starting tests: #"+ ++i);
        calculator = new Calculator();

    }

    @Test
    public void testAdd() {

        Assert.assertTrue(calculator.add(5, 7) == (5 + 7));
    }

    //@Ignore
    @Test
    public void testSubtract() {

        Assert.assertTrue(calculator.subtract(5, 7) == (5 - 7));
    }

}
