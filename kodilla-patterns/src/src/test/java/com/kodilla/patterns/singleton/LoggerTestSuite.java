package com.kodilla.patterns.singleton;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public final class LoggerTestSuite {

    @Test
    public void testGetLastLog() {

        //Given
        final String message = "test logowania";

        //When
        Logger.getInstance().log(message);

        //Then
        assertEquals(message, Logger.getInstance().getLastLog());
    }
}
