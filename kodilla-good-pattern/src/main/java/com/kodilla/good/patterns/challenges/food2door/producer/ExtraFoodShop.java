package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.order.Order;
import com.kodilla.good.patterns.challenges.food2door.product.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtraFoodShop implements Producer {

    private final String name = "ExtraFoodShop";

    private final Map<Integer, Product> productsMap = new HashMap<>();

    public ExtraFoodShop(int indexStart, List<Product> products) {

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

        if (order.getProduct().getId() == 3 && order.getQuantity() > 100) {
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
        return "ExtraFoodShop{" +
                "name='" + name + " } ";

    }
}
