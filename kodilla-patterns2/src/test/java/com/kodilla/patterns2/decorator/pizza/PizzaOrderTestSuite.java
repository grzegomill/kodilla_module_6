package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaBasicOrderCost() {

        //Given
        Order theOrder = new PizzaBasicOrder();

        // When
        BigDecimal calculateCost = theOrder.getCosts();

        //Then
        assertEquals(new BigDecimal(15), calculateCost);

    }

    @Test
    public void testPizzaBasicOrderDescription() {

        //Given
        Order theOrder = new PizzaBasicOrder();

        // When
        String description = theOrder.getDescription();

        //Then
        assertEquals("ciasto i sos pomidorowy z serem", description);

    }


    @Test
    public void testPizzaSupremeOrderCost() {

        //Given
        Order theOrder = new PizzaBasicOrder();
        theOrder = new PizzaSupremeOrderDecorator(theOrder);

        // When
        BigDecimal calculateCost = theOrder.getCosts();

        //Then
        assertEquals(new BigDecimal(20), calculateCost);

    }

    @Test
    public void testPizzaSupremeOrderDescription() {

        //Given
        Order theOrder = new PizzaBasicOrder();
        theOrder = new PizzaSupremeOrderDecorator(theOrder);
        // When
        String description = theOrder.getDescription();

        //Then
        assertEquals("ciasto i sos pomidorowy z serem + szynka, pieczarki", description);

    }


    @Test
    public void testPizzaExtraSupremeOrderCost() {

        //Given
        Order theOrder = new PizzaBasicOrder();
        theOrder = new PizzaSupremeOrderDecorator(theOrder);
        theOrder = new PizzaExtraSupremeOrderDecorator(theOrder);

        // When
        BigDecimal calculateCost = theOrder.getCosts();

        //Then
        assertEquals(new BigDecimal(27), calculateCost);

    }

    @Test
    public void testPizzaExtraSupremeOrderDescription() {

        //Given
        Order theOrder = new PizzaBasicOrder();
        theOrder = new PizzaSupremeOrderDecorator(theOrder);
        theOrder = new PizzaExtraSupremeOrderDecorator(theOrder);
        // When
        String description = theOrder.getDescription();

        //Then
        assertEquals("ciasto i sos pomidorowy z serem + szynka, pieczarki + oliwki, rukola", description);

    }
}
