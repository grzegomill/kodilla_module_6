package com.kodilla.good.patterns.challenges;

public final class ProductOrderRequest implements OrderRequest {

    final private User user;
    final private Product product;
    final private int quantity;

    public ProductOrderRequest(final User user, final Product product, final int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

}
