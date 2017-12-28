package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        int[] numbers = {5, 2, 3, 4, 5, 16};

        double expectedValue = 5.833333333333333;
        double averageValue = ArrayOperations.getAverage(numbers);

        System.out.println("testGetAverage. Average: " + averageValue);

        Assert.assertEquals(expectedValue, averageValue, 0);

    }

    @Test
    public void testGetAverageEmptyArray() {

        int[] numbersEmpty = {};

        double expectedValue = 0.0;
        double averageValue = ArrayOperations.getAverage(numbersEmpty);

        System.out.println("testGetAverageEmptyArray. Average: " + averageValue);

        Assert.assertEquals(expectedValue, averageValue, 0);
    }
}
