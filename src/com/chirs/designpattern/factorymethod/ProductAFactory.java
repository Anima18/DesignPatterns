package com.chirs.designpattern.factorymethod;

import com.chirs.designpattern.simplefactory.Product;
import com.chirs.designpattern.simplefactory.ProductA;

/**
 * Created by Admin on 2018/5/9.
 */
public class ProductAFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
