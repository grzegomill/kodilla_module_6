package com.kodilla.patterns2.observer.homework;

public interface Observable {


    void notifyObservers(String name);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

}
