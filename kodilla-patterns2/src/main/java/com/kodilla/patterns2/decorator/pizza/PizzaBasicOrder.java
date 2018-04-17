package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaBasicOrder implements Order {
    @Override
    public BigDecimal getCosts() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "ciasto i sos pomidorowy z serem";
    }
}
