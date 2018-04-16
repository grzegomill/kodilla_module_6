package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicOrderCost() {

        //Given
        Order theOrder = new BasicOrder();

        // When
        BigDecimal calculateCost = theOrder.getCosts();

        //Then
        assertEquals(new BigDecimal(15), calculateCost);

    }

    @Test
    public void testBasicOrderDescription() {

        //Given
        Order theOrder = new BasicOrder();

        // When
        String description = theOrder.getDescription();

        //Then
        assertEquals("ciasto i sos pomidorowy z serem", description);

    }
}
