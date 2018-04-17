package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractOrderDecorator implements Order {

    private final Order order;

    protected AbstractOrderDecorator(Order order) {
        this.order = order;
    }


    @Override
    public BigDecimal getCosts() {
        return order.getCosts();
    }

    @Override
    public String getDescription() {
        return order.getDescription();
    }
}
