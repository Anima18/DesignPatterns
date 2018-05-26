package com.chirs.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jianjianhong on 2018/5/26.
 */
public class WeatherData implements Subject {

    private List<Observer> observerList;
    private Weather weather;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observerList.contains(o)) {
            observerList.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList) {
            observer.update(this, weather);
        }
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
        notifyObservers();
    }
}
