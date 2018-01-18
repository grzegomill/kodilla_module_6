package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask extends ExecutableTask {

    private String whatToBuy;
    private double quantity;

    public ShoppingTask(final String taskName, String whatToBuy, double quantity) {

        super(taskName);

        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    public String toString() {
        return this.getTaskName() + ". Buy " + whatToBuy + ". Quantity: " + quantity;
    }

}
