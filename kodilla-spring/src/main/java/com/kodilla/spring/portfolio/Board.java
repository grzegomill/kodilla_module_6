package com.kodilla.spring.portfolio;

public final class Board {

    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    boolean addTaskToDo(String taskName) {

        return toDoList.addTask(taskName);
    }

    boolean setTaskAsInProgress(String taskName) {

        return this.toDoList.removeTask(taskName) && this.inProgressList.addTask(taskName);

    }

    boolean setTaskAsDone(String taskName) {

        return this.inProgressList.removeTask(taskName) && this.doneList.addTask(taskName);

    }

    boolean isToDo(String taskName) {

        return toDoList.contains(taskName);
    }

    boolean isInProgress(String taskName) {

        return inProgressList.contains(taskName);
    }

    boolean isDone(String taskName) {

        return doneList.contains(taskName);
    }
}
