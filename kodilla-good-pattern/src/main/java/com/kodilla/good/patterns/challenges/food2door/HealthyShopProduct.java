package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShopProduct implements Product {

    private int id;
    private String name;
    private String description;
    private double unitPrice;
    private String unitType;

    public HealthyShopProduct(int id, String name, String description, double unitPrice, String unitType) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.unitType = unitType;
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

    public String getUnitType() {
        return unitType;
    }


    @Override
    public String toString() {
        return "HealthyShopProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", unitType='" + unitType + '\'' +
                '}';
    }
}
