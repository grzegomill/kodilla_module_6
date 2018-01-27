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

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    public InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        /*
        Napisz test , który sprawdza czy faktura z kilkoma pozycjami zapisuje się poprawnie w bazie danych
        Pamiętaj, że test musi być idempotentny (musi zostawiać bazę danych w stanie takim, w jakim ją zastał - bez nowych wpisów)
         */

        //Given
        Invoice invoice1 = new Invoice("NR-1-2018");

        Product prd1 = new Product("Kawa");
        Product prd2 = new Product("Herbata");
        Product prd3 = new Product("Piwo");

        Item item1 = new Item(prd1, new BigDecimal("10"), 6);
        Item item2 = new Item(prd2, new BigDecimal("20"), 7);
        Item item3 = new Item(prd3, new BigDecimal("30"), 1);

        prd1.getItems().add(item1);
        prd2.getItems().add(item2);
        prd3.getItems().add(item3);

        item1.setInvoice(invoice1);
        invoice1.getItems().add(item1);

        item2.setInvoice(invoice1);
        invoice1.getItems().add(item2);

        item3.setInvoice(invoice1);
        invoice1.getItems().add(item3);


        //When

        invoiceDao.save(invoice1);

        //Then
        Invoice invoice = invoiceDao.findByNumber("NR-1-2018");

        assertNotNull(invoice);

        assertEquals(3, invoice.getItems().size());

        //Clean Up
        int id = invoice1.getId();
        invoiceDao.delete(id);


    }
}
