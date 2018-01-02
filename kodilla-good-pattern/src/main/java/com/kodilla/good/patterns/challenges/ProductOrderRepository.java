package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public void createOrder(User user, Product product, int quantity) {

        System.out.println("Save data to repository"
                + ". Quantity: " + quantity
                + " " + product.toString()
                + " " + user.toString()
                + "\n");
    }
}
