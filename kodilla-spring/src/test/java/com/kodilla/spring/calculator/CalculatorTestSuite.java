package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

@SpringBootTest
public class CalculatorTestSuite {


    @Test
    public void testCalculations() {

        final ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");

        final Calculator calculator = context.getBean(Calculator.class);

        final double valAdd = calculator.add(5, 7);
        final double valSub = calculator.sub(15, 7);
        final double valMul = calculator.mul(3, 5);
        final double valDiv = calculator.div(12, 4);

        assertEquals(12, valAdd, 0);
        assertEquals(8, valSub, 0);
        assertEquals(15, valMul, 0);
        assertEquals(3.0, valDiv, 0);


    }
}
