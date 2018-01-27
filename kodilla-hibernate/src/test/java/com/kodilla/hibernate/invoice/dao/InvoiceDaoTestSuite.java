package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    public ItemDao itemDao;
    @Autowired
    public InvoiceDao invoiceDao;
    @Autowired
    public ProductDao productDao;


    @Test
    public void testInvoiceDaoSave() {
        /*
        Napisz test , tóry sprawdza czy faktura z kilkoma pozycjami zapisuje się poprawnie w bazie danych
        Pamiętaj, że test musi być idempotentny (musi zostawiać bazę danych w stanie takim, w jakim ją zastał - bez nowych wpisów)
         */
        //Given
        Invoice invoice1 = new Invoice("NR-1-2018");

        Invoice invoice2 = new Invoice("NR-2-2018");

        Product prd1 = new Product("Kawa");

        Item item1 = new Item(
                invoice1,
                prd1, new BigDecimal("10"), 6, new BigDecimal("60"));


        prd1.getItems().add(item1);


        invoice1.getItems().add(item1);


        //When

        invoiceDao.save(invoice1);


        int id = invoice1.getId();

        //Then
        invoiceDao.delete(id);


    }
}
