package com.nmuzychuk;

import java.util.ArrayList;
import java.util.List;

public class Feed implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(final Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(final Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
