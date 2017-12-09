package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.List;

public class TestingMain {
    public static void main(String[] args) {

        final ArrayList<Integer> inputList = new ArrayList<>();
        final List<Integer> outputOddList;

        for (Integer i = 1; i < 101; i++) {
            System.out.println(i);
            inputList.add(i);
        }


        OddNumbersExterminator oddNumExt = new OddNumbersExterminator();

        outputOddList = oddNumExt.exterminate(inputList);

        for (Integer val : outputOddList) {

            System.out.println(val);

        }
    }
}