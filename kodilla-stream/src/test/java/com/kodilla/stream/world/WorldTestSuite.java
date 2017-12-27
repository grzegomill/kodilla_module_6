package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        World earth = new World("Earth");

        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent america = new Continent("America");

        earth.addContinent(europe);
        earth.addContinent(america);
        earth.addContinent(asia);

        europe.addCountry(new Country("Poland", new BigDecimal("38476269")));
        europe.addCountry(new Country("France", new BigDecimal("67106161")));
        europe.addCountry(new Country("Germany", new BigDecimal("80594017")));

        america.addCountry(new Country("USA", new BigDecimal("326625791")));
        america.addCountry(new Country("Mexico", new BigDecimal("124574795")));
        america.addCountry(new Country("Canada", new BigDecimal("35623680")));

        asia.addCountry(new Country("China", new BigDecimal("1379302771")));
        asia.addCountry(new Country("Japan", new BigDecimal("126451398")));
        asia.addCountry(new Country("Russia", new BigDecimal("142257519")));

        BigDecimal worldPeopleQuantity = earth.getPeopleQuantity();

        BigDecimal expectedWorldPeopleQuantity = new BigDecimal("2321012401");

        Assert.assertEquals(expectedWorldPeopleQuantity, worldPeopleQuantity);


    }
}
