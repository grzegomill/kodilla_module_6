package com.kodilla.testing.shape;

public class Square implements Shape {

    final private String name = "Square";

    private double sideLength;

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public Double getField() {
        return this.sideLength * this.sideLength;
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
}
