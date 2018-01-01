package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {


    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(final InformationService informationService,
                                 final ProductOrderService rentalService,
                                 final ProductOrderRepository rentalRepository) {
        this.informationService = informationService;
        this.productOrderService = rentalService;
        this.productOrderRepository = rentalRepository;
    }

    public ProductOrderDto process(final ProductOrderRequest productOrderRequest) {
        boolean isOrdered = productOrderService.order(productOrderRequest.getUser(), productOrderRequest.getProduct(),
                productOrderRequest.getQuantity());

        if (isOrdered) {
            informationService.inform(productOrderRequest.getUser());
            productOrderRepository.createOrder(productOrderRequest.getUser(), productOrderRequest.getProduct(),
                    productOrderRequest.getQuantity());
            return new ProductOrderDto(productOrderRequest.getUser(), true);
        } else {
            return new ProductOrderDto(productOrderRequest.getUser(), false);
        }
    }
}
