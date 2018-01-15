package com.kodilla.spring.portfolio;


import junit.framework.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static junit.framework.Assert.*;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        final ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        final Board board = context.getBean(Board.class);

        final TaskList doneList = board.getDoneList();
        final TaskList inProgressList = board.getInProgressList();
        final TaskList toDoList = board.getToDoList();

        doneList.addTask("done 1 task");
        inProgressList.addTask("in progress 1 task");
        toDoList.addTask("to do list 1 task");

        assertEquals("done 1 task", doneList.getTask(0));
        assertEquals("in progress 1 task", inProgressList.getTask(0));
        assertEquals("to do list 1 task", toDoList.getTask(0));
    }
}
