package com.kodilla.testing.shape;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;


public class ShapeCollectorTestSuite {

    private static int testCount = 0;

    @Before
    public void showTestNumber() {
        System.out.println("Test #" + ++testCount);
    }


    @Test
    public void testGetFigure() {

        final ShapeCollector shapeCollector = new ShapeCollector();
        final Shape square = new Square(2);
        final Shape circle = new Circle(5);
        final Shape triangle = new Triangle(10, 7);

        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        Shape shape1 = shapeCollector.getFigure(0);
        Shape shape2 = shapeCollector.getFigure(1);
        Shape shape3 = shapeCollector.getFigure(2);

        assertEquals(square, shape1);
        assertEquals(circle, shape2);
        assertEquals(triangle, shape3);

    }


    @Test
    public void testGetFigureFromEmptyShapeCollector() {

        final ShapeCollector shapeCollector = new ShapeCollector();
        final Shape squareReturned = shapeCollector.getFigure(0);

        assertEquals(null, squareReturned);

    }

    @Ignore
    @Test
    public void removeFigure() {
        final ShapeCollector shapeCollector = new ShapeCollector();
        final Shape square = new Square(2);
        final Shape circle = new Circle(5);
        final Shape triangle = new Triangle(10, 7);

        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        assertTrue(shapeCollector.removeFigure(square));
        assertTrue(shapeCollector.removeFigure(circle));
        assertTrue(shapeCollector.removeFigure(triangle));

        assertFalse(shapeCollector.removeFigure(square));
        assertFalse(shapeCollector.removeFigure(circle));
        assertFalse(shapeCollector.removeFigure(triangle));
    }


    @Test  // test Add, Remove and Show
    public void showFigures() {

        final ShapeCollector shapeCollector = new ShapeCollector();
        final Shape circle = new Circle(5);
        final Shape triangle = new Triangle(10, 7);
        final Shape square = new Square(2);


        assertTrue(shapeCollector.showFigures().equals(""));

        shapeCollector.addFigure(triangle);

        assertTrue(shapeCollector.showFigures().equals("Triangle"));

        shapeCollector.addFigure(circle);

        assertTrue(shapeCollector.showFigures().equals("Triangle Circle"));

        shapeCollector.addFigure(square);

        assertTrue(shapeCollector.showFigures().equals("Triangle Circle Square"));


        shapeCollector.removeFigure(triangle);

        assertTrue(shapeCollector.showFigures().equals("Circle Square"));

        shapeCollector.removeFigure(square);

        assertTrue(shapeCollector.showFigures().equals("Circle"));

        shapeCollector.removeFigure(circle);

        assertTrue(shapeCollector.showFigures().equals(""));


    }
}
