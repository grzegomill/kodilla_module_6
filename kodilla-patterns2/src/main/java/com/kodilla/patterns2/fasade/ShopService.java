package com.kodilla.patterns2.fasade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopService {

    private final List<Order> orders = new ArrayList<>();

    @Autowired
    private Authenticator authenticator;

    @Autowired
    private ProductService productService;


    public Long openOrder(Long userId) {

        if (authenticator.isAuthenticated(userId)) {

            Long maxOrder = (long) orders
                    .stream()
                    .mapToInt(o -> o.getOrderId().intValue())
                    .max()
                    .orElse(0);

            orders.add(new Order(maxOrder + 1, userId, productService));

            return maxOrder + 1;

        } else {

            return -1L;
        }
    }

}
