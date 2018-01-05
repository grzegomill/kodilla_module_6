package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Producer {

    final private String name = "ExtraFoodShop";

    private Order order;

    @Override
    public String toString() {
        return "ExtraFoodShop{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean process() {

        if (order.getProduct().getId() == 10 && order.getQuantity() > 100) {
            return false;
        }

        return true;
    }

    @Override
    public Map<Integer, Product> retrieveProducts() {

        Map<Integer, Product> productsMap = new HashMap<>();

        productsMap.put(101, new ExtraFoodShopProduct(10, "Banana", " from Africa", 5));
        productsMap.put(201, new ExtraFoodShopProduct(20, "Kiwi", " from Africa", 2));
        productsMap.put(303, new ExtraFoodShopProduct(30, "Lemon", " from Africa", 7));

        return productsMap;
    }

    @Override
    public void setOrder(Order order) {
        this.order = order;
    }


}
