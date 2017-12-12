package com.kodilla.testing.shape;


public class Circle implements Shape {

    final private String name = "Circle";

    double radius;

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public Double getField() {
        return 2 * Math.PI * this.radius * this.radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
