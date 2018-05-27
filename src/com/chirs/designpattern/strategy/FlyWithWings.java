package com.chirs.designpattern.strategy;

import com.chirs.designpattern.utils.PrintUtil;

/**
 * Created by Admin on 2018/5/27.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        PrintUtil.print("I fly with wings");
    }
}
