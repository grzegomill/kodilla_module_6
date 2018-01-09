package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.order.Order;
import com.kodilla.good.patterns.challenges.food2door.product.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HealthyShop implements Producer {

    private final String name = "HealthyShop";

    private final Map<Integer, Product> productsMap = new HashMap<>();

    public HealthyShop(int indexStart, List<Product> products) {

        for (Product product : products) {
            productsMap.put(indexStart++, product);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean process(Order order) {
        if (order.getProduct().getId() == 6 && order.getQuantity() > 500) {
            return false;
        }

        return true;
    }

    @Override
    public Map<Integer, Product> retrieveProducts() {
        return productsMap;
    }

    @Override
    public String toString() {
        return "HealthyShop{" +
                "name='" + name +
                '}';
    }
}
