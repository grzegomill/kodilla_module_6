package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {

        //Given
        TaskList taskList = new TaskList("To do", "Description test 1");

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();

        List<TaskList> taskListFound = taskListDao.findByListName("To do");

        assertEquals("Description test 1", taskListFound.get(0).getDescription());

        //Clean up
        taskListDao.delete(id);


    }
}
