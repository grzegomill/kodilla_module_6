package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class ProductListRetriever {

    final private Map<Integer, Product> productsMap;

    public ProductListRetriever(Producer producer) {

        this.productsMap = producer.retrieveProducts();
    }

    public Map<Integer, Product> getProducts() {
        return productsMap;
    }
}
