package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {


    public List<Integer> exterminate(ArrayList<Integer> numbers) {

        final List<Integer> result = new ArrayList<>();

        for (Integer val : numbers) {

            if (val % 2 != 0) {
                result.add(val);
            }

        }

        return result;
    }
}
