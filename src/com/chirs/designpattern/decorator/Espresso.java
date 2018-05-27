package com.chirs.designpattern.decorator;

/**
 * Created by Admin on 2018/5/27.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}