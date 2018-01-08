package com.kodilla.good.patterns.challenges.food2door.producer;


import com.kodilla.good.patterns.challenges.food2door.order.Order;
import com.kodilla.good.patterns.challenges.food2door.product.Product;

import java.util.Map;

public interface Producer {

    String getName();

    Map<Integer, Product> retrieveProducts();

    boolean process(Order order);


}
