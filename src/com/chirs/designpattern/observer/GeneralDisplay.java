package com.chirs.designpattern.observer;

import com.chirs.designpattern.utils.PrintUtil;

/**
 * Created by Admin on 2018/5/26.
 */
public class GeneralDisplay implements Observer {

    public GeneralDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(Subject subject, Object o) {
        Weather weather = (Weather)o;
        display(weather);
    }

    private void display(Weather weather) {
        PrintUtil.print("GeneralDisplay: "+weather.toString());
    }
}
