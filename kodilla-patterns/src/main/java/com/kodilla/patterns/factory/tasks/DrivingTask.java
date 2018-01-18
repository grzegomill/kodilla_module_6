package com.kodilla.patterns.factory.tasks;

public final class DrivingTask extends ExecutableTask {

    private String where;
    private String using;

    public DrivingTask(final String taskName, final String where, final String using) {

        super(taskName);

        this.where = where;
        this.using = using;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }


    @Override
    public String toString() {
        return this.getTaskName() + ". To " + where + " by " + using;
    }
}
