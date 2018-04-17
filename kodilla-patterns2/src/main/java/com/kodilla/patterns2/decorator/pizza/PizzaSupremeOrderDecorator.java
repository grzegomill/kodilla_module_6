package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaSupremeOrderDecorator extends AbstractOrderDecorator {

    public PizzaSupremeOrderDecorator(Order order) {
        super(order);
    }

    @Override
    public BigDecimal getCosts() {
        return
                super
                        .getCosts()
                        .add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + szynka, pieczarki";
    }
}

