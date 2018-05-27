package com.chirs.designpattern.strategy;

import com.chirs.designpattern.utils.PrintUtil;

/**
 * Created by Admin on 2018/5/27.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        PrintUtil.print("I fly no way");
    }
}
