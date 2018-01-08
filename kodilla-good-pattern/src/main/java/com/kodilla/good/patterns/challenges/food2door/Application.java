package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producer.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.producer.HealthyShop;
import com.kodilla.good.patterns.challenges.food2door.producer.Producer;
import com.kodilla.good.patterns.challenges.food2door.product.ProductCatalog;
import com.kodilla.good.patterns.challenges.food2door.product.ProductsCatalogImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1. Pobieramy informacje o dostawcy, oraz ilości i rodzaju produktu,
2. Następnie każdy z producentów posiada metodę process(),
   która pozwala na zrealizowanie tego zamówienia w danym sklepie
3. Dalsza część również wygląda wszędzie tak samo, zwracane są informacje,
   czy udało się zrealizować zamówienie
*/
public class Application {

    public static void main(String[] args) {

        final List<Producer> producers = new ArrayList<>();

        final Producer producerExtraFoodShop = new ExtraFoodShop();
        final Producer producerHealthyShop = new HealthyShop();

        producers.add(producerExtraFoodShop);
        producers.add(producerHealthyShop);

        final ProductCatalog productsCatalog = new ProductsCatalogImp(producers);

        productsCatalog.orderProduct(1, 12);

        productsCatalog.orderProduct(4, 15);

        productsCatalog.orderProduct(55, 5);

    }
}
