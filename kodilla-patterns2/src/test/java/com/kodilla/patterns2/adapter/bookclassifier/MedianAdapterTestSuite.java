package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.Assert.assertEquals;

public class MedianAdapterTestSuite {


    @Test
    public void publicationYearMedianTest() {

        //Given
        Set<BookA> bookSet = new HashSet<>();

        bookSet.add(new BookA("Adam Mickiewicz", "Pan tadeusz", 1834, "11111"));
        bookSet.add(new BookA("Aleksander Fredro", "Zemsta", 1838, "22222"));
        bookSet.add(new BookA("Bolesław Prus", "Katarynka", 1880, "33333"));
        bookSet.add(new BookA("Bolesław Prus", "Lalka", 1890, "44444"));
        bookSet.add(new BookA("Henryk Sienkiewicz", "Krzyżacy", 1900, "55555"));

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        System.out.println("Data publikacji mediana: " + median);
        assertEquals(median, 1880);
    }
}
