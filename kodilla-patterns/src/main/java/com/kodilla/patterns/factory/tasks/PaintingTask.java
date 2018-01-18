package com.kodilla.patterns.factory.tasks;

public final class PaintingTask extends ExecutableTask {

    private String color;
    private String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {

        super(taskName);

        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    @Override
    public String toString() {
        return this.getTaskName() + ". Paint " + whatToPaint + " in " + color;
    }
}
