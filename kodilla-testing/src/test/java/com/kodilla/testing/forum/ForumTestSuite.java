package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @Test
    public void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        //When
        String result = simpleUser.getUsername();
        //Then
        Assert.assertEquals("theForumUser", result);

        System.out.println("testCaseUsername");
    }


    @Test

    public void testCaseUsername2() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        //When
        String result = simpleUser.getUsername();
        //Then
        Assert.assertFalse(false);
        Assert.assertTrue(true);
        Assert.assertNotEquals("theForumUser test", result);

        System.out.println("testCaseUsername2");
    }

    @BeforeClass
    static public void printBefore(){
        System.out.println("start test");
    }

   @AfterClass
    static public void printAfter(){
        System.out.println("end test");
    }
}
