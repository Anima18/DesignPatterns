package com.chirs.designpattern.proxy;

import com.chirs.designpattern.utils.PrintUtil;

public class WizardTowerProxy implements WizardTower {

    private static final int MAX_WIZARD_NUMBER = 3;

    private WizardTower tower;
    private int number = 0;

    public WizardTowerProxy(WizardTower tower) {
        this.tower = tower;
    }

    @Override
    public void enter(Wizard wizard) {
        if(number < MAX_WIZARD_NUMBER) {
            tower.enter(wizard);
            number++;
        }else {
            PrintUtil.print("Sorry "+wizard+", the tower is full");
        }
    }
}
