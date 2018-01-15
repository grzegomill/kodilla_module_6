package com.kodilla.spring.forum;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public final class ForumUserTestSuite {

    @Test
    public void testGetUsername() {

        //Given
        final ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.forum");
        final ForumUser forumUser = context.getBean(ForumUser.class);

        //When
        final String userName = forumUser.getUsername();

        //Then
        assertEquals("John Smith", userName);

    }
}
