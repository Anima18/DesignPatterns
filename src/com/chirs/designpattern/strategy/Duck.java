package com.chirs.designpattern.strategy;

/**
 * Created by Admin on 2018/5/27.
 */
public abstract class Duck {
    Duck() {}

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public abstract void display();

    public void swim() {
        System.out.println("all ducks can swim");
    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
