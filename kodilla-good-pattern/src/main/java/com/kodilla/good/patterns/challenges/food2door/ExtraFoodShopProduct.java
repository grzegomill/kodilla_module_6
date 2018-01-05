package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShopProduct implements Product {

    private int id;
    private String name;
    private String description;
    private double unitPrice;

    public ExtraFoodShopProduct(int id, String name, String description, double unitPrice) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return "ExtraFoodShopProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
