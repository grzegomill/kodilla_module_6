package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskStudentQueue implements Observable {

    private final List<Observer> observers;
    private final List<String> tasks;
    private final String queueName;

    public TaskStudentQueue(String queueName) {
        this.observers = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.queueName = queueName;
    }


    public void sendTask(String taskName) {
        tasks.add(taskName);

        notifyObservers(taskName);
    }


    @Override
    public void notifyObservers(String taskName) {

        for (Observer observer : observers) {

            observer.update(this, taskName);

        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getQueueName() {
        return queueName;
    }

}
