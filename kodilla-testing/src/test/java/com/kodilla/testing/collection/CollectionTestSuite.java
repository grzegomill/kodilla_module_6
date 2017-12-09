package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class CollectionTestSuite {

    private ArrayList<Integer> inputList;
    private List<Integer> outputOddList;
    private OddNumbersExterminator oddNumExt;
    private String testName;

    @Before
    public void beforeTest() {
        inputList = new ArrayList<>();
        oddNumExt = new OddNumbersExterminator();
    }

    @After
    public void afterTest() {
        System.out.println("Test: " + testName);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        testName = "testOddNumbersExterminatorEmptyList  test done";
        outputOddList = oddNumExt.exterminate(inputList);
        Assert.assertTrue(" testOddNumbersExterminatorEmptyList failed", outputOddList.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        testName = "testOddNumbersExterminatorNormalList test done";

        inputList.add(1);
        inputList.add(3);
        inputList.add(5);

        outputOddList = oddNumExt.exterminate(inputList);
        Assert.assertTrue(" testOddNumbersExterminatorNormalList 1 test failed", outputOddList.toString().equals("[1, 3, 5]"));

        inputList.clear();
        inputList.add(2);
        inputList.add(4);
        inputList.add(6);

        outputOddList = oddNumExt.exterminate(inputList);
        Assert.assertTrue(" testOddNumbersExterminatorNormalList 2 test failed", outputOddList.isEmpty());

        inputList.clear();
        inputList.add(1);
        inputList.add(3);
        inputList.add(5);
        inputList.add(2);
        inputList.add(4);
        inputList.add(6);

        outputOddList = oddNumExt.exterminate(inputList);
        Assert.assertTrue(" testOddNumbersExterminatorNormalList 1 test failed", outputOddList.toString().equals("[1, 3, 5]"));

    }
}


