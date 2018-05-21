package com.chirs.designpattern.templatemethod;

import com.chirs.designpattern.utils.PrintUtil;

/**
 * Created by Admin on 2018/5/21.
 */
public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    private void boilWater() {
        PrintUtil.print("Boiling water");
    }

    private void pourInCup() {
        PrintUtil.print("pouring into cup");
    }

    protected boolean customerWantsCondiments() {
        return true;
    }
}
