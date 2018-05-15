package com.chirs.designpattern.factorymethod;

import com.chirs.designpattern.simplefactory.Product;

/**
 * Created by Admin on 2018/5/9.
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        Product productA = new ProductAFactory().createProduct();
        productA.show();

        Product productB = new ProductBFactory().createProduct();
        productB.show();
    }
}
