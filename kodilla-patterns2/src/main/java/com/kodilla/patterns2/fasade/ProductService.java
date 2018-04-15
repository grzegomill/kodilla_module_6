package com.kodilla.patterns2.fasade;

import java.math.BigDecimal;
import java.util.Random;

public class ProductService {


    public BigDecimal getPrice(Long productId) {

        Random generator = new Random();

        return new BigDecimal(generator.nextInt(10000 / 100));
    }
}
