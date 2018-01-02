package com.kodilla.good.patterns.challenges;

public final class ProductOrderDto {

    final private User user;
    final private Product product;
    final private boolean isOrdered;

    public ProductOrderDto(final User user, final Product product, final boolean isOrdered) {
        this.user = user;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
