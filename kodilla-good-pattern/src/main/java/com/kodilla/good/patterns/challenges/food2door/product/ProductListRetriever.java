package com.kodilla.good.patterns.challenges.food2door.product;

import com.kodilla.good.patterns.challenges.food2door.producer.Producer;
import com.kodilla.good.patterns.challenges.food2door.product.Product;

import java.util.Map;

public class ProductListRetriever {

    private final Map<Integer, Product> productsMap;

    public ProductListRetriever(Producer producer) {

        this.productsMap = producer.retrieveProducts();
    }

    public Map<Integer, Product> getProducts() {
        return productsMap;
    }
}
