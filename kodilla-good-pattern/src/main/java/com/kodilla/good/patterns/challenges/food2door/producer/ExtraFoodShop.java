package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.order.Order;
import com.kodilla.good.patterns.challenges.food2door.product.ExtraFoodShopProduct;
import com.kodilla.good.patterns.challenges.food2door.product.Product;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Producer {

    final private String name = "ExtraFoodShop";

    @Override
    public String toString() {
        return "ExtraFoodShop{" +
                "name='" + name + " } ";

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

        Map<Integer, Product> productsMap = new HashMap<>();

        productsMap.put(1, new ExtraFoodShopProduct(10, "Banana", " from Africa", 5));
        productsMap.put(2, new ExtraFoodShopProduct(20, "Kiwi", " from Africa", 2));
        productsMap.put(3, new ExtraFoodShopProduct(30, "Lemon", " from Africa", 7));

        return productsMap;
    }


}
