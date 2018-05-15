package com.chirs.designpattern.adapter;

import com.chirs.designpattern.utils.PrintUtil;

/**
 * Created by Admin on 2018/5/15.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        PrintUtil.print("quack");
    }

    @Override
    public void fly() {
        PrintUtil.print("I am fly");
    }
}
