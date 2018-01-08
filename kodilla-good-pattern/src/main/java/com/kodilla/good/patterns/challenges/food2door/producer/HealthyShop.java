package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.order.Order;
import com.kodilla.good.patterns.challenges.food2door.product.HealthyShopProduct;
import com.kodilla.good.patterns.challenges.food2door.product.Product;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Producer {

    final private String name = "HealthyShop";

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

        Map<Integer, Product> productsMap = new HashMap<>();

        productsMap.put(4, new HealthyShopProduct(10, "Mąka ryżowa", " opis", 3, "kg"));
        productsMap.put(5, new HealthyShopProduct(20, "Mleko", " opis", 4, "litr"));
        productsMap.put(6, new HealthyShopProduct(30, "Masło", " opis", 7, "sztuka"));

        return productsMap;
    }

    @Override
    public String toString() {
        return "HealthyShop{" +
                "name='" + name +
                '}';
    }
}
