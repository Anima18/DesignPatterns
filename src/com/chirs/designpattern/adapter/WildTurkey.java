package com.chirs.designpattern.adapter;

import com.chirs.designpattern.utils.PrintUtil;

/**
 * Created by Admin on 2018/5/15.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        PrintUtil.print("gobble gobble");
    }

    @Override
    public void fly() {
        PrintUtil.print("I am fly a short");
    }
}
