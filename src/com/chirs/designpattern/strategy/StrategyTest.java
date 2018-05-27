package com.chirs.designpattern.strategy;

/**
 * Created by Admin on 2018/5/27.
 */
public class StrategyTest {
    public static void main(String[] args) {
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        System.out.println();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

        System.out.println();

        System.out.println("I want that modelduck can fly");
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();


    }
}
