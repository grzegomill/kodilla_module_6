package com.kodilla.stream.lambda;

public class ExecutorSaySamothing implements Executor {

    @Override
    public void process() {
        System.out.println("This is an example text.");
    }
}
