package com.chirs.designpattern.strategy;

/**
 * Created by Admin on 2018/5/27.
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("This is RedHeadDuck");
    }
}
