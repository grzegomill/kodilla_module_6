package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {


    @Test
    public void testCalculations() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");

        Calculator calculator = context.getBean(Calculator.class);

        double valAdd = calculator.add(5, 7);
        double valSub = calculator.sub(15, 7);
        double valMul = calculator.mul(3, 5);
        double valDiv = calculator.div(12, 4);

        Assert.assertEquals(12, valAdd, 0);
        Assert.assertEquals(8, valSub, 0);
        Assert.assertEquals(15, valMul, 0);
        Assert.assertEquals(3.0, valDiv, 0);


    }
}
