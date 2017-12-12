package com.kodilla.testing.shape;

public class Triangle implements Shape {

    final private String name = "Triangle";

    private double triangleBaseLength;
    private double triangleHeightLength;

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public Double getField() {
        return (1 / 2) * triangleBaseLength * triangleHeightLength;
    }

    public Triangle(double triangleBaseLength, double triangleHeightLength) {
        this.triangleBaseLength = triangleBaseLength;
        this.triangleHeightLength = triangleHeightLength;
    }
}
