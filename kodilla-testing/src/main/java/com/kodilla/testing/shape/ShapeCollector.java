package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private final List<Shape> shapeCollector = new ArrayList<>();

    void addFigure(Shape shape) {

        this.shapeCollector.add(shape);

    }

    Shape getFigure(int n) {

        if (this.shapeCollector.size() - 1 < n) {
            return null;
        }

        return this.shapeCollector.get(n);
    }

    boolean removeFigure(Shape shape) {


        return this.shapeCollector.remove(shape);

    }


    String showFigures() {

        String show = "";

        for (Shape shape : this.shapeCollector) {

            if (show != "") {
                show += " " + shape.getShapeName();
            } else {
                show = shape.getShapeName();
            }
        }


        return show;

    }

}
