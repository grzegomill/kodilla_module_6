package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TaskStudentQueueTestSuite {


    @Test
    public void testQueue() {

        //Given

        final TaskStudentQueue moduleOne = new ModuleOne("Moduł pierwszy.");
        final TaskStudentQueue moduleTwo = new ModuleTwo("Moduł drugi.");
        final TaskStudentQueue moduleThree = new ModuleThree("Moduł trzeci.");

        final Mentor mentorPawel = new Mentor("Paweł");
        final Mentor mentorLukasz = new Mentor("Lukasz");

        moduleOne.registerObserver(mentorPawel);

        moduleTwo.registerObserver(mentorPawel);
        moduleTwo.registerObserver(mentorLukasz);

        moduleThree.registerObserver(mentorLukasz);

        //When

        moduleOne.sendTask("Zadanie pierwsze wykonane!");
        moduleTwo.sendTask("Zadanie drugie przesłane do sprawdzenia!");
        moduleThree.sendTask("Proszę o sprzwdzenie trzeciego zadania!");

        moduleOne.sendTask("Zadanie pierwsze ponownie przesłane do sprawdzenia!");

        moduleThree.sendTask("Zadanie trzecie poprawione do sprawdzenia!");
        moduleThree.sendTask("Zadanie trzecie kolejny raz poprawione  proszę o sprawdzenia!");

        //Then

        assertEquals(3, mentorPawel.getTasksCount());
        assertEquals(4, mentorLukasz.getTasksCount());
    }
}
