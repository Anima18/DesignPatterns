package com.chirs.designpattern.builder;

/**
 * Created by Admin on 2018/5/15.
 */
public class BuilderTest {
    public static void main(String[] args) {
        Hero hero = new Hero.Builder("Hero", "SuperMan")
                .withHairType("slicked-back")
                .withHairColor("black")
                .withArmor("test")
                .withWeapon("guns")
                .build();
    }
}
