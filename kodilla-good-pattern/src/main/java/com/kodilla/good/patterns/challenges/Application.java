package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        final OrderRequestRetriever orderRequestRetriever = new OrderRequestRetrieverImpl();

        InformationService informationService = new EmailService();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(
                informationService, new ProductOrderService(), new ProductOrderRepository());

        OrderRequest orderRequest = orderRequestRetriever.getFirst();

        while (orderRequest != null) {

            switch (orderRequest.getUser().getPreferredContact()) {
                case SMS:
                    informationService = new SmsService();
                    break;
                case EMAIL:
                    informationService = new EmailService();
                    break;
            }

            productOrderProcessor.setInformationService(informationService);
            productOrderProcessor.process(orderRequest);

            orderRequest = orderRequestRetriever.getNext();
        }
    }
}
