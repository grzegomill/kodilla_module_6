package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {

        Map<BookSignature, BookB> booksB = new HashMap<>();

        Iterator<BookA> iterator = bookSet.iterator();

        while (iterator.hasNext()) {

            BookA bookA = iterator.next();

            booksB.put(new BookSignature(bookA.getSignature()),
                    new BookB(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear()
                    )
            );

        }

        return medianPublicationYear(booksB);
    }
}
