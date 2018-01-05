package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class ProductsCatalog {

    private Map<String, Map<Integer, Product>> productsCatalog = new HashMap<>();

    public void updateProductsCatalog(Producer[] producers) {

        ProductListRetriever productListRetriever;

        for (Producer producer : producers) {

            productsCatalog.put(producer.getName(), new ProductListRetriever(producer).getProducts());

        }

    }

    public Map<Integer, Product> getProductsByProducer(Producer producer) {

        return productsCatalog.get(producer.getName());
    }
}