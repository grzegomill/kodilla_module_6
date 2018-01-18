package com.kodilla.patterns.factory.tasks;

class ExecutableTask implements Task {

    private boolean isTaskExecuted;
    private String taskName;

    ExecutableTask(String taskName) {
        this.taskName = taskName;
        this.isTaskExecuted = false;
    }

    @Override
    public void executeTask() {
        this.isTaskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return this.isTaskExecuted;
    }
}
