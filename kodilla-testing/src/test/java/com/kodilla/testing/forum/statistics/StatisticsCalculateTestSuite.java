package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculateTestSuite {

    private List<String> setTestUserNamesList(String str, int max) {
        final List<String> userNamesMax = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            userNamesMax.add(str + i);
        }
        return userNamesMax;
    }

    private void parametersTest(StatisticsCalculate statCalc, Statistics statisticsMock, int expUsers, int expPosts, int expComments) {

        // when
        when(statisticsMock.usersNames()).thenReturn(setTestUserNamesList("Test_", expUsers));
        when(statisticsMock.postsCount()).thenReturn(expPosts);
        when(statisticsMock.commentsCount()).thenReturn(expComments);

        statCalc.calculateAdvStatistics(statisticsMock);
        //then
        assertEquals(expUsers, statCalc.getUsersCount());
        assertEquals(expPosts, statCalc.getPostsCount());
        assertEquals(expComments, statCalc.getCommentCount());

        assertEquals(expPosts == 0 ? 0 : (double) expComments / expPosts, statCalc.getAvgCommentsPerPost(), 0.0);
        assertEquals(expUsers == 0 ? 0 : (double) expComments / expUsers, statCalc.getAvgCommentsPerUser(), 0.0);
        assertEquals(expUsers == 0 ? 0 : (double) expPosts / expUsers, statCalc.getAvgPostsPerUser(), 0.0);

        statCalc.showStatistics();
    }

    @Test
    public void testCalculateAdvStatistic() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculate statCalc = new StatisticsCalculate();

        //gdy liczba użytkowników = 0   - wszystko 0
        statCalc.calculateAdvStatistics(statisticsMock);
        assertEquals(0, statCalc.getUsersCount());

        //gdy liczba użytkowników = 100  - reszta dowolna
        this.parametersTest(statCalc, statisticsMock, 100, 55, 93);

        //gdy liczba postów = 0 - reszta dowolna
        this.parametersTest(statCalc, statisticsMock, 13, 0, 0);

        //gdy liczba komentarzy = 0 - reszta dowolna
        this.parametersTest(statCalc, statisticsMock, 37, 23, 0);

        //gdy liczba postów = 1000 - reszta dowolna
        this.parametersTest(statCalc, statisticsMock, 531, 1000, 1000);

        //gdy liczba komentarzy < liczba postów
        this.parametersTest(statCalc, statisticsMock, 422, 1000, 333);

        //gdy liczba komentarzy > liczba postów
        this.parametersTest(statCalc, statisticsMock, 7531, 321, 777);

    }
}
