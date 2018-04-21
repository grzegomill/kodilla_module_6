package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String mentorName;
    private int tasksCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TaskStudentQueue taskStudentQueue, String taskName) {


        System.out.println(
                mentorName
                        + " has new task for "
                        + taskStudentQueue.getQueueName()
                        + " Name: " + taskName + "\n "
                        + " (total:  " + taskStudentQueue.getTasks().size() + " tasks)"
        );


        tasksCount++;
    }


    public int getTasksCount() {
        return tasksCount;
    }
}
