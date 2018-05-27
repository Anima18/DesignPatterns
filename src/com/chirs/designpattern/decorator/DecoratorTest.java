package com.chirs.designpattern.decorator;

import com.chirs.designpattern.utils.PrintUtil;

/**
 * Created by Admin on 2018/5/27.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        beverage = new Whip(beverage);

        PrintUtil.print(beverage.getDescription() + ", costs is " + beverage.cost());
    }
}
