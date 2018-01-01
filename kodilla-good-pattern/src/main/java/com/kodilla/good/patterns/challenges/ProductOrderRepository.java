package com.kodilla.good.patterns.challenges;

public interface ProductOrderRepository {
    void createOrder(User user, Product product, int quantity);
}
