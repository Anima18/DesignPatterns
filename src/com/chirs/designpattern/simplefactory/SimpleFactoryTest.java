package com.chirs.designpattern.simplefactory;

/**
 * Created by Admin on 2018/5/9.
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Product productA = SimpleFactory.create("A");
        productA.show();

        Product productB = SimpleFactory.create("B");
        productB.show();
    }
}
