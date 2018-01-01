package com.kodilla.good.patterns.challenges;

public class ProductOrderDto {
    private User user;
    private boolean flag;

    public ProductOrderDto(User user, boolean flag) {
        this.user = user;
        this.flag = flag;
    }
}
