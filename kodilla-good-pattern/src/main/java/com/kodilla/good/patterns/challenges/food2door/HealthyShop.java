package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Producer {

    final private String name = "HealthyShop";

    private Order order;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean process() {
        if (order.getProduct().getId() == 1000 && order.getQuantity() > 500) {
            return false;
        }

        return true;
    }

    @Override
    public Map<Integer, Product> retrieveProducts() {

        Map<Integer, Product> productsMap = new HashMap<>();

        productsMap.put(111, new HealthyShopProduct(1000, "Mąka ryżowa", " opis", 3, "kg"));
        productsMap.put(222, new HealthyShopProduct(2000, "Mleko", " opis", 4, "litr"));
        productsMap.put(333, new HealthyShopProduct(3000, "Masło", " opis", 7, "sztuka"));

        return productsMap;
    }

    @Override
    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "HealthyShop{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
