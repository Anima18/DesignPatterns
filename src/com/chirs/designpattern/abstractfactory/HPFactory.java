package com.chirs.designpattern.abstractfactory;

/**
 * Created by Admin on 2018/5/13.
 */
public class HPFactory implements PCFactory {
    @Override
    public Mouse createMouse() {
        return new HPMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new HPKeybo();
    }
}
