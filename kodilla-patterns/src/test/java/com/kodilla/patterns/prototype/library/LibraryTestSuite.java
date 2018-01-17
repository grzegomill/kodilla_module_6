package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static junit.framework.Assert.assertEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //given
        Library libraryOriginal = new Library("Library original");

        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> libraryOriginal.books.add(
                        new Book("tytuł_" + n, "autor_" + n, LocalDate.of(2000 + n, n, n)
                        )));

        //shallow copy

        Library libraryShallowCopy = null;

        try {
            libraryShallowCopy = libraryOriginal.shallowCopy();
            libraryShallowCopy.setName("Library shallow");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy

        Library libraryDeepCopy = null;

        try {
            libraryDeepCopy = libraryOriginal.deepCopy();
            libraryDeepCopy.setName("Library deep");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //when
        //then

        assertEquals(10, libraryOriginal.books.size());
        assertEquals(10, libraryShallowCopy.books.size());

        libraryOriginal.books.remove(libraryOriginal.books.iterator().next());

        assertEquals(9, libraryOriginal.books.size());
        assertEquals(9, libraryShallowCopy.books.size());

        assertEquals(10, libraryDeepCopy.books.size());
    }
}
