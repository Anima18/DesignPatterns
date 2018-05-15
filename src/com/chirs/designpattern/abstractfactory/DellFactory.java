package com.chirs.designpattern.abstractfactory;

/**
 * Created by Admin on 2018/5/13.
 */
public class DellFactory implements PCFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new DellKeybo();
    }
}
