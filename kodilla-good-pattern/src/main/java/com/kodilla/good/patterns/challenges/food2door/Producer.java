package com.kodilla.good.patterns.challenges.food2door;


import java.util.Map;

public interface Producer {

    String getName();

    Map<Integer, Product> retrieveProducts();

    void setOrder(Order order);

    boolean process();
}
