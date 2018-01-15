package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;


final class TaskList {

    private final List<String> tasks;

    TaskList() {
        this.tasks = new ArrayList<>();
    }


    boolean addTask(String taskName) {

        return tasks.add(taskName);
    }

    boolean removeTask(String taskName) {

        return tasks.remove(taskName);
    }

    boolean contains(String taskName) {

        return tasks.contains(taskName);

    }
}
