package com.chirs.designpattern.templatemethod;

import com.chirs.designpattern.utils.PrintUtil;

/**
 * Created by Admin on 2018/5/21.
 */
public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void brew() {
        PrintUtil.print("Dripping Tea through filter");
    }

    @Override
    protected void addCondiments() {
        PrintUtil.print("Adding Sugar with Milk");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return false;
    }
}
