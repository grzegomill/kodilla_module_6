package com.kodilla.good.patterns.challenges;

public final class ProductOrderService implements OrderService {

    @Override
    public boolean order(final User user, final Product product, final int quantity) {

        final double unitPrice = product.getPrice();

        System.out.println("Order product: " + product.getName() +
                ". Unit price: " + unitPrice +
                ". Quantity: " + quantity +
                ". Total price: " + unitPrice * quantity +
                " for user: " + user.getUserName());

        return true;
    }
}
