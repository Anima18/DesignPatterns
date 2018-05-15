package com.chirs.designpattern.abstractfactory;

/**
 * Created by Admin on 2018/5/13.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        PCFactory dellFactory = new DellFactory();
        dellFactory.createKeybo().keypress();
        dellFactory.createMouse().rightClick();

        PCFactory hpFactory = new HPFactory();
        hpFactory.createKeybo().keypress();
        hpFactory.createMouse().rightClick();
    }
}
