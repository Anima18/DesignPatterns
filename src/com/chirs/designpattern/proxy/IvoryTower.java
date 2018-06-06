package com.chirs.designpattern.proxy;

import com.chirs.designpattern.utils.PrintUtil;

public class IvoryTower implements WizardTower {
    @Override
    public void enter(Wizard wizard) {
        PrintUtil.print(wizard + " is enter the tower");
    }
}
