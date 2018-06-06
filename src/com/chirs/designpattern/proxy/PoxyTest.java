package com.chirs.designpattern.proxy;

public class PoxyTest {
    public static void main(String[] args) {
        WizardTower tower = new IvoryTower();
        WizardTower towerProxy = new WizardTowerProxy(tower);

        towerProxy.enter(new Wizard("Chris"));
        towerProxy.enter(new Wizard("Shiny"));
        towerProxy.enter(new Wizard("Som"));
        towerProxy.enter(new Wizard("Devin"));
    }
}
