package com.chirs.designpattern.observer;

/**
 * Created by jianjianhong on 2018/5/26.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
