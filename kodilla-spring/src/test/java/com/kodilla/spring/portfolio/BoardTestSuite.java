package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;

@SpringBootTest
public final class BoardTestSuite {

    @Test
    public void testTaskChangeStatus() {

        //Given
        final ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        final Board board = context.getBean(Board.class);

        final String taskName = "Przerobić rozdział 11";

        // When

        assertTrue(board.addTaskToDo(taskName));

        // Then
        assertTrue(board.isToDo(taskName));

        assertTrue(board.setTaskAsInProgress(taskName));
        assertFalse(board.setTaskAsInProgress(taskName));

        assertTrue(board.isInProgress(taskName));
        assertFalse(board.isToDo(taskName));

        assertTrue(board.setTaskAsDone(taskName));
        assertFalse(board.setTaskAsDone(taskName));

        assertTrue(board.isDone(taskName));
        assertFalse(board.isInProgress(taskName));
        assertFalse(board.isToDo(taskName));

    }
}
