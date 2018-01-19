package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public final class BigmacTestSuite {

    @Test
    public void testBigmac() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("sezam")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("sałata")
                .ingredient("cebula")
                .ingredient("bekon")
                .ingredient("pieczarki")
                .ingredient("ser")
                .ingredient("papryczki chilli")
                .build();

        System.out.println(bigmac);

        //When
        //Then
        assertEquals(6, bigmac.getIngredients().size());
        assertEquals(2, bigmac.getBurgers());
        assertEquals("sezam", bigmac.getRoll());
        assertEquals("barbecue", bigmac.getSauce());

    }

}
