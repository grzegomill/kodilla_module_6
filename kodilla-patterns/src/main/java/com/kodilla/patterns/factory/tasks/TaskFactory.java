package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("DrivingTask", "Warsaw", "car");
            case PAINTING:
                return new PaintingTask("PaintingTask", "green", "the wall");
            case SHOPPING:
                return new ShoppingTask("ShoppingTask", "phone", 1);
            default:
                return null;
        }

    }
}
