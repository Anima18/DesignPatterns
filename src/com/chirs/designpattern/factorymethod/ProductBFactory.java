package com.chirs.designpattern.factorymethod;

import com.chirs.designpattern.simplefactory.Product;
import com.chirs.designpattern.simplefactory.ProductA;
import com.chirs.designpattern.simplefactory.ProductB;

/**
 * Created by Admin on 2018/5/9.
 */
public class ProductBFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
