package org.example;

public interface QuackObservable {

    void registerObserver(Observer observer);
    void notifyObservers();
}
