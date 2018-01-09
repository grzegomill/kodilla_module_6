package com.kodilla.good.patterns.challenges.food2door;


import com.kodilla.good.patterns.challenges.food2door.producer.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.producer.HealthyShop;
import com.kodilla.good.patterns.challenges.food2door.producer.Producer;
import com.kodilla.good.patterns.challenges.food2door.product.*;

import java.util.ArrayList;
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
        final List<Product> productsE = new ArrayList<>();
        final List<Product> productsH = new ArrayList<>();

        productsE.add(new ExtraFoodShopProduct(10, "Banana", " from Africa", 5));
        productsE.add(new ExtraFoodShopProduct(20, "Kiwi", " from Africa", 2));
        productsE.add(new ExtraFoodShopProduct(30, "Lemon", " from Africa", 7));

        final Producer producerExtraFoodShop = new ExtraFoodShop(1001, productsE);


        productsH.add(new HealthyShopProduct(10, "Mąka ryżowa", " opis", 3, "kg"));
        productsH.add(new HealthyShopProduct(20, "Mleko", " opis", 4, "litr"));
        productsH.add(new HealthyShopProduct(30, "Masło", " opis", 7, "sztuka"));

        final Producer producerHealthyShop = new HealthyShop(2001, productsH);


        producers.add(producerExtraFoodShop);
        producers.add(producerHealthyShop);

        final ProductCatalog productsCatalog = new ProductsCatalogImp(producers);

        productsCatalog.orderProduct(1002, 12);

        productsCatalog.orderProduct(2003, 15);

        productsCatalog.orderProduct(55, 5);

    }
}
