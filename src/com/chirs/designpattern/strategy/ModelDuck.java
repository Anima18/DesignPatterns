package com.chirs.designpattern.strategy;

/**
 * Created by Admin on 2018/5/27.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        this.quackBehavior = new Squeak();
        this.flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("This is ModelDuck");
    }
}
