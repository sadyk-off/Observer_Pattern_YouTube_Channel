package com.company.interfaces;

public interface IObservable {
    void toAdd(IObserver observer);
    void toRemove(IObserver observer);
    void toNotify();
}
