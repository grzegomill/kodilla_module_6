package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetrieverImpl implements OrderRequestRetriever {

    final private List<OrderRequest> orderRequests;
    private int index;

    public OrderRequestRetrieverImpl() {

        orderRequests = new ArrayList<>();

        orderRequests.add(
                new ProductOrderRequest(
                        new User("JanuszB", "januszb@kodilla.com", null, PreferredContactType.EMAIL),
                        new Product("Star Wars: Battlefront II", "PC 2017 ...", 150),
                        1));

        orderRequests.add(
                new ProductOrderRequest(
                        new User("KrystynaM", null, "48111000000", PreferredContactType.SMS),
                        new Product("Niebieskie Kapcie", "Rozmiar 40 ...", 35),
                        3));

        orderRequests.add(
                new ProductOrderRequest(
                        new User("CelinaS", "CelinaS@kodilla.com", "48999000000", PreferredContactType.EMAIL),
                        new Product("Elektryczna szczoteczka do zębów", " Zielona + ładowarka ...", 200),
                        3));

    }

    @Override
    public OrderRequest getFirst() {
        return orderRequests.get(this.index = 0);
    }

    @Override
    public OrderRequest getNext() {

        return (++this.index >= orderRequests.size() ? null : orderRequests.get(this.index));

    }
}
