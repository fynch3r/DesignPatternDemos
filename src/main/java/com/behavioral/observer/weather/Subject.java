package com.behavioral.observer.weather;


import com.behavioral.observer.weather.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
