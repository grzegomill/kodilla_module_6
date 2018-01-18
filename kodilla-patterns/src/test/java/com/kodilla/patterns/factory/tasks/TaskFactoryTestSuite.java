package com.kodilla.patterns.factory.tasks;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;


public final class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.makeTask(TaskFactory.DRIVING);
        task.executeTask();

        System.out.println(task.toString() + ". Task done = " + task.isTaskExecuted());

        //Then
        assertEquals("DrivingTask. To Warsaw by car", task.toString());
        assertTrue(task.isTaskExecuted());

    }

    @Test
    public void testFactoryPaintingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.makeTask(TaskFactory.PAINTING);

        System.out.println(task.toString() + ". Task done = " + task.isTaskExecuted());

        //Then
        assertEquals("PaintingTask. Paint the wall in green", task.toString());

        assertFalse(task.isTaskExecuted());

        assertEquals("green", ((PaintingTask) task).getColor());
        assertEquals("the wall", ((PaintingTask) task).getWhatToPaint());
    }

    @Test
    public void testFactoryShoppingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.makeTask(TaskFactory.SHOPPING);
        task.executeTask();

        System.out.println(task.toString() + ". Task done = " + task.isTaskExecuted());

        //Then
        assertEquals("ShoppingTask. Buy phone. Quantity: 1.0", task.toString());
        assertTrue(task.isTaskExecuted());

    }
}
