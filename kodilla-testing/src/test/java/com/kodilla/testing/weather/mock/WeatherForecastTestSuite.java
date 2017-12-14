package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class WeatherForecastTestSuite {

    HashMap<Integer, Double> temperaturesMap;

    @Before
    public void initialize() {
        temperaturesMap = new HashMap<Integer, Double>();
        temperaturesMap.put(0, 25.5);
        temperaturesMap.put(1, 26.2);
        temperaturesMap.put(2, 24.8);
        temperaturesMap.put(3, 25.2);
        temperaturesMap.put(4, 26.1);
    }

    @Test
    public void testCalculateForecastWithMock() {


        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);


        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);


        //When

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assert.assertEquals(5, quantityOfSensors);
    }
}
