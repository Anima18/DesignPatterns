package com.chirs.designpattern.decorator;

/**
 * Created by Admin on 2018/5/27.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage=beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }
    public double cost() {
        return 0.50+beverage.cost();
    }
}
