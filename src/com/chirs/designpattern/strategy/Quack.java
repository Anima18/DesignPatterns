package com.chirs.designpattern.strategy;

import com.chirs.designpattern.utils.PrintUtil;

/**
 * Created by Admin on 2018/5/27.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        PrintUtil.print("Quack quack");
    }
}
