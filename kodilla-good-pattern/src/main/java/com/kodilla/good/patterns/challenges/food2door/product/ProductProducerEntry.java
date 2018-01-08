package com.kodilla.good.patterns.challenges.food2door.product;

import com.kodilla.good.patterns.challenges.food2door.producer.Producer;

public class ProductProducerEntry {

    private Product product;
    private Producer producer;

    public ProductProducerEntry(Product product, Producer producer) {
        this.product = product;
        this.producer = producer;
    }

    public Product getProduct() {
        return product;
    }

    public Producer getProducer() {
        return producer;
    }
}
