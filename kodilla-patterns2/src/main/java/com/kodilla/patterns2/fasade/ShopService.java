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


    public Long openOrder(long userId) {

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


    public void addItem(long orderId, long productId, double qty) {

        orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .forEach(o -> o.getItems().add(new Item(productId, qty)));

    }


    public boolean removeItem(long orderId, long productId) {

        return true;
    }


}
