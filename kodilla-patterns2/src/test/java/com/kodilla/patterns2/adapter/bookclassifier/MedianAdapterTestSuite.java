package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.Assert.assertEquals;

public class MedianAdapterTestSuite {


    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();

        bookSet.add(new Book("Adam Mickiewicz", "Pan tadeusz", 1834, "11111"));
        bookSet.add(new Book("Aleksander Fredro", "Zemsta", 1838, "22222"));
        bookSet.add(new Book("Bolesław Prus", "Katarynka", 1880, "33333"));
        bookSet.add(new Book("Bolesław Prus", "Lalka", 1890, "44444"));
        bookSet.add(new Book("Henryk Sienkiewicz", "Krzyżacy", 1900, "55555"));

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        System.out.println("Data publikacji mediana: " + median);
        assertEquals(median, 1880);
    }
}
