package com.chirs.designpattern.decorator;

/**
 * Created by Admin on 2018/5/27.
 */
public abstract class Beverage {
    String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}