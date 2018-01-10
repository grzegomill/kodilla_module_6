package com.kodilla.good.patterns.challenges.food2door.product;

import com.kodilla.good.patterns.challenges.food2door.order.Order;
import com.kodilla.good.patterns.challenges.food2door.producer.Producer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsCatalogImp implements ProductCatalog {

    private Map<Integer, ProductProducerEntry> productsCatalog = new HashMap<>();

    public ProductsCatalogImp(List<Producer> producers) {

        for (Producer producer : producers) {

            Map<Integer, Product> productMap = new ProductListRetriever(producer).getProducts();

            for (Map.Entry<Integer, Product> entry : productMap.entrySet()) {

                productsCatalog.put(entry.getKey(),
                        new ProductProducerEntry(entry.getValue(), producer));
            }
        }
    }

    @Override
    public boolean orderProduct(int productId, int quantity) {

        Producer producer = getProducerByProductId(productId);

        Product product = getProductProductId(productId);

        boolean result = false;

        if (producer != null && product != null) {

            result = producer.process(new Order(product, quantity));
            System.out.println("Order process result is " + result
                    + ". Producer: " + producer.getName()
                    + ", Product: " + product.toString()
                    + ", Quantity: " + quantity
                    + ", Total price: " + quantity * product.getUnitPrice());
        } else {
            System.out.println("Product id: " + productId + " not found !");
        }

        return result;

    }

    private Product getProductProductId(int productId) {

        if (productsCatalog.containsKey(productId)) {
            return productsCatalog.get(productId).getProduct();
        }

        return null;
    }

    private Producer getProducerByProductId(int productId) {

        if (productsCatalog.containsKey(productId)) {
            return productsCatalog.get(productId).getProducer();
        }
        return null;

    }
}