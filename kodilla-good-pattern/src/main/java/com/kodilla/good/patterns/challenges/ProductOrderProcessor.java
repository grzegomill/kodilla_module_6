package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor(final InformationService informationService,
                                 final OrderService orderService,
                                 final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public void setInformationService(InformationService informationService) {
        this.informationService = informationService;
    }

    public ProductOrderDto process(final OrderRequest orderRequest) {

        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getQuantity());

        if (isOrdered) {

            informationService.inform(orderRequest.getUser());

            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(),
                    orderRequest.getQuantity());

            return new ProductOrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);

        } else {

            return new ProductOrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);

        }
    }
}
