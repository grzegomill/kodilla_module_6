package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

/*
1. Pobieramy informacje o dostawcy, oraz ilości i rodzaju produktu,
2. Następnie każdy z producentów posiada metodę process(),
   która pozwala na zrealizowanie tego zamówienia w danym sklepie
3. Dalsza część również wygląda wszędzie tak samo, zwracane są informacje,
   czy udało się zrealizować zamówienie
*/
public class Application {

    public static void main(String[] args) {

        final ProductsCatalog productsCatalog = new ProductsCatalog();
        final Producer producerExtraFoodShop = new ExtraFoodShop();
        final Producer producerHealthyShop = new HealthyShop();

        Producer[] producers = {producerExtraFoodShop, producerHealthyShop};

        productsCatalog.updateProductsCatalog(producers);

        Map<Integer, Product> products = productsCatalog.getProductsByProducer(producerExtraFoodShop);


        producerExtraFoodShop.setOrder(new Order(products.get(101), 120));

        boolean result = producerExtraFoodShop.process();

        System.out.println("Order process result is " + result + ". -> " + producerExtraFoodShop.toString());


        products = productsCatalog.getProductsByProducer(producerHealthyShop);

        producerHealthyShop.setOrder(new Order(products.get(333), 12));

        boolean result1 = producerHealthyShop.process();

        System.out.println("Order process result is " + result1 + ". -> " + producerHealthyShop.toString());

    }
}
