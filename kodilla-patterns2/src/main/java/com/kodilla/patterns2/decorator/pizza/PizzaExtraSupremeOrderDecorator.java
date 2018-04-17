package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaExtraSupremeOrderDecorator extends AbstractOrderDecorator {

    public PizzaExtraSupremeOrderDecorator(Order order) {
        super(order);
    }

    @Override
    public BigDecimal getCosts() {
        return super.getCosts().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + oliwki, rukola";
    }
}

